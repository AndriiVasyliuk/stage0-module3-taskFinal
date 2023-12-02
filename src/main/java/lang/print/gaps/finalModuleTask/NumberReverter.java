package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        for (int i = 0; i < 3; i++) {
            System.out.print(number % 10);
            number /= 10;
        }
        System.out.println();
    }
}
