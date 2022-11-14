package KI31.Haladzun.Lab3;

import java.util.Scanner;

/**
 * ����� ��������� ������� �������
 */
public class Cartridge {
    Scanner sc = new Scanner(System.in);
    private Cap cap;
    private Bullet bullet;
    private Powder powder;

    public Cartridge(){
        Lab3.setLog("Cartridge()\n");
        cap = new Cap();
        bullet = new Bullet(100);
        powder = new Powder(5);
    }

    /**
     * ������ ������
     * @return
     */
    public String shoot(){
        Lab3.setLog("shoot()\n");
        String result;

        if (cap.getCanBeUsed() == 0) {
            result = "������� ��������� ����������� �����.";
        }else if (bullet.getWeight() == 0 || powder.getHowManyGr() == 0){
            result = "�� �� ������ ����������. ������ ������.";
        } else {
            result = "���!!!";
            powder.setHowManyGr(0);
            bullet.setWeight(0);
            cap.setCanBeUsed();
        }
        return result;
    }

    /**
     * ��������� ������ �������
     */
    public void reloadPowder(){
        Lab3.setLog("reloadPowder()\n");
        System.out.println("������ ���� ������ ��������?");
        powder.setHowManyGr(sc.nextInt());
    }

    /**
     * �������� � ������ ���� ����
     */
    public void reloadBullet(){
        Lab3.setLog("reloadBullet()\n");
        System.out.println("���� ��� ���� �� ������ �����������?");
        bullet.setWeight(sc.nextInt());
    }
}
