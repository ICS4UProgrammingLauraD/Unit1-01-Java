import java.util.Scanner;  // Import the Scanner class

class Main {
  public static void main(String[] args) {

      Scanner input = new Scanner(System.in);

      double truckSize = 1100;
      
      System.out.print("Enter the length of logs:");
      double length = input.nextInt();
      double amount = truckSize/20*length;
      System.out.println("The log size you entered is " + amount);

      // close scanner object
  }
}

