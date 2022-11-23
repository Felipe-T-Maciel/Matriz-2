import java.util.Random;
public class matriz2 {
    public static void main(String[] args) {
        Random ran = new Random();
        int n=5;
        int[][] matriz = new int[n][n];

        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                matriz[i][j] = ran.nextInt(100)+1;
            }
        }

        System.out.println("\nValores presentes nos indices iguais: ");
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                if(i==j){
                System.out.println("Coluna ["+(i+1)+"] linha ["+(j+1)+"] = "+matriz[i][j]);
                }                
            }
        }
    }
}
