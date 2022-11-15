package KI31.Haladzun.Lab4;

import java.util.Scanner;

/**
 * ����-������� ��� ��������� �������
 */
public class Lab4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CleverCartridge clCartridge = new CleverCartridge();
        String result = "";

        while (true) {
            System.out.println("\t����:");
            System.out.println("1 - ����������");
            System.out.println("2 - ������������ ������");

            int command = sc.nextInt();

            if (command == 1) {
                result = clCartridge.shoot();
                System.out.println(result);
            } else if (command == 2) {
                clCartridge.reloadCartridge();
            } else {
                System.out.println("�� ����� ������ �������.");
            }

            if (result.equals("������� ��������� ����������� �����.")){
                break;
            }
        }
    }
}
