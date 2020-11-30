public class Zadanie51 {
    public void printMessage(String key)
    {
        String message = getDetails(key);
        System.out.print( message );
    }
    public String getDetails(String key)
    {
        try {
            if (key == null) {
                throw new NullPointerException("null key in getDetails");
            }
            return(key);
        }
        catch (NullPointerException e)
        {
          return("Нельзя вводить null!");
        }
    }

    public static void main(String[] args) {
        Zadanie51 e = new Zadanie51();
        e.printMessage("ads");
    }
}
