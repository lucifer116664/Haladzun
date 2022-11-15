package KI31.Haladzun.Lab7;

/**
 * ����� ���������
 */
public class Socks extends Clothes{
    private final String type = "���������";

    public Socks(){
        setColor();
        setPrice();
    }

    @Override
    protected void setColor() {
        switch ((int)(Math.random() * 3)){
            case 0 -> color = "�������";
            case 1 -> color = "��������";
            case 2 -> color = "����������";
        }
    }

    @Override
    protected void setPrice() {
        price = (int)(20 + Math.random() * 70);
    }

    @Override
    public void showInfo() {
        System.out.println(type + " ����: " + getColor() + " ����: " + getPrice() + " ���.");
    }
}
