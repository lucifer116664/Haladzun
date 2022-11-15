package KI31.Haladzun.Lab5;

/**
 * ������� ���������
 */
public class Count {
    /**
     * ���� ����� � ���� �������
     * @param x
     * @return
     * @throws IllegalArgumentException
     */
    public static double count(double x) throws IllegalArgumentException{
        if(Math.tan(2 * x) == 0)
            throw new IllegalArgumentException();
        else
            return 1 / Math.tan(2 * x);
    }
}
