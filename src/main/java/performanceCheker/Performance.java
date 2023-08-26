package performanceCheker;

public class Performance {
    public static void logPerformance() {
        long startTime = System.currentTimeMillis();
        long endTime = System.currentTimeMillis();
        long elapsedTimeMillis = endTime - startTime;
        double elapsedTimeSeconds = elapsedTimeMillis / 1000.0;

        Runtime runtime = Runtime.getRuntime();
        long usedMemory = runtime.totalMemory() - runtime.freeMemory();
        double usedMemoryMB = usedMemory / (1024.0 * 1024.0);

        System.out.println("Elapsed Time: " + elapsedTimeSeconds + " seconds");
        System.out.println("Used Memory: " + usedMemoryMB + " MB");
    }
}
