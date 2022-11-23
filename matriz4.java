import java.util.Scanner;
public class matriz4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] matriz = new int[6][6];
        int x, naoEncontrado=0;

        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                System.out.println("Coluna ["+(i+1)+"] linha ["+(j+1)+"] valor: ");
                matriz[i][j] = scan.nextInt();
            }
        }

        System.out.println("\n\nQue valor deseja buscar dentro da Matriz: ");
        x = scan.nextInt();

        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                if(x==matriz[i][j]){
                    
                    System.out.println("\nO VALOR ESTA PRESENTE EM\nColuna ["+(i+1)+"] linha ["+(j+1)+"] = "+matriz[i][j]);
                    naoEncontrado=1;
                }
            }
        }
        if(naoEncontrado==0){
            System.out.println("\n\nO valor não foi encontrado");
        }
    }
}
