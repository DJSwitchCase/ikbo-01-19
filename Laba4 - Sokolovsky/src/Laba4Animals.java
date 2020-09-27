public class Laba4Animals implements Nameable{
    String Name;
    int Animalsnumber;

    public Laba4Animals(String name) {
        Name = name;
    }

    public int getAnimalsnumber() {
        return Animalsnumber;
    }

    public void setAnimalsnumber(int animalsnumber) {
        Animalsnumber = animalsnumber;
    }

    public void setName(String name) {
        Name = name;
    }
    public String getName() {
        return Name;
    }
}