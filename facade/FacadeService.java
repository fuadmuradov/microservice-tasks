package org.example.facade;

import java.util.Scanner;

public class FacadeService {
    public static void main(String[] args) {
        System.out.println("===== Mobile Shop =====");
        System.out.println("1. IPHONE.");
        System.out.println("2. SAMSUNG.");
        System.out.println("3. BLACKBERRY.");
        System.out.println("4. Exit.");
        System.out.println("Enter your choice: ");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        ShopKeeper sk = new ShopKeeper();
        switch (choice) {
            case 1 -> sk.IphoneSale();
            case 2 -> sk.SamsungSale();
            case 3 -> sk.XiaomiSale();
        }

    }
}
