import java.util.Scanner;

public class SomarJava 
{
    public static void main (String[] args)
    {

        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;

        System.out.println("Digite o primeiro numero: ");
        num1 = sc.nextInt();
        System.out.println("Digite o segundo numero: ");
        num2 = sc.nextInt();

        System.out.println("Soma: " + (num1+num2));
        sc.close();
    }
}
