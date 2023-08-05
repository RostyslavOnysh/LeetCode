package dailyTask.ipDefanger;

public class IPDefanger {
    public static String defangIPAddress(String address) {
      StringBuilder sb = new StringBuilder();
      for (char c : address.toCharArray()) {
          if (c == '.'){
              sb.append("[.]");
          }else {
              sb.append(c);
          }
      }
      return sb.toString();
    }

    public static void main(String[] args) {
        String address = ("1.1.1.1");
        System.out.println(defangIPAddress(address));
    }
}
