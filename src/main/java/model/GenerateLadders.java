package model;

public class GenerateLadders implements GenerateLadder {
    @Override
    public Ladder generate(final int height, final int width) {
        return Ladder.of(height, width);
    }
}
