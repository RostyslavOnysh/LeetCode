package prepOCA;

import java.util.ArrayList;
import java.util.List;

public class Exercise2 {
    private static int remainingAmount = 500;

    public static void main(String[] args) {
        List<Integer> loanRequests = new ArrayList<>();
        loanRequests.add(60);
        loanRequests.add(20);
        loanRequests.add(100);
        loanRequests.add(80);
        loanRequests.add(40);
        loanRequests.add(300);
        loanRequests.add(200);
        loanRequests.add(100);
        processLoanRequests(loanRequests);
    }

    public static void processLoanRequests(List<Integer> loanRequests) {
        for (Integer request : loanRequests) {
            if (remainingAmount >= request) {
                remainingAmount -= request;
                System.out.println("Loan of €" + request + " granted.");
            } else {
                int amountGranted = remainingAmount;
                remainingAmount = 0;
                System.out.println("Insufficient funds. Only €" + amountGranted + " granted.");
                break;
            }
        }
        if (remainingAmount == 0 && !loanRequests.isEmpty()) {
            System.out.println("Outstanding loan request amounts:");
            for (Integer request : loanRequests) {
                System.out.println("€" + request);
            }
        }
    }
}
