import java.util.Locale;
import java.util.Scanner;

public class Matrix2 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner tec = new Scanner(System.in);

        System.out.print("Enter the number of lines of the matrix: ");
        int l = tec.nextInt();
        System.out.print("Enter the number of columns of the matrix: ");
        int c = tec.nextInt();

        int[][] mat = new int[l][c];

        for (int i = 0 ; i < l ; i++){
            for (int j = 0 ; j < c ; j++){
                mat[i][j] = tec.nextInt();

            }
        }

        System.out.print("Enter a number to get the numbers around it: ");
        int x = tec.nextInt();

        for (int i = 0 ; i < mat.length ; i++){
            for (int j = 0 ; j < mat[i].length ; j++){
                if (mat[i][j] == x){

                    System.out.printf("Position %d,%d:%n", i, j);
                    
                    if(j > 0){
                        System.out.printf("left: %d%n", mat[i][j-1]);
                    }
                    
                    if(j < mat[i].length - 1)
                     System.out.printf("Right: %d%n", mat[i][j+1]);
                    
                    if (i > 0){
                        System.out.printf("Up: %d%n", mat[i-1][j]);
                    }

                    // É subtraido 1 porque .length retorna o tamanho do vetor, e não a posição, no caso
                    // Quando i estiver na 3 posição, o indice é 2, se fosse usado o 3 obtido pelo length, o i+1 sairia da matriz
                    if (i < mat.length - 1){
                        System.out.printf("Down: %d%n", mat[i+1][j]);
                    }    
                }
            }
        }

        tec.close();
        }

}
