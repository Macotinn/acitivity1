package macotinactivity1;

import java.util.Scanner;

public class MACOTINactivity1 {

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter Your Last Name: ");
        String LName = scn.nextLine();

        System.out.println("Enter Your First Name:");
        String FName = scn.nextLine();

        System.out.println("Enter Your Middle Name:");
        String MInitial = scn.nextLine();

        System.out.println("Enter Your Age:");
        String Age = scn.nextLine();

        System.out.println("Enter Your Gender: ");
        String Gender = scn.nextLine();

        System.out.println("Birthdate (MM/DAY/YYYY)");
        String Birthdate = scn.nextLine();

        
System.out.println("Last Name:" + LName);
System.out.println("First Name: " + FName); 
System.out.println("Middle Initial: " + MInitial);
System.out.println("Age: " + Age); 
System.out.println("Gender: " + Gender);
System.out.println("Birthday:" + Birthdate);

scn.close();
    }
}
