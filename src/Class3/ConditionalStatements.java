package Class3;

public class ConditionalStatements {
//without break statement
    public static void main(String[] args) {

         String browserName="edgeBrowser";

            switch(browserName){
                case "chrome":
                    System.out.println("execution should happen in the chrome browser");
                   break;
                case "firefox":
                    System.out.println("execution should happen in the firefox browser");
                   break;
                case "safari":
                    System.out.println("execution should happen in the safari browser");
                   break;
                case "ie":
                    System.out.println("execution should happen in the ie browser");
                    break;

                default:
                    System.out.println("invalid browser selected by user ");
            }
    }
}