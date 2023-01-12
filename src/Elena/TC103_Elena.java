package Elena;

import java.util.Arrays;

public class TC103_Elena {

    public static void main(String[] args) {



        int [][] arr2D =new int [2][5];
        arr2D[0] = new int[]{1, 2, 3};
        arr2D[1] = new int[]{1, 2, 3, 4, 5};
        System.out.println(Arrays.deepToString(arr2D));


        for(int i =0; i<arr2D.length; i++){
            for(int j=arr2D.length-1;j>=0;j--){
                System.out.print(arr2D[i][j] + " ");
            }

        }



    }
}
