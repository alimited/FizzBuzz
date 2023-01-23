import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //call scanner function
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = in.nextInt();

        for (int i = 1; i <=n; i++) {
            boolean d3 = (i%3==0);
            boolean d5 = (i%5==0);

            if (d3 && d5) {
                System.out.println("Fizzbuzz!");
            } else if (d3) {
                System.out.println("Fizz");
            } else if (d5) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
