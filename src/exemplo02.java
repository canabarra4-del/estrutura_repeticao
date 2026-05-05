import java.util.Scanner;

public class exemplo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);


        int inicio,fim;

        System.out.println("Digite o valor de inicio ");
        inicio= sc.nextInt();
        System.out.println("Digite o valor final ");
        fim= sc.nextInt();

        while (inicio <= fim) {
            System.out.println(inicio + " ");
            inicio = inicio + 1;
        }
    }
}
