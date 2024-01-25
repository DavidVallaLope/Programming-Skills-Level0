public enum Currency {
    CLP(0.00025f,"CLP"),
    ARS(0.0012f,"ARS"),
    USD(1.0f,"USD"),
    EUR(1.09f,"EUR"),
    TRY(0.033f,"TRY"),
    GBP(1.27f,"GBP");

    final float value;
    final String name;

    Currency(float value, String name) {
        this.value = value;
        this.name = name;
    }
}
