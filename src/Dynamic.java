public class Dynamic {
    public static void main(String[] args) {

        int[][] aarr = {
            {1,2,3,4},
            {4,5,6},
            {7,8,7,4,9}
        };
        for(int i = 0 ; i < aarr.length;i++){
            for (int j = 0 ; j < aarr[i].length;j++){
                System.out.print(aarr[i][j]+" ");
            }
            System.out.println();
        }


    }
}