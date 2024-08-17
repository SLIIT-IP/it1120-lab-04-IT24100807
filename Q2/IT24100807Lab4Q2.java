import java.util.Scanner;

public class IT24100807Lab4Q2 {
    public static void main(String[]args){

     int exam,lab,exam1,lab1,sum1,sum2;
     boolean sum;
     double total;

     Scanner input = new Scanner(System.in);

     System.out.print("Please enter exam marks (out of 100): ");
     exam=input.nextInt();
     if(exam>=0 && exam<=100){
     }else {
     System.out.println("Invalid input for exam marks.Terminating program");
     input.nextInt();
     }

     System.out.print("please enter lab submission marks(out of 100): ");
     lab=input.nextInt();
     if (lab>=0 && lab<=100){
     }else{
     System.out.println("Invalid input exam marks.Terminating program");
     input.nextInt();
     }
     System.out.print("please enter the percentage given for the exam: ");
     exam1=input.nextInt();
     System.out.print("please enter the percentage given for the lab submissio: ");
     lab1=input.nextInt();

     if (sum=(lab1+exam1==100)){
     }
     else {
     System.out.println("The percentages must add up to 100.Terminating program");
     input.nextInt();
     }
     sum1=exam*exam1/100;
     sum2=lab*lab1/100;
     total=sum1+sum2;
     System.out.println("Final exam mark is: "+total);
   }
}