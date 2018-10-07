
import java.util.Scanner;

public class MatchesCount {
    public static void main(String[] args) {
        System.out.println("Input number of squares from 1 to 10^9");
        Scanner scanner = new Scanner(System.in);
        int numberOfSquares = scanner.nextInt();
        double columnNumber =  Math.floor(Math.sqrt(numberOfSquares));
        double rowNumber = Math.ceil(numberOfSquares/columnNumber);
        double extraSquares = numberOfSquares - columnNumber*rowNumber;
        double matchesNumber = numberOfSquares*4 - ((columnNumber-1)*rowNumber +(rowNumber-1)*columnNumber)
                - extraSquares*2;

        System.out.println("The minimum number of matches required to construct " +
                numberOfSquares + " squares = " + matchesNumber);
        scanner.close();

    }
}
