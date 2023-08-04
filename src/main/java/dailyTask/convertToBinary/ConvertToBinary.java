package dailyTask.convertToBinary;

public class ConvertToBinary {
    public static int toBinary(int num) {
        String converter = Integer.toBinaryString(num);
        return Integer.parseInt(converter);
    }

}
