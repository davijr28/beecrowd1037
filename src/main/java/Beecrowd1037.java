import java.util.Scanner;

public class Beecrowd1037 {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner leitor = new Scanner(System.in);
        //declarar variável
        float number;

        //ler variável
        number = leitor.nextFloat();

        //verificar qual o intervalo do número e mostrar resultado no console
        if (number >= 0 && number <= 50) {
            if (number <= 25) {
                System.out.println("Intervalo [0,25]");
            } else {
                System.out.println("Intervalo (25,50]");
            }
        } else if (number > 50 && number <= 100) {
            if (number < 75) {
                System.out.println("Intervalo (50,75]");
            } else {
                System.out.println("Intervalo (75,100]");
            }
        } else {
            System.out.println("Fora de intervalo");
        }
    }
}
