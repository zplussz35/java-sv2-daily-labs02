package day01;

import java.util.Scanner;

public class HumanMain {
    public static void main(String[] args) {
        Human bill = new Human("Bill",12);
        System.out.println("Hello, az en nevem "+bill.getName());
        System.out.println(bill.getAge()+" éves vagyok.");

        System.out.println(bill.introduce());
        Scanner scanner = new Scanner(System.in);
    }
}
