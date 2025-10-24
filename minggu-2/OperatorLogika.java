public class OperatorLogika {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        // AND (&&) -> true jika keduanya true
        System.out.println("a && b = " + (a && b));  // false

        // OR (||) -> true jika salah satu true
        System.out.println("a || b = " + (a || b));  // true

        // NOT (!) -> membalikkan nilai boolean
        System.out.println("!a = " + (!a));  // false
        System.out.println("!b = " + (!b));  // true
    }
}