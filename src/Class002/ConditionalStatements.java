package Class002;

public class ConditionalStatements {
//to decide among several alternatives else if
    public static void main(String[] args) {
     String browserName="ies";
         switch(browserName){

             case "chrome":
                 System.out.println("execute in chrome browser");
                 break;
             case "firefox":
                 System.out.println("execute in firefox browser");
                 break;
             case "safari":
                 System.out.println("execute in safari browser");
                 break;
             case "ie":
                 System.out.println("execute in ie browser");
                 break;
             default:
                 System.out.println("invalid browser is selected by user");
         }

    }
}
