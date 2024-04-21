package prepOCA;

public class BiggerProblem extends Problem {
    public static void main(String uhOh[]) {
        try {
            throw new BiggerProblem();
        } catch (BiggerProblem re) {
            System.out.print("Problem?");
        } catch (Problem e) {
            System.out.print("Handled");
        } finally {
            System.out.print("Fixed!");
        }
    }
}
