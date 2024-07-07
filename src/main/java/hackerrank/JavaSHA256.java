package hackerrank;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class JavaSHA256 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String value = sc.nextLine();
        sc.close();
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hashBytes = md.digest(value.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : hashBytes) {
                sb.append(String.format("%02x", b));
            }
            System.out.println(sb.toString());
        }catch(NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}

