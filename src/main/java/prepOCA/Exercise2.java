package prepOCA;

public class Exercise2 {
    public static void main(String[] args) {
        int availableAmount = 500;
        int[] loanRequests = {60, 20, 100, 80, 40, 300, 200, 100};
        boolean[] loanFulfilled = new boolean[loanRequests.length];
        boolean allLoansFulfilled = true;

        for (int i = 0; i < loanRequests.length; i++) {
            double loanRequest = loanRequests[i];
            System.out.println("Cash in the pot: " + availableAmount);
            System.out.print("Loan amount requested: " + (int) loanRequest);
            if (loanRequest <= availableAmount) {
                availableAmount -= loanRequest;
                System.out.println(" - Loan amount granted!");
                loanFulfilled[i] = true;
            } else {
                System.out.println("\nThe exact loan request amount cannot be processed in full (insufficient funds available).");
                double partialLoan = availableAmount;
                availableAmount = 0;
                System.out.println("However, we will give you what we can... " + partialLoan);
                System.out.println("\nCash remaining in the pot: " + availableAmount);
                loanFulfilled[i] = true;
                allLoansFulfilled = false;
                break;
            }
            System.out.println();
        }

        if (!allLoansFulfilled) {
            System.out.println("The following loan requests could not be facilitated:");
            for (int i = 0; i < loanRequests.length; i++) {
                if (!loanFulfilled[i]) {
                    System.out.println("€" + loanRequests[i]);
                }
            }
        }
    }
}