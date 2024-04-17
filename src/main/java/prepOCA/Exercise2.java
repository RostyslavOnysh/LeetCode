package prepOCA;

public class Exercise2 {
    public static void main(String[] args) {
        double availableAmount = 500.0;
        double[] loanRequests = {60.0, 20.0, 100.0, 80.0, 40.0, 300.0, 200.0, 100.0};
        int unfacilitatedCount = 0;
        boolean partialLoanProcessed = false;

        for (double loanRequest : loanRequests) {
            System.out.println("Cash in the pot: " + (int) availableAmount);
            System.out.print("Loan amount requested: " + (int) loanRequest);

            if (loanRequest <= availableAmount) {
                availableAmount -= loanRequest;
                System.out.println(" - Loan amount granted!");
            } else {
                if (!partialLoanProcessed) {
                    System.out.println(" - The exact loan request amount cannot be processed in full (insufficient funds available).");
                    double partialLoan = availableAmount;
                    availableAmount = 0.0;
                    System.out.println("However, we will give you what we can... " + (int) partialLoan);
                    System.out.println("\nCash remaining in the pot: " + (int) availableAmount);
                    unfacilitatedCount++;
                }
                unfacilitatedCount++;
                break;
            }
            System.out.println();
        }

        System.out.println("\nThe following loan requests could not be facilitated:");
        for (int i = 0; i < unfacilitatedCount; i++) {
            double loanRequest = loanRequests[i + loanRequests.length - unfacilitatedCount];
            System.out.println("€" + (int) loanRequest);
        }
    }
}