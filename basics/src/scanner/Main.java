package scanner;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter year of birth = " );
    
    boolean hasNextInt = scanner.hasNextInt();
    
    if(hasNextInt) {
      int yearOfBirth = scanner.nextInt();
      scanner.nextLine();
      
      System.out.println("Enter your name = ");
      String name = scanner.nextLine();
      int age = 2019 - yearOfBirth;
     
      if(age >= 0 && age <= 100) {
        System.out.println("Hello " +name+ ", you are " +age+ " years old.");
      }else {
        System.out.println("Invalid year of birth");
      }
    } else {
      System.out.println("Unable to parse year of birth");
    }
    
    scanner.close();
  }

}
