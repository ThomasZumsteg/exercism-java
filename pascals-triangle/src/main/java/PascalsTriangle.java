import java.util.stream.IntStream;

public class PascalsTriangle {
    public static int[][] computeTriangle(int rows) {
        if(rows < 0)
            throw new IllegalArgumentException();
        int[][] triangle = new int[rows][];
        for(int row = 0; row < rows; row++) {
            triangle[row] = new int[row + 1];
            for(int col = 0; col <= row; col++) {
                 triangle[row][col] = binomial(row, col);
            }
        }
        return triangle;
    }

    private static int binomial(int n, int k) {
        return fact(n) / (fact(k) * fact(n - k));
    }

    private static int fact(int n) {
    	return IntStream.rangeClosed(1, n)
    		.reduce(1, (total, x) -> total * x);
    }

    public static boolean isTriangle(int[][] triangle) {
        for(int row = 0; row < triangle.length; row++) {
            for(int col = 0; col < triangle[row].length; col++) {
                if(triangle[row][col] != binomial(row, col))
                    return false;
            }
        }
        return true;
    }
}
