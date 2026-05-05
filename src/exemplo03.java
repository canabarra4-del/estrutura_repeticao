import java.util.Scanner;

public class exemplo03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int inicio, fim;
        System.out.println("digite o valor de ínicio");
        inicio = sc.nextInt();
        System.out.println("digite o valor de ínicio");
        fim = sc.nextInt();

        if (inicio % 2 == 0){
            inicio=inicio + 1;
        }
        else {
            inicio = inicio;
        }

            while (inicio <=fim) {
                System.out.print( inicio + " ");
                inicio = inicio + 2;

        }
    }
}
