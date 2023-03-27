import java.util.Locale;
import java.util.Scanner;

public class Matrix1 {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner tec = new Scanner(System.in);

        System.out.printf("Enter the size of the matrix: ");
        int size = Integer.parseInt(tec.nextLine());

        int[][] matriz = new int[size][size];

        int cont = 0;
        for (int i=0; i < matriz.length; i++){
            for (int j=0; j < matriz[i].length; j++){
                matriz[i][j] = tec.nextInt();

                if (matriz[i][j] < 0){
                    cont ++;
                }
            }
        }

        System.out.println("Main diagonal: ");
        for (int i=0; i<matriz.length; i++){
            System.out.print(matriz[i][i] + " ");
        }

        System.out.printf("%nNegative numbers: %d", cont);

        tec.close();
    }
}
