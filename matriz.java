import java.util.Scanner;

public class matriz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=4;
        int[][] matrizA = new int[n][n];
        int[][] matrizB = new int[n][n];
        int[][] matrizSoma = new int[matrizA.length][matrizB.length];
        int[][] matrizSub = new int[matrizA.length][matrizB.length];
        int[][] matrizMult = new int[matrizA.length][matrizB.length];
        int opcao=1;

        while(opcao!=0){

            System.out.println("\n\n========= MENU =========");
            System.out.println("Somar as matrizes [1]\nsubtrair as Matrizes [2]\nMultiplicar as Matrizes [3]\nSair [0]\n> ");
            opcao = scan.nextInt();

            if(opcao>0 & opcao<=3){
                for(int i=0;i<matrizA.length;i++){
                    for(int j=0;j<matrizA.length;j++){
                        System.out.println("\n=== Matriz A ===");
                        System.out.println("Coluna ["+(i+1)+"] linha ["+(j+1)+"] valor: ");
                        matrizA[i][j] = scan.nextInt();
                    }
                }

                for(int i=0;i<matrizB.length;i++){
                    for(int j=0;j<matrizB.length;j++){
                        System.out.println("\n=== Matriz B ===");
                        System.out.println("Coluna ["+(i+1)+"] linha ["+(j+1)+"] valor: ");
                        matrizB[i][j] = scan.nextInt();
                    }
                }

                if(opcao==1){
                    for(int i=0;i<matrizA.length;i++){
                        for(int j=0;j<matrizB.length;j++){
                            matrizSoma[i][j] = matrizA[i][j] + matrizB[i][j];
                        }
                    }

                    System.out.println("\n\n==== SOMA DAS MATRIZES ====");

                    for(int i=0;i<matrizA.length;i++){
                        for(int j=0;j<matrizB.length;j++){
                            System.out.println("Coluna ["+(i+1)+"] linha ["+(j+1)+"] = "+matrizSoma[i][j]);
                        }
                    }
                }

                if(opcao==2){
                    for(int i=0;i<matrizA.length;i++){
                        for(int j=0;j<matrizB.length;j++){
                            matrizSub[i][j] = matrizA[i][j] - matrizB[i][j];
                        }
                    }
                    System.out.println("\n\n==== SUBTRACAO DAS MATRIZES ====");

                    for(int i=0;i<matrizA.length;i++){
                        for(int j=0;j<matrizB.length;j++){
                            System.out.println("Coluna ["+(i+1)+"] linha ["+(j+1)+"] = "+matrizSub[i][j]);
                        }
                    }
                }
                if(opcao==3){
                    for(int i=0;i<matrizA.length;i++){
                        for(int j=0;j<matrizB.length;j++){
                            matrizMult[i][j] = matrizA[i][j] * matrizB[i][j];
                        }
                    }

                    System.out.println("\n\n==== MULTIPLICACAO DAS MATRIZES ====");

                    for(int i=0;i<matrizA.length;i++){
                        for(int j=0;j<matrizB.length;j++){
                            System.out.println("Coluna ["+(i+1)+"] linha ["+(j+1)+"] = "+matrizMult[i][j]);
                        }
                    }
                }
            }
            else if (opcao!=0)
            {
                System.out.println("\nOPCAO INVALIDA...TENTE NOVAMENTE\n");
            }
        }
    }
}
"# Matriz-2" 
