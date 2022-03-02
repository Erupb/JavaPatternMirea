package task6.Abstract;

public class Client {
    Chair chair;

    void sit(){
        System.out.println("Sitting...");
    };

    public void setChair(Chair chair) {
        this.chair = chair;
    }

    public static void main(String[] args) {
        ChairFactory test = new ChairFactory();
        Client client = new Client();

        client.setChair(test.createVictorianChair(5));
        System.out.println(((VictorianChair)client.chair).getAge());

        client.setChair(test.createFunctionalChair());
        System.out.println(((FunctionalChair)client.chair).sum(5, 10));

        client.setChair(test.createMagicianChair());
        ((MagicianChair)client.chair).doMagic();
    }
}
