package RoundRadiusPackage.RoundCounter;

public abstract class CountRoundImplementation implements CountRound {
    protected float radius;

    public CountRoundImplementation(float radius) {
        this.radius = radius;
    }

    @Override
    public float countLength() {
        return (float)Math.PI * (float)Math.pow((double)radius, 2);
    }

    @Override
    public float countSquare() {
        return (float)Math.PI * 2 * this.radius;
    }

    @Override
    public abstract void squareOutput();

    @Override
    public abstract void lengthOutput();

    @Override
    public abstract void fullOutput();

    @Override
    public abstract void radiusOutput();
}
