public class OperatorPenugasan {
    public static void main(String[] args) {
        int x = 10;  // penugasan awal (=)
        System.out.println("Nilai awal x = " + x);

        x += 5;  // sama dengan x = x + 5
        System.out.println("Setelah x += 5, x = " + x);

        x -= 3;  // sama dengan x = x - 3
        System.out.println("Setelah x -= 3, x = " + x);

        x *= 2;  // sama dengan x = x * 2
        System.out.println("Setelah x *= 2, x = " + x);

        x /= 4;  // sama dengan x = x / 4
        System.out.println("Setelah x /= 4, x = " + x);

        x %= 3;  // sama dengan x = x % 3
        System.out.println("Setelah x %= 3, x = " + x);
    }
}
