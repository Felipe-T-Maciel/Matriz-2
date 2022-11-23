import java.util.Scanner;
public class matriz5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] matriz = new int[4][4];

        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                System.out.println("Coluna ["+(i+1)+"] linha ["+(j+1)+"] valor: ");
                matriz[i][j] = scan.nextInt();
            }
        }

        System.out.println("\nDIAGONAL PRINCIPAL");
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                if(i==j){
                    System.out.println("Coluna ["+(i+1)+"] linha ["+(j+1)+"] = "+matriz[i][j]);
                }
            }
        }

        System.out.println("\nPRODUTOS FORA DA DIAGONAL PRINICPAL");
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                if(i!=j){
                    System.out.println("Coluna ["+(i+1)+"] linha ["+(j+1)+"] = "+matriz[i][j]);
                }
            }
        }

    }
}
