package KI31.Haladzun.Lab7;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * ����� �������
 * @param <T>
 */
public class Drawer<T extends Clothes> {
    private List<T> clothes;

    public Drawer() {
        clothes = new ArrayList<>();
    }

    /**
     * ������� �� � �������
     * @param clothe
     */
    public void put(T clothe) {
        clothes.add(clothe);
    }

    /**
     * ����� ��
     */
    public void takeOut() {
        if (!clothes.isEmpty()) {
            System.out.println("������ ����� ����, ��� ������ �������");
            Scanner sc = new Scanner(System.in);
            showAll();
            try {
                clothes.remove(sc.nextInt() - 1);
            } catch (InputMismatchException ime) {
                System.out.println("�� ������ ������ ����� ����");
            } catch (IndexOutOfBoundsException iob) {
                System.out.println("���� ���� � ������ ����");
            }
        } else
            System.out.println("������� �����");
    }

    /**
     * �������� ���������� ��� ���������� ��
     */
    public void findTheMostExpensive() {
        try {
            T mostExpensive = clothes.get(0);
            for (T clothe : clothes) {
                if (clothe.getPrice() > mostExpensive.getPrice()) {
                    mostExpensive = clothe;
                }
            }
            if (!clothes.isEmpty())
                System.out.print("���������� �� � ������ �� ");
            mostExpensive.showInfo();
        } catch (IndexOutOfBoundsException iob) {
            System.out.println("������� �����");
        }
    }

    /**
     * �������� ������ ��� �����
     */
    public void showAll() {
        if (clothes.isEmpty())
            System.out.println("������� �����");
        else {
            for (int i = 0; i < clothes.size(); i++) {
                System.out.print(i + 1 + ". ");
                clothes.get(i).showInfo();
            }
        }
    }
}
