package lvc.edu;

import java.util.Scanner;
import static java.lang.Math.max;

public class PieceOfCake {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int length = in.nextInt();
        int topDist = in.nextInt();
        int leftDist = in.nextInt();

        int hDiff = length - topDist;
        int wDiff = length - leftDist;
        int maxHeight = max(hDiff, (length - hDiff));
        int maxWidth = max(wDiff, (length - wDiff));

        System.out.println(maxHeight*maxWidth*4);

    }
}

/*
*
*
*   Each cake is 4 centimeters thick.
*   Input is one line of 3 integers separated by space
*   (lengthOfCake, distFromTop, distFromLeft)
*   1. Read in each int (scanner.nextInt())
*   2. take length - top, length - left
*
*
*/