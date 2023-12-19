import java.util.Scanner;

class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        System.out.println("Enter power :");
        int pow = sc.nextInt();
        double result = Math.pow(num, pow);
        System.out.println(result);
    }
}