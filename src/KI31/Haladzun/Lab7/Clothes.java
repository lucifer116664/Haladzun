package KI31.Haladzun.Lab7;

/**
 * ����� ����
 */
public abstract class Clothes {
    protected String color;
    protected int price;

    /**
     * ���������� ����
     */
    protected abstract void setColor();

    /**
     * ���������� ����
     */
    protected abstract void setPrice();

    /**
     * ������ ��� ����������
     */
    public abstract void showInfo();

    /**
     * ������� ����
     * @return
     */
    protected String getColor() {
        return color;
    }

    /**
     * ������� ����
     * @return
     */
    protected int getPrice() {
        return price;
    }
}
