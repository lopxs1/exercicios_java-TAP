import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException{

        int a, b, c, d;
        String valores;
        String[] valoresArray;

        Scanner in = new Scanner(System.in);

        valores = in.nextLine();
        valoresArray = valores.trim().split("\\s+");

        a = Integer.parseInt(valoresArray[0]);
        b = Integer.parseInt(valoresArray[1]);
        c = Integer.parseInt(valoresArray[2]);
        d = Integer.parseInt(valoresArray[3]);

        int ab = a + b;
        int cd = c + d;
        int resto = a % 2;

        if (b > c && d > a && cd > ab && c > 0 && d > 0 && resto == 0){

            System.out.println("Valores Aceitos");
        }
        else{
            System.out.println("Valores não aceitos");
        }
    }
}