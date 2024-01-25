//2. Create a currency converter between CLP, ARS, USD, EUR, TRY, GBP with the following features:
//* 		The user must choose their initial currency and the currency they want to exchange to.
//* 		The user can choose whether or not to withdraw their funds. If they choose not to withdraw, it should return to the main menu.
//* 		If the user decides to withdraw the funds, the system will charge a 1% commission.
//* 		Set a minimum and maximum amount for each currency, it can be of your choice.
//* 		The system should ask the user if they want to perform another operation. If they choose to do so, it should restart the process; otherwise, the system should close.

import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        String salida;
        do {

            System.out.println("Select initial currency");
            printAvailableCurrency();
            Integer initialCurrency = in.nextInt();

            System.out.println("Select convert currency");
            printAvailableCurrency();
            Integer convertCurrency = in.nextInt();

            System.out.println("Insert the quantity to convert");
            Integer amount = in.nextInt();


            float valueInitialCurrency = getAvailableCurrency(initialCurrency);
            float valueConvertCurrency = getAvailableCurrency(convertCurrency);

            System.out.println(convert(amount,valueInitialCurrency,valueConvertCurrency));

            System.out.println("Desea salir?");
            salida = in.nextLine();

        } while (salida.equals("Y") || salida.equals("y"));
    }

    public static void printAvailableCurrency() {
        StringBuilder curr = new StringBuilder();
        curr.append("1. CLP \n");
        curr.append("2. ARS \n");
        curr.append("3. USD \n");
        curr.append("4. EUR \n");
        curr.append("5. TRY \n");
        curr.append("6. GBP");
        System.out.println(curr.toString());
    }

    public static float getAvailableCurrency(int option) {
        return switch (option) {
            case 1 -> Currency.CLP.value;
            case 2 -> Currency.ARS.value;
            case 3 -> Currency.USD.value;
            case 4 -> Currency.EUR.value;
            case 5 -> Currency.TRY.value;
            case 6 -> Currency.GBP.value;
            default -> 0f;
        };
    }

    public static float convert (float valor, float cvalor1, float cvalor2) {
        float constanteDeCambio = (1/cvalor2) / (1/cvalor1);
        return valor * constanteDeCambio;
    }


}


