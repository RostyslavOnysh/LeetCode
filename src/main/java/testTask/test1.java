package testTask;

public class test1 {
    static int findPosition(String s, int l, int r, int k) {
        String substring = s.substring(l - 1, r);
        char kthChar = substring.charAt(k - 1);
        int count = 0;
        int occurrences = 0;
        for (int i = 0; i < k; i++) {
            if (substring.charAt(i) == kthChar) {
                count++;
            }
        }
        int pos = -1;

        for (int i = 0; i < substring.length(); i++) {
            if (substring.charAt(i) == 'B') {
                occurrences++;
            }
            if (occurrences == count) {
                pos = i + l;

                break;
            }
        }
        return pos;
    }

    public static void main(String[] args) {
        String s = "ABBABAAB";

        int l1 = 1;
        int r1 = 4;
        int k1 = 4;
        int position1 = findPosition(s, l1, r1, k1);
        System.out.println("Позиція: " + position1);

        int l2 = 2;
        int r2 = 6;
        int k2 = 1;
        int position2 = findPosition(s, l2, r2, k2);
        System.out.println("Позиція: " + position2);

        int l3 = 3;
        int r3 = 7;
        int k3 = 5;
        int position3 = findPosition(s, l3, r3, k3);
        System.out.println("Позиція: " + position3);


    }

}

