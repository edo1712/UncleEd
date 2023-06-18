package enter;

import java.util.Scanner;

public class LessonScanner {
    public static void main(String[] args) {
        Scanner less = new Scanner(System.in);
        System.out.println("Напишите любое число");
        int a = less.nextInt();
        System.out.println("capec");
        int b = less.nextInt();
        System.out.println(a + b);
    }
}
