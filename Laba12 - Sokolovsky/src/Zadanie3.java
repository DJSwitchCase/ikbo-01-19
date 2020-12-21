
import java.util.regex.Matcher;
import java.util.regex.Pattern;

    public class Zadanie3 {
        public static void main(String[] args) {
            Pattern pattern = Pattern.compile("([3][0-1]|[0-2][0-9])[/]([1][0-2]|[0][0-9])[/]([1][9][0-9][0-9]|[2-9][0-9][0-9][0-9])");
            String date = "01/05/2901";
            Matcher m = pattern.matcher(date);
            if (m.matches())
                System.out.println("Yes");
            else
                System.out.println("No yes");
        }


    }
