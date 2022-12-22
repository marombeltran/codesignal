import java.text.MessageFormat;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int [] matrix = { 3, 6, -2, -5, 7, 3 };

        System.out.println(MessageFormat.format(
                "Maximum product of adjacent numbers {0}, {1}",
                Arrays.toString(matrix),
                adjacentElementsProduct(matrix))
        );
    }

    public  static int adjacentElementsProduct (int [] matrix)
    {
        int prev, curr, maxProd = 0;

        for (int i = 1; i < matrix.length; i++) {
            prev = matrix[i -1];         // 3,  6, -2, -5, 7
            curr = matrix[i];            // 6, -2, -5,  7, 3
                                         // 3 * 6 = 18, 6 * -2 = -12, -2 * -5 = 10, -5 * 7 = -35, 7 * 3 -21
            maxProd = prev * curr > maxProd ?  prev * curr : maxProd;
        }

        return maxProd;
    }
}
