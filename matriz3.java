import java.util.Scanner;
public class matriz3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] matriz = new int[4][4];

        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                System.out.println("Coluna ["+(i+1)+"] linha ["+(j+1)+"] valor: ");
                matriz[i][j] = scan.nextInt();
            }
        }

        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                if(matriz[i][j]<0){
                    matriz[i][j] = 0;
                }
                System.out.println("Coluna ["+(i+1)+"] linha ["+(j+1)+"] = "+matriz[i][j]);
            }
        }

        System.out.println("\n\nLINHAS SUBSTITUIDAS");
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                if(matriz[i][j]==0){
                    System.out.println("Coluna ["+(i+1)+"] linha ["+(j+1)+"]");
                }
            }
        }
    }
}
