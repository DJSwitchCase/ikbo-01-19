public class Laba4Planets implements Nameable{
    String Name;
    int PlanetSize;

    public Laba4Planets(String name) {
        Name = name;
    }

    public int getPlanetSize() {
        return PlanetSize;
    }

    public void setPlanetSize(int planetSize) {
        PlanetSize = planetSize;
    }

    public void setName(String name) {
        Name = name;
    }
    public String getName() {
        return Name;
    }
}
