import java.security.SecureRandom;

public class App {
    public static void main(String[] args) {
        Integer MatrizOriginal[][] = new Integer[3][2];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                MatrizOriginal[i][j] = new SecureRandom().nextInt(10);
            }
        }
        System.out.println("Matriz Original: ");
        printarMatriz(MatrizOriginal);


        System.out.println(" Matriz Transposta: ");
        transparMatriz(MatrizOriginal);

       

        System.out.println();
    }

    public static void printarMatriz(Integer Matriz[][]) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(" " + Matriz[i][j]);
            }
            System.out.print("\n");
        }
    }

    public static void printarMatrizTransposta(Integer Matriz[][]) {

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + Matriz[i][j]);
            }
            System.out.print("\n");
        }
    }

    public static void transparMatriz(Integer MatrizOriginal[][]) {

        Integer MatrizTransposta[][] = new Integer[2][3];

        for (int i = 0; i < 3; i++) {
           
            for (int j = 0; j < 2; j++) {
                if (MatrizOriginal[i][j] == MatrizOriginal[0][0]) {
                    MatrizTransposta[0][0] = MatrizOriginal[i][j];

                } else if (MatrizOriginal[i][j] == MatrizOriginal[1][0]) {
                    MatrizTransposta[0][1] = MatrizOriginal[i][j];
                    
                } else if (MatrizOriginal[i][j] == MatrizOriginal[2][0]) {
                    MatrizTransposta[0][2] = MatrizOriginal[i][j];

                } else if (MatrizOriginal[i][j] == MatrizOriginal[0][1]) {
                    MatrizTransposta[1][0] = MatrizOriginal[i][j];

                } else if (MatrizOriginal[i][j] == MatrizOriginal[1][1]) {
                    MatrizTransposta[1][1] = MatrizOriginal[i][j];

                } else if (MatrizOriginal[i][j] == MatrizOriginal[2][1]) {
                    MatrizTransposta[1][2] = MatrizOriginal[i][j];

                }
            }

        }

        printarMatrizTransposta(MatrizTransposta);
    }
}