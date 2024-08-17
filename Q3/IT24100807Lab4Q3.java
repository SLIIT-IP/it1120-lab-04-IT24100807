import java.util.Scanner;

public class IT24100807Lab4Q3{
    public static void main (String[]args){
        
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number=scanner.nextInt();
        
        String result=(number>0) ?"The number is positive." :
          (number<0) ? "The number is negative." :
          "The number is zero.";
System.out.println(result);
    }
}