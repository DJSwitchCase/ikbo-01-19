public class Laba4Main {
    public static void main(String[] args) {
    Nameable koshka = new Laba4Animals("Kisa");
    koshka = new Laba4Planets("Mars");
    System.out.println(koshka.getName());
    /*koshka.getPlanetSize(); не работает, потому что объект класса Nameable
    не имеет доступа к объектам Laba4Planets,
    хотя его и можно инициализировать как объект Laba4Planets*/
    Laba4Animals Straus = new Laba4Animals("Straus");
    Straus.setAnimalsnumber(4);
        System.out.println(Straus.getAnimalsnumber());
        System.out.println(Straus.getName());
    }
}