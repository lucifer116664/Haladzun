package KI31.Haladzun.Lab3;

/**
 * ����� ��������� ������� �����
 */
public class Cap {
    int canBeUsed;

    public Cap(){
        Lab3.setLog("Cap()\n");
        canBeUsed = 5;
    }

    /**
     * ������ ������� ������� �� ������� �����
     */
    public void setCanBeUsed() {
        Lab3.setLog("setCanBeUsed()\n");
        canBeUsed--;
    }

    /**
     * ������� ������� ������� �� ������� �����
     * @return
     */
    public int getCanBeUsed() {
        Lab3.setLog("getCanBeUsed\n");
        return canBeUsed;
    }
}
