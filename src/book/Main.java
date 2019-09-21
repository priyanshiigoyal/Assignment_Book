package book;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Book[] ob = new Book[n];
        if (n == 0)
            System.out.println("N/A");
        else {
            for (int i = 0; i < n; i++) {
                if (i == 0) {
                    String v = sc.nextLine().trim();
                }
                String nam1 = sc.nextLine().trim();
                String auth1 = sc.nextLine().trim();
                String isbn1 = sc.nextLine().trim();
                ob[i] = new Book(nam1, auth1, isbn1);
            }
            for (int i = 0; i < n; i++) {
                System.out.println(ob[i].toString());
            }
        }
    }
}
