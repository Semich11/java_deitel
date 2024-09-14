package chapter4;

public class TabularOutput {
    public static void main(String[] args) {
        System.out.printf("%s%10s%10s%10s%n", "N", "N2", "N3", "N4");

        for (int base = 1; base <= 5; base++) {
            System.out.print(base);
            int power = base;
            for (int innerCount = 1; innerCount <= 3; innerCount++) {
                power *= base;
                System.out.printf("%10d", power);
            }
            System.out.println();
        }
    }
}
