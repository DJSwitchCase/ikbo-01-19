package practice10;

public interface AbstractChairFactory {
    VictorianChair CreateVictorianChair(int age);
    FunctionalChair CreateFunctionalChair();
    MagicChair CreateMagicChair();
}
