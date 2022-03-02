package task6.Abstract;

public class ChairFactory implements AbstractChairFactory{
    public VictorianChair createVictorianChair(int age){
        return new VictorianChair(age);
    }
    public MagicianChair createMagicianChair(){
        return new MagicianChair();
    }

    public FunctionalChair createFunctionalChair(){
        return new FunctionalChair();
    }
}