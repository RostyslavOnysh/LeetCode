package prepOCA;

public class Exercise2 {
    public static void main(String[] args) {
        int cash = 500;

        // Loan request amounts
        int[] loanRequests = {60, 20, 100, 80, 40, 300, 200, 100};

        // Process each loan request
        for (int loan : loanRequests) {
            System.out.println("Cash in the pot: " + cash);
            System.out.print("Loan amount requested: " + loan + " - ");

            // Check if there's enough cash
            if (cash >= loan) {
                cash -= loan;
                System.out.println("Loan amount granted!");
            } else {
                System.out.println("The exact loan request amount cannot be processed in full (insufficient funds available).");
                System.out.println("However, we will give you what we can..." + cash);
                cash = 0; // Set cash to 0 as all remaining is given
            }

            System.out.println("Cash remaining in the pot: " + cash);
            System.out.println();
        }

        // Display outstanding loan requests (if any)
        if (cash == 0) {
            System.out.println("The following loan requests could not be facilitated:");
            for (int loan : loanRequests) {
                if (loan > cash) {
                    System.out.println(loan);
                }
            }
        }
    }
}