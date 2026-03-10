import java.io.IOException;
import java.util.Scanner;

public class TempoJogo{
    public static void main(String[] args) throws IOException{

        int init, end;
        String valores;
        String[] valoresArray;

        Scanner in = new Scanner(System.in);

        valores = in.nextLine();
        valoresArray = valores.trim().split("\\s+");

        init = Integer.parseInt(valoresArray[0]);
        end = Integer.parseInt(valoresArray[1]);

        //Caso termine no mesmo dia
        if(end == init){
            System.out.println("O JOGO DUROU 24 HORA (S)");
        }
        else if (end < init){
           System.out.println("O JOGO DUROU " + Math.abs((init - end)- 24) + " HORA (S)");
        }
        else{
            System.out.println("O JOGO DUROU " + (end - init) + " HORA (S)");
        }


    }
}