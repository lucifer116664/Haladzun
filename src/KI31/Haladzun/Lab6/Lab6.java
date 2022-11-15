package KI31.Haladzun.Lab6;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * ����-������� ��� ������ � �������
 */
public class Lab6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Files files = new Files();

        try {
            System.out.println("������ �:");
            double x = sc.nextDouble();
            files.txtSave(x);
            files.txtShow();
            files.binSave(x);
            files.binShow();
        } catch (FileNotFoundException fnf) {
            System.out.println("���� �� ��������.");
        } catch (IllegalArgumentException ia) {
            System.out.println("� ��������� ���������� ���������� ������ �� 0.");
        } catch (InputMismatchException im) {
            System.out.println("�� ����� � �����������.");
        } catch (IOException io) {
            System.out.println("������� ����� �� ������.");
        }
    }
}
