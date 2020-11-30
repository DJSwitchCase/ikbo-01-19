 public class Zadanie5 {
        public void getDetails(String key) {
            try {
                if (key == null) {
                    throw new NullPointerException("Nulllll");
                }
            }
            catch (NullPointerException e){
                System.out.println("EEEEEEEEEE");
            }
            }
// do something with the key
     public static void main(String[] args) {
         Zadanie5 privet = new Zadanie5();
            privet.getDetails(null);
     }
    }
