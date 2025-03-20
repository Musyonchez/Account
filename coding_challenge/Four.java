public class Four {
    public static void main(String[] args) {
        // Coin Toss Simulation
        java.util.Random coinToss = new java.util.Random();
        int flip1 = coinToss.nextInt(2); // 0 or 1 (Heads or Tails)
        int flip2 = coinToss.nextInt(2);
        int flip3 = coinToss.nextInt(2);

        System.out.println("First flip: " + flip1);
        System.out.println("Second flip: " + flip2);
        System.out.println("Third flip: " + flip3);
    }
}
