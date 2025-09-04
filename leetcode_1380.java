import java.util.ArrayList;
import java.util.List;

public class leetcode_1380 { 
    public List<Integer> luckyNumbers (int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < r; i++) {
            int minVal = matrix[i][0];
            int minCol = 0;
            for (int j = 1; j < c; j++) {
                if (matrix[i][j] < minVal) {
                    minVal = matrix[i][j];
                    minCol = j;
                }
            }
            boolean isLucky = true;
            for (int k = 0; k < r; k++) {
                if (matrix[k][minCol] > minVal) {
                    isLucky = false;
                    break;
                }
            }

            if (isLucky) res.add(minVal);
        }
        return res;
    }
}
