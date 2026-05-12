import java.util.Scanner;

public class EXERCICIO10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cand1 = 0, cand2=0 , cand3=0;
        int voto = 1 ,  invalido=0;
        int total;
        double pc1 , pc2, pc3;

        while (voto != 0){
            System.out.println("[1] candidato 1\n" +
                    "[2] candidato 2\n" +
                    "[3] candidato 3" +
                    "[0] finalizar\n");
            voto= sc.nextInt();

            if (voto==0){
                break;
            }

            if (voto == 1){
                cand1++;
            }
            else if (voto==2){
                cand2++;

            }else if (voto==3){
                cand3++;
            }else {
                invalido++;
            }

        }
        System.out.println("candidato1 =" + cand1);
        System.out.println("candidato2 =" + cand2);
        System.out.println("candidato3 =" + cand3);
        System.out.println("invalido =" + invalido);

        //calcular total de votos
        total = cand1 + cand2 +cand3;
        pc1 = (double) cand1/total * 100;
        pc2 = (double)cand2/total * 100;
        pc3 = (double)cand3/total * 100;


        System.out.println();
        System.out.println("Total de votos = " + total);
        System.out.println("Porcentagem do candidato1 = " + pc1);
        System.out.println("Porcentagem do candidato2 = " + pc2);
        System.out.println("Porcentagem do candidato3 = " + pc3);

        if (cand1 > cand2 && cand1>cand3){
            System.out.println("Vencedor --> Candidato1");
        } else if (cand2>cand3) {
            System.out.println("Vencedor --> Candidato2");
        }else {
            System.out.println("Vencedor --> Candidato3");
        }

    }
}
