package Class2;

public class StringConcatenation {
    public static void main(String[] args) {
        String value1="Java is Programming Language";
        String value2="100";
        String value3="java";
        String value4="500";
        int value5=100;
        int value6=200;
        int addition=value5+value6;
        System.out.println(value1);
        System.out.println(value1+value3);
        //String+String ====> concatenation will append together
        System.out.println(value2+value4);
        //String+String ====> concatenation will append together
        System.out.println(value2+value6);
        //String+Integer ===> concatenation will append together
        System.out.println(value5+value6);
        //integer+integer =====> addition
        System.out.println("addition of two number: "+ addition);

    }
}
