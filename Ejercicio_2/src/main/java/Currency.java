public enum Currency {
    CLP(0.00025f),
    ARS(0.0012f),
    USD(1.0f),
    EUR(1.09f),
    TRY(0.033f),
    GBP(1.27f);

    final float value;

    private Currency(float value) {
        this.value = value;
    }
}
