package practice10;

public class ChairFactory implements AbstractChairFactory{
    @Override
    public MagicChair CreateMagicChair() {
        return new MagicChair();
    }

    @Override
    public FunctionalChair CreateFunctionalChair() {
        return new FunctionalChair();
    }

    @Override
    public VictorianChair CreateVictorianChair(int age) {
        return new VictorianChair(age);
    }
}
