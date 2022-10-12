package handsonActivity;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner scan= new Scanner (System.in);
       int i=0; 
  while (i<5) {      
        Calculator solve = new Calculator();
       System.out.println("\nPlease choose an operator: +-*/");
       solve.operator= scan.next().charAt(0);
      
        System.out.println("Enter the first number: ");
        solve.num1= scan.nextDouble();
        
        System.out.println("Enter the second number: ");
        solve.num2= scan.nextDouble();
      
        solve.calculate(solve.num1,solve.num2);
      i++;  
  }
    }
    
}
