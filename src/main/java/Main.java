public class Main {
    public static void main(String[] args) {
        String h = "hi ";
        String g = "world";
        int a = h.length();
        int b = g.length();
        int summ = a + b;
        String q = h.toUpperCase();
        System.out.println("сумма длин двух строк " + summ);
        System.out.println(q.toLowerCase());
        System.out.println(g);
        boolean d = h.equalsIgnoreCase(g);
        System.out.println(d);
        String w = new String("hi");
        System.out.println(w);


        String firstName = "ivanov";
        String middleName = "ivan";
        String lastName = "vanovich";
        String fullName = firstName + " " + middleName + " " +  lastName;
        System.out.println(fullName);

    }
}

