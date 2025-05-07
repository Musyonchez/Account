
import java.util.Random;

public class Five {
    public static void main(String[] args) {
        // Coin Flip Decision

        Random coinFlip = new Random();
        int flip1 = coinFlip.nextInt(2); // 1 = Heads, 2 = Tails
        int flip2 = coinFlip.nextInt(2);
        int flip3 = coinFlip.nextInt(2);

        int total = flip1 + flip2 + flip3;

        System.out.println("Coin flips: " + flip1 + " + " + flip2 + " + " + flip3);

        if ((flip1 == flip2) && (flip2 == flip3)) {
            System.out.println("Triple match! +6 bonus to total!");
            total += 6;
        } else if ((flip1 == flip2) || (flip2 == flip3) || (flip1 == flip3)) {
            System.out.println("Double match! +2 bonus to total!");
            total += 2;
        }

        if (total >= 6) {
            System.out.println("You win!");
        } else {
            System.out.println("Sorry, you lose.");
        }
    }
}
