package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {

        // formas de inicializar um array multidimencional
        int[][] arrayInt = new int[3][];

        arrayInt[0] = new int[2];
        arrayInt[1] = new int[4];
        arrayInt[2] = new int[]{8,16,32,64,128,256};

        for (int[] arrBase: arrayInt){
            for (int num: arrBase){
                System.out.print(num+" ");
            }
            System.out.println(" ");
        }

        int[][] arrayInt2 = {{9,7,11},{10,6,8},{2,5,3,4}};

        for (int[] arrBase: arrayInt2){
            for (int num: arrBase){
                System.out.print(num+" ");
            }
            System.out.println(" ");
        }
    }
}
