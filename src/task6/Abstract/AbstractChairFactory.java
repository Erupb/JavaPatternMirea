package task6.Abstract;

public interface AbstractChairFactory {
    public VictorianChair createVictorianChair(int age);
    public MagicianChair createMagicianChair();
    public FunctionalChair createFunctionalChair();
}