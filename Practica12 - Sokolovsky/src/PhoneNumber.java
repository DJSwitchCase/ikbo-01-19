public class PhoneNumber {

    public static String fix(String number){
        if(number.charAt(0) == '8')
            number = rusify(number);
        number = normalize(number);
        return number;
    }
    private static String rusify(String number){
        StringBuilder SBnubmer = new StringBuilder(number);
        SBnubmer.deleteCharAt(0);
        SBnubmer.insert(0,"+7");
        return SBnubmer.toString();
    }

    private static String normalize(String number){
        StringBuilder SBnumber = new StringBuilder(number);
        SBnumber.insert(number.length()-10,'-');
        SBnumber.insert(number.length()-6,'-');
        SBnumber.insert(number.length()-2,'-');
        return SBnumber.toString();
    }

}
