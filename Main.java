import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        //Mini Project
        Scanner sc = new Scanner(System.in);
        int myNumber = (int)(Math.random()*100);
        int userNumber = 0;

        do{
            System.out.println("Guess a number (1-100) : ");
            userNumber = sc.nextInt();
           
            if(userNumber == myNumber){
                System.out.println("WOW! You guessed it right!");
                break;

            }else if(userNumber > myNumber){
                System.out.println("Your number is too large");
            }else{
                System.out.println("Your number is too small");
            }
         System.out.println(" ");
         System.out.println("Enter a negative number to quit !!");
        }while(userNumber>=0);
        
        System.out.println(" ");
        System.out.println("My Number was : ");
        System.out.println(myNumber);
    }

}