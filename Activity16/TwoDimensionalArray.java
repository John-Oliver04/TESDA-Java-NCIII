package Activity16;

public class TwoDimensionalArray {
    public static void main(String[] args) {
//                              i1      i2      i3
        int[][] variables = {{1, 2}, {2, 3}, {4, 5}};
//                           j1,j2 - j1, j2 - j1, j2
        for (int i = 0; i < variables.length; i++) {
            for (int j = 0; j < variables[i].length; j++) {
                System.out.print(variables[i][j] + " ");
            }
            System.out.println("");
//            System.out.println(variables[i].length);
        }
//        for(int[] row : variables){ // get the row of array
//            for(int col : row){  //get the columns in every row
//                System.out.print(col);
//            }
//            System.out.println("");
//        }


    }
}
