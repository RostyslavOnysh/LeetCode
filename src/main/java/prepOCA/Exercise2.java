package prepOCA;

public class Exercise2 {
    public static void main(String[] args) {
        double availableAmount = 500.0;
        double[] loanRequests = {60.0, 20.0, 100.0, 80.0, 40.0, 300.0, 200.0, 100.0};

        for (double loanRequest : loanRequests) {
            System.out.println("Cash in the pot: €" + availableAmount);
            System.out.println("Loan amount requested: €" + loanRequest);

            if (loanRequest <= availableAmount) {
                System.out.println("  Loan amount granted!");
                availableAmount -= loanRequest;
                System.out.println("  Cash in the pot: €" + availableAmount);
            } else if (availableAmount > 0.0) {
                System.out.println("  The exact loan request amount cannot be processed in full (insufficient funds available).");
                double partialLoan = availableAmount;
                availableAmount = 0.0;
                System.out.println("  However, we will give you what we can... €" + partialLoan);
                System.out.println("  Cash remaining in the pot: €" + availableAmount);
            } else {
                System.out.println("  Insufficient funds available. Loan request rejected.");
            }
            System.out.println();
        }
        if (availableAmount == 0.0) {
            System.out.println("The following loan requests could not be facilitated:");
            for (double loanRequest : loanRequests) {
                if (loanRequest > 500.0 - loanRequest) {
                    System.out.println("- €" + loanRequest);
                }
            }
        }
    }
}