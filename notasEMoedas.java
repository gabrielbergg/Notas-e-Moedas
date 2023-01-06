import java.util.Scanner;

public class notasEMoedas {

    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in, "CP850"); 
        double valor, a = 0;
        int cont100 = 0, cont50 = 0, cont20 = 0, cont10 = 0, cont5 = 0, cont2 = 0, cont1 = 0, cont050 = 0, cont025 = 0, cont010 = 0, cont005 = 0, cont001 = 0;
        

        System.out.print("Digite o valor: "); 
        valor = leia.nextDouble();
        a = valor;
        
        for (int i = 0; i >= 0; i++ ) {

            if (a < 100) {
                i = -9;
            }
            else {
                a = a - 100;
                cont100++;
            }
        }


        for (int i = 0; i >= 0; i++) {
            if (a < 50) {
                i = -9;
            }
            else {
                a = a - 50;
                cont50++;
            }
        }

        for (int i = 0; i >= 0; i++ ) {

            if (a < 20) {
                i = -9;
            }
            else {
                a = a - 20;
                cont20++;
            }
        }

        for (int i = 0; i >= 0; i++ ) {

            if (a < 10) {
                i = -9;
            }
            else {
                a = a - 10;
                cont10++;
            }
        }

        for (int i = 0; i >= 0; i++ ) {

            if (a < 5) {
                i = -9;
            }
            else {
                a = a - 5;
                cont5++;
            }
        }

        for (int i = 0; i >= 0; i++ ) {

            if (a < 2) {
                i = -9;
            }
            else {
                a = a - 2;
                cont2++;
            }
        }

        for (int i = 0; i >= 0; i++ ) {

            if (a < 1) {
                i = -9;
            }
            else {
                a = a - 1;
                cont1++;
            }
        }

        for (int i = 0; i >= 0; i++ ) {

            if (a < 0.50) {
                i = -9;
            }
            else {
                a = a - 0.50;
                cont050++;
            }
        }

        for (int i = 0; i >= 0; i++ ) {

            if (a < 0.25) {
                i = -9;
            }
            else {
                a = a - 0.25;
                cont025++;
            }
        }

        for (int i = 0; i >= 0; i++ ) {

            if (a < 0.10) {
                i = -9;
            }
            else {
                a = a - 0.10;
                cont010++;
            }
        }

        for (int i = 0; i >= 0; i++ ) {

            if (a < 0.05) {
                i = -9;
            }
            else {
                a = a - 0.05;
                cont005++;
            }
        }

        for (int i = 0; i >= 0; i++ ) {

            if (a <= 0) {
                i = -9;
            }
            else {
                a = a - 0.01;
                cont001++;
            }
        }


        System.out.println("Notas:");
        System.out.println(cont100+" nota(s) de R$ 100.00");
        System.out.println(cont50+" nota(s) de R$ 50.00");
        System.out.println(cont20+" nota(s) de R$ 20.00");
        System.out.println(cont10+" nota(s) de R$ 10.00");
        System.out.println(cont5+" nota(s) de R$ 5.00");
        System.out.println(cont2+" nota(s) de R$ 2.00");
        System.out.println("Moedas: ");
        System.out.println(cont1+" moeda(s) de R$ 1.00");
        System.out.println(cont050+" moeda(s) de R$ 0.50");
        System.out.println(cont025+" moeda(s) de R$ 0.25");
        System.out.println(cont010+" moeda(s) de R$ 0.10");
        System.out.println(cont005+" moeda(s) de R$ 0.05");
        System.out.println(cont001+" moeda(s) de R$ 0.01");
    


        leia.close();
    }
  
}
