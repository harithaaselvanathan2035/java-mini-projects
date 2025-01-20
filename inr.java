
import java.util.Scanner;

class rupee{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("available currency conversion :\n 1. chinese yuan = 0.085\n 2. canadian dollar = 0.017\n 3. Euro = 0.011\n 4. japanese yen = 1.80\n 5. pakistani rupee = 3.22\n 6. singapore dollar = 0.016\n 7. US dollar = 0.012\n 8. south korean won = 16.69");
        System.out.println("enter your choice: ");
        int con = sc.nextInt();
        System.out.println("enter the indian rupee to convert: ");
        float money = sc.nextFloat();
       float convert = 0;

       switch (con){
           case 1 -> convert = (float) (money * 0.085);
           case 2 -> convert = (float) (money * 0.017);
           case 3 -> convert = (float) (money * 0.011);
           case 4 -> convert = (float) (money * 1.80);
           case 5 -> convert = (float) (money * 3.22);
           case 6 -> convert = (float) (money * 0.016);
           case 7 -> convert = (float) (money * 0.012);
           case 8 -> convert = (float) (money * 16.69);
           default -> {
            System.out.println("You choosed unavailable corrency!");
           }

       }
      System.out.println("converted indian rupee " + money + " : " + convert);
           
       }
    }
