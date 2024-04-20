package prepOCA;

public class Exercise2 {
    public static void main(String[] args) {
        int availableAmount = 500;
        int[] loanRequests = {60, 20, 100, 80, 40, 300, 200, 100};
        boolean[] loanFulfilled = new boolean[loanRequests.length];

        for (int i = 0; i < loanRequests.length; i++) {
            int loanRequest = loanRequests[i];
            System.out.println("Cash in the pot: " + availableAmount);
            if (loanRequest <= 0) {
                System.out.println("Error: Loan request cannot be negative or zero.");
                loanFulfilled[i] = false;
            } else if (loanRequest<= availableAmount) {
                System.out.print("Loan amount requested: " + loanRequest);
                availableAmount -= loanRequest;
                System.out.println(" - Loan amount granted!");
                loanFulfilled[i] = true;
            } else if (availableAmount > 0) {
                System.out.print("Loan amount requested: " + loanRequest);
                double partialLoan = availableAmount;
                availableAmount = 0;
                System.out.println("\nThe exact loan request amount cannot be processed in full (insufficient funds available).");
                System.out.println("However, we will give you what we can... " + partialLoan);
                loanFulfilled[i] = true;
            } else {
                loanFulfilled[i] = false;
                System.out.println("\nThe following loan requests could not be facilitated:");
                for (int j = i; j < loanRequests.length; j++) {
                    if (!loanFulfilled[j]) {
                        System.out.println("€" + loanRequests[j]);
                    }
                }
                break;
            }
            System.out.println();
        }
    }
}