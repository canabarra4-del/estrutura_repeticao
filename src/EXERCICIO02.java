import java.util.Scanner;

public class EXERCICIO02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contador = 0, numero, resutado;
        int resposta = 1;

        while (resposta == 1) {

            System.out.println("Digite o numero da tabada que você deseja: ");
            numero = sc.nextInt();
            contador = 0;
            while (contador <= 10) {
                resutado = numero * contador;
                System.out.println(numero + " X " + " = " + resutado);
                contador = contador + 1;

            }
            System.out.println("digite 1 para nova tabuada ou 0 para finalizar");
            resposta= sc.nextInt();
        }
    }
}
