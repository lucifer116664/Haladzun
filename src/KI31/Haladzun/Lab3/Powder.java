package KI31.Haladzun.Lab3;

/**
 * ����� ��������� ������� ������
 */
public class Powder {
    private int howManyGr;

    public Powder(int howManyGr){
        Lab3.setLog("Powder()\n");
        this.howManyGr = howManyGr;
    }

    /**
     * ���������� ������� ������
     * @param howManyGr
     */
    public void setHowManyGr(int howManyGr) {
        Lab3.setLog("setHowManyGr()\n");
        this.howManyGr = howManyGr;
    }

    /**
     * ������� ������� ������
     * @return
     */
    public int getHowManyGr(){
        Lab3.setLog("getHowManyGr()\n");
        return howManyGr;
    }
}
