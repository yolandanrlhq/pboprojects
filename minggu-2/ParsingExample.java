public class ParsingExample {
    public static void main(String[] args) {
        String teksAngka = "100";
        String teksDesimal = "12.75";
        String teksBoolean = "true";

        int angka = Integer.parseInt(teksAngka);
        double desimal = Double.parseDouble(teksDesimal);
        boolean status = Boolean.parseBoolean(teksBoolean);

        Integer objAngka = Integer.valueOf(teksAngka);
        Double objDesimal = Double.valueOf(teksDesimal);

        System.out.println("parseInt   -> int     : " + angka);
        System.out.println("parseDouble-> double  : " + desimal);
        System.out.println("parseBoolean-> boolean: " + status);
        System.out.println("valueOf    -> Integer : " + objAngka);
        System.out.println("valueOf    -> Double  : " + objDesimal);
    }
}

