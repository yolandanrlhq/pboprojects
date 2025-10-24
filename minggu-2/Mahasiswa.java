public class Mahasiswa {
   int roll_no;
   String stu_name;
   // Parameterized constructor
   Mahasiswa(int i, String n) { 
      roll_no = i;
      stu_name = n;
   }
   void display() {
      System.out.println(roll_no+" "  +stu_name);
   }
   public static void main(String args[]) {
      Mahasiswa s1 = new Mahasiswa(1,"Adithya");
      Mahasiswa s2 = new Mahasiswa(2,"Jai");
      s1.display();
      s2.display();
   }
}
