import java.util.Random;
import java.util.Scanner;
class game{
  public static void guessNum(){
     Random rand = new Random();
     int num = rand.nextInt(10);
    Scanner sc = new Scanner(System.in);
     int k = 5; 
     int guess = 0;
     int i;
     System.out.println(" Welcome to guess the number game\n you have 5 chances to find the correct number\n let's begin!!");
   for( i=0; i<=k; i++){
          
          System.out.println("guess the number: ");
          guess = sc.nextInt();
   

          if(num == guess){
            System.out.println("congradulations!! you have guessed number correctly!1");
            break;
          }
          else if(num > guess && i!=k-1){
            System.out.println("The number is greater than " + guess);
          }
          else if(num < guess && i!=k-1){
            System.out.println("The number is smaller than " + guess);
          }
   }
   if(i == k){
    System.out.println("Your limit is finished!!\n better luck next time");

   System.out.println("the number was " + guess);
   }
   }
   public static void main(String[] args) {
       guessNum();
   }
   
}