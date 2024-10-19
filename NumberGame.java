import java.util.Random;
import java.util.Scanner;
public class NumberGame{
    public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
 Random rdm=new Random();
 int max=100;
 int min=1;
 int guessnumber=rdm.nextInt(1,101);
 int attempts=0;
 int maxattempts=10;
 System.out.println("WELCOME TO THE NUMBER GUESSING GAME !");
 while(attempts<maxattempts){
    System.out.println("Enter your Guess Number from 1 to 100");
    int Usernum= sc.nextInt();
    attempts++;
    if(Usernum == guessnumber){
        System.out.println("CONGRATULATION ! YOU WIN.\nYOU HAVE GUESSED THE CORREECT NUMBER IN "+attempts+"ATTEMPTS");
        break;
    }
    if(Usernum < guessnumber){
        System.out.println("NOPE ! THE NUMBER IS LOWER.PLEASE GUESS AGAIN");
    }
    else {
        System.out.println("NOPE ! THE NUMBER IS HIGhER.PLEASE GUESS AGAIN");
    }
 }
 if(attempts==maxattempts){
    System.out.println("SORRY! YOU HAVE REACHED THE MAXIMUM NUMBER OF ATTEMPTS.\nTHE CORRECT NUMBER WAS:"+guessnumber);
 }
 System.out.println("GAME IS OVER !");
    }
}