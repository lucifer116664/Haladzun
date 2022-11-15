package KI31.Haladzun.Lab7;

import java.util.Scanner;

/**
 * ����-������� ��� �������
 */
public class Lab7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Drawer<Clothes> drawer = new Drawer<>();
        String command;
        boolean makeNextLoop = true;

        while (makeNextLoop) {
            System.out.println("\t����:");
            System.out.println("1 - ������� ���� �� �� �������");
            System.out.println("2 - ������� �� �� �������");
            System.out.println("3 - �������� ���, �� ������ � ������");
            System.out.println("4 - ������ ���������� ��");
            System.out.println("0 - ����� � ��������");

            command = sc.next();

            switch (command) {
                case "1" -> {
                    System.out.println("�� �� ������ �������� �� �������?");
                    System.out.println("1 - �����");
                    System.out.println("2 - ���������");
                    switch (sc.next()) {
                        case "1" -> drawer.put(new Pants());
                        case "2" -> drawer.put(new Socks());
                        default -> System.out.println("�� ����� ������ �������");
                    }
                }
                case "2" -> drawer.takeOut();
                case "3" -> drawer.showAll();
                case "4" -> drawer.findTheMostExpensive();
                case "0" -> makeNextLoop = false;
                default -> System.out.println("�� ����� ������ �������");
            }
        }
        System.out.println("�� ���������.");
    }
}
