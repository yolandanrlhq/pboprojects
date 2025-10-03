public class AkunBankTest {
    public static void main(String[] args) {
        AkunBank akunBank1 = new AkunBank(0);
        AkunBank akunBank2 = new AkunBank(0);
        AkunBank akunBank3 = new AkunBank(0);

        akunBank1.setSaldo(20);  
        System.out.println("Saldo akunBank1 : " + akunBank1.getSaldo());
        akunBank2.setSaldo(30);  
        System.out.println("Saldo akunBank2 : " + akunBank2.getSaldo());
        akunBank3.setSaldo(40);  
        System.out.println("Saldo akunBank3 : " + akunBank3.getSaldo());

        // Contoh menabung
        System.out.println("\n=== Menabung ===");
        System.out.println(akunBank1.menabung(50));
        System.out.println("Saldo akunBank1 setelah nabung : " + akunBank1.getSaldo());

        // Contoh tarik tunai
        System.out.println("\n=== Tarik Tunai ===");
        akunBank1.tarikTunai(30);  
        System.out.println("Saldo akunBank1 setelah tarik tunai : " + akunBank1.getSaldo() +"\n");

        akunBank2.tarikTunai(25);  
        System.out.println("Saldo akunBank2 setelah tarik tunai : " + akunBank2.getSaldo() +"\n");

        akunBank3.tarikTunai(35);  
        System.out.println("Saldo akunBank3 setelah tarik tunai : " + akunBank3.getSaldo());
    }   
}
