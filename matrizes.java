import java.util.Random;
public class matrizes {
    public static void main(String[] args) {
     int matriz[][] = new int [5][4];
     Random num = new Random();
     
        System.out.println("Linhas" + matriz.length);
        System.out.println("Colunas" + matriz[0].length);
        
        for (int L = 0; L < matriz.length; L++) {
            for (int C = 0; C < matriz[0].length; C++) {
                matriz[L][C] = num.nextInt(11);
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " \t");
            }
            System.out.println(" ");
        }
    }
}
