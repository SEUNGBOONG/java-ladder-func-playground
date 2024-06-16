package model;

public class WinningLadder {

    private int COUNT = 0;
    private boolean isResult;
    private int rightPoint;
    private int leftPoint;

    public WinningLadder(final boolean isResult) {
        this.isResult = isResult;
    }

    public int getLeftPoint() {
        return leftPointResult(isResult);
    }

    public int getRightPoint() {
        return rightPointResult(isResult);
    }

    private int rightPointResult(boolean isResult) {
        if (isResult) {
            COUNT++;
        }
        return COUNT;
    }

    private int leftPointResult(boolean isResult) {
        if (!isResult) {
            exceptionLimitLeft();
            COUNT--;
        }
        return COUNT;
    }

    private void exceptionLimitLeft() {
        if (COUNT <= 0) {
            throw new IllegalArgumentException();
        }
    }
}
