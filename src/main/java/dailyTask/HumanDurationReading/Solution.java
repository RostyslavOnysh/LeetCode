package dailyTask.HumanDurationReading;

public class Solution {
    public static String formatDuration(int seconds) {
        if (seconds == 0) {
            return "now";
        }

        int[] durations = {31536000, 86400, 3600, 60, 1};
        String[] units = {"year", "day", "hour", "minute", "second"};
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < durations.length; i++) {
            int duration = durations[i];
            String unit = units[i];

            if (seconds >= duration) {
                int count = seconds / duration;
                seconds %= duration;

                if (result.length() > 0) {
                    result.append(", ");
                }

                result.append(count).append(" ").append(unit);
                if (count > 1) {
                    result.append("s");
                }
            }
        }

        if (result.indexOf(", ") > 0) {
            int lastIndex = result.lastIndexOf(", ");
            result.replace(lastIndex, lastIndex + 2, " and ");
        }

        return result.toString();
    }
}