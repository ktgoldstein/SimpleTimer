public enum TimeUnit {
    /**
     * Assigning numeric value to this enum.
     */
    MILLI(1000000L), SECONDS(1000000000L);

    private double value;

    TimeUnit(long n) {
        this.value = n;
    }

    public double value() {
        return this.value;
    }
}