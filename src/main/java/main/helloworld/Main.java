package main.helloworld;

import java.util.Scanner;

/**
 *
 * @author qa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        System.out.println("Hello World!");
//        System.out.println("Milomir");
//        
//        int age = 5;
//        
//        if (age > 18) {
//            System.out.println("Osoba je punoletna.");
//        } else {
//            System.out.println("Osoba je maloletna.");
//        }
        
        System.out.println("-------------------------------------------------");
        
//        System.out.print("Unesite broj godina: ");
//        Scanner input = new Scanner(System.in);
//        int userAge = input.nextInt();
//        
//        System.out.println("Korisnik je uneo: " + userAge);
//        
//        if (userAge >= 18) {
//            System.out.println("Osoba je punoletna.");
//        } else {
//            System.out.println("Osoba je maloletna.");
//        }
        
        System.out.println("-------------------------------------------------");
        
        System.out.print("Unesite broj godina: ");
        Scanner input2 = new Scanner(System.in);
        int personAge = input2.nextInt();
        
        if (personAge <=0 && personAge > 150) {
            System.out.println("Invalid");
        } else if (personAge <= 5) {
            System.out.println("Baby");
        } else if (personAge <= 11) {
            System.out.println("Kid");
        } else if (personAge <= 17) {
            System.out.println("Teen");
        } else if (personAge >= 18) {
            System.out.println("Adult");
        } 
        
        // 0-5 -> Baby
        // 6-11 -> Kid
        // 12-17 -> Teen
        // 18 - 150  -> Adult
        // other -> Invalid
        
        
        // TO DO switch 
        
    }
    
}
