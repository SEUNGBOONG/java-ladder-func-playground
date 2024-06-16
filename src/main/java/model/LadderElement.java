package model;

public enum LadderElement {
    COLUMN("|"),
    ROW("-".repeat(5));

    private final String symbol;

    public String getSymbol() {
        return symbol;
    }

    LadderElement(final String symbol) {
        this.symbol = symbol;
    }
}
