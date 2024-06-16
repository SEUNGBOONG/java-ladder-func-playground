package model;

public class Height {

    private static final int EXCEPTION_NUMBER = 0;
    private static final String EXCEPTION_HANDLING = "예외 처리";

    private final int height;

    public static Height from(final int height) {
        if (height <= EXCEPTION_NUMBER) {
            throw new IllegalArgumentException(EXCEPTION_HANDLING);
        }
        return new Height(height);
    }

    public int getHeight() {
        return height;
    }

    private Height(final int height) {
        this.height = height;
    }
}
