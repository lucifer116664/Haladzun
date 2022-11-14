package KI31.Haladzun.Lab3;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * ����-������� ��� �������
 */
public class Lab3 {
    private static String log = "";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cartridge cartridge = new Cartridge();
        String result = "";

        while (true) {
            System.out.println("\t����:");
            System.out.println("1 - ����������");
            System.out.println("2 - ������������ ������");

            int command = sc.nextInt();

            if (command == 1) {
                result = cartridge.shoot();
                System.out.println(result);
            } else if (command == 2) {
                cartridge.reloadBullet();
                cartridge.reloadPowder();
            } else {
                System.out.println("�� ����� ������ �������.");
            }

            if (result.equals("������� ��������� ����������� �����.")){
                break;
            }

            try(PrintStream fout = new PrintStream("src/KI31/Haladzun/Lab3/log.txt")){
                fout.print(log);
            }
            catch (FileNotFoundException e){
                System.out.println("���� �� ��������.");
            }
        }
    }

    /**
     * ������ ������� � ����� log
     * @param log
     */
    public static void setLog(String log){
        Lab3.log += log;
    }
}
