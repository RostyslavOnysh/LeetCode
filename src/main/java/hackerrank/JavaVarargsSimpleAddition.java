package hackerrank;

public class JavaVarargsSimpleAddition {
    public void add (int... numbers) {
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            sb.append(numbers[i]);
            if (i < numbers.length - 1) {
                sb.append("+");
            }
        }
        sb.append("=").append(sum);
        System.out.println(sb.toString());
    }
}
