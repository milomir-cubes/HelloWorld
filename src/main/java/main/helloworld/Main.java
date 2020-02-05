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
        
        // 0-5 -> Baby
        // 6-11 -> Kid
        // 12-17 -> Teen
        // 18 - 150  -> Adult
        // other -> Invalid
        
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
        
        
        System.out.print("Unesiti redni broj dana u nedelji (1-7): ");
        Scanner input3 = new Scanner(System.in);
        int dayNumber = input3.nextInt();
        
        String day;

        switch (dayNumber) {
           case 1:
             day = "Ponedeljak";
             break;
           case 2:
             day = "Utorak";
             break;
           case 3:
             day = "Sreda";
             break;
           case 4:
             day = "Četvrtak";
             break;
           case 5:
             day = "Petak";
             break;
           case 6:
             day = "Subota";
             break;
           case 7:
             day = "Nedelja";
             break;
           default: 
             day = "Netačan unos";
             break;
        }
        System.out.println(day);
    
    }
}
