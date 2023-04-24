package Class002;

import java.util.Scanner;

public class ScannerConcept {

    public static void main(String[] args) {
//java program execution will starts from the main method
        Scanner input= new Scanner(System.in);
        System.out.println("please enter full name of the person ");
       //if we wants to take complete line from the user we  should use the nextLine method
        String name=    input.nextLine();
        System.out.println(name);
    }
}
