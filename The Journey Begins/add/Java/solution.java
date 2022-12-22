import java.text.MessageFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Sum of two Integers ..");

        System.out.print("Enter the first Value: ");
        int param1 = in.nextInt();

        System.out.print("Enter the second Value: ");
        int param2 = in.nextInt();

        try {
            System.out.println(
                    MessageFormat.format(
                            "Result {0} + {1}: {2}",
                            param1,
                            param2,
                            Add(param1, param2)
                    )
            );
        } catch (IllegalArgumentException e) {
            System.out.println("The parameters do not satisfy the operation");
        }
    }

    public static int Add (int param1, int param2) {
        if (-1000 <= param1 && param1 <= 1000)
            if (-1000 <= param2 && param2 <= 1000)
                return param1 + param2;

        throw new IllegalArgumentException();
    }
}