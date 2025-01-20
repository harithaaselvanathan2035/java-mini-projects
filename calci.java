import java.util.Scanner;
class calci{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice: ");
        System.out.println(" 1. Add\n 2. Sub\n 3. Multiply\n 4. Divide\n");
        System.out.println("choose operator: ");
        int operator = sc.nextInt();
       System.out.println("enter element 1: ");
       int n1 = sc.nextInt();
       System.out.println("enter element 2: ");
       int n2 = sc.nextInt();

       int res =0;
       switch (operator) {
           case 1 -> res = n1+n2;
           case 2 -> res = n1 - n2;
           case 3 -> res = n1*n2;
            case 4 -> res = n1/n2;
           default -> {
               System.out.println("unknown operators");
            }
       }
       System.out.println("the result is: " + res);

    }
}