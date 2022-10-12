package handsonActivity;
public class Calculator{
    
    char operator;
    double num1;
    double num2;
    public double calculate(double num1,double num2) {
    
    switch (operator){
        case '+':
            double sum = num1+num2;
            System.out.println("The sum is: "+ sum);
            System.out.println(num1+" + "+num2+" = "+sum);
            break;
        case '-':
            double difference = num1-num2;
            System.out.println("The difference is: "+ difference);
            System.out.println(num1+" - "+num2+" = "+difference);
            break;
        case '*':
            double product = num1*num2;
            System.out.println("The product is: "+ product);
            System.out.println(num1+" x "+num2+" = "+product);
            break;
        case '/':
            double qoutient = num1/num2;
            System.out.println("The qoutient is: "+ qoutient);
            System.out.println(num1+" / "+num2+" = "+qoutient);
            break;
         default:
        System.out.println("Invalid Operator Input");
        
        
    }
    return operator;
    
    }}