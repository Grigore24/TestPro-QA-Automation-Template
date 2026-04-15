package HomeworksTestPro;

public class HomeworkL2 {
    public static void main(String[] args) {
        String word = "paPaamericano";
        System.out.println(word.length());
        System.out.println(word.toUpperCase());
        System.out.println(word.toLowerCase());

        String b = "   Amba   Matumba   ";
        System.out.println(b.trim());

        String d = "Monte Carlo";
        System.out.println(d.substring(0,8));
        System.out.println(d.substring(6));

        String c = "String examole String";
        System.out.println(c.replaceAll("String","ox"));
        System.out.println(c.replace(" ",""));
        System.out.println(c.charAt(4));
        System.out.println(c.indexOf("g"));

        String g = "Mamma mia";
        String j = "is my mam";
        System.out.println(g+" "+j);
        System.out.println(g.equals(j));

        boolean f = g.contains("i");
        System.out.println(f);

        String h = "MAN";
        String l = "man";
        System.out.println(h.equalsIgnoreCase(l));

        int price = 100;
        double disc = 0.2;
        double total = price * (1 - disc);
        System.out.println(total);
        String s = "IOS";
    }
}
