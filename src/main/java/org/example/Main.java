package org.example;

import java.awt.*;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Notebook Samsung01 = new Notebook("Samsung", "S-101", "Black", 15.6);
        Notebook Samsung02 = new Notebook("Samsung", "S-150", "Green", 17.0);
        Notebook Asus03 = new Notebook("ASUS", "TUF-504", "Red", 15.6);
        Notebook Asus04 = new Notebook("ASUS", "TUF-555", "White", 15.6);
        List<Notebook> notebookList = List.of(Samsung01, Samsung02, Asus03, Asus04);

        Scanner scannerUser = new Scanner(System.in);
        System.out.println("Выберите параметр поиска\n1 - по цвету\n2 - по бренду");
        int choiceUserSearch = scannerUser.nextInt();
        Scanner scannerRequestUserForSearch = new Scanner(System.in);
        System.out.println("Напишите цвет или бренд: ");
        String requestUserForSearch = scannerRequestUserForSearch.nextLine();

        if (choiceUserSearch == 1) {
            for (Notebook color : notebookList) {
                if (color.getColor().equalsIgnoreCase(requestUserForSearch)) {
                    System.out.println(color.printInfo());
                }
            }

        } else if (choiceUserSearch == 2) {
            for (Notebook brand : notebookList) {
                if (brand.getBrand().equalsIgnoreCase(requestUserForSearch)) {
                    System.out.println(brand.printInfo());
                }
            }
        } else {
            System.out.println("Ошибка.\nВыберите параметр поиска, где:\n1 - по цвету\n2 - по бренду");
        }

        scannerUser.close();
    }
}