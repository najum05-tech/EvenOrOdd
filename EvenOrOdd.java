import java.util.Scanner;
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number1 = input.nextInt();
        if (number1%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }

    }
}