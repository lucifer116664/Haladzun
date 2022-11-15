package KI31.Haladzun.Lab4;

import java.util.Scanner;

/**
 * ����� ��������� ������� ��������� �������
 */
public class CleverCartridge extends Cartridge implements Aim{
    Scanner sc = new Scanner(System.in);

    boolean successfulShot;
    private boolean battery;
    int distance;

    public CleverCartridge() {
        super();
        battery = true;
        distance = 0;
    }

    /**
     * ������ ������
     * @return
     */
    @Override
    public String shoot() {
        String result;

        if (capCanBeUsed == 0) {
            result = "������� ��������� ����������� �����.";
        } else if (!bulletIsLoaded || !powderIsLoaded || !battery){
            result = "�� �� ������ ����������. ������ ������.";
        } else {
            System.out.println("������ ������� �� ���:");
            distance = sc.nextInt();

            result = "���!!!";
            if (distance > 150)
                canNotAutoAim();
            else
                canAutoAim();

            powderIsLoaded = false;
            bulletIsLoaded = false;
            capCanBeUsed--;
            isShotSuccessful();
        }
        return result;
    }

    /**
     * ������������� ������
     */
    @Override
    public void reloadCartridge() {
        super.reloadCartridge();
        battery = true;
    }

    /**
     * ��������������
     */
    @Override
    public void canAutoAim() {
        System.out.println("");
        successfulShot = true;
    }

    /**
     * ���������� ������
     */
    @Override
    public void canNotAutoAim() {
        System.out.println("");
        successfulShot = Math.random() < 0.5;
    }

    /**
     * �������� �� ���������� ����� � ����
     */
    @Override
    public void isShotSuccessful() {
        if (successfulShot)
            System.out.println("�� ������ � ����.");
        else
            System.out.println("�� ���������.");
    }
}
