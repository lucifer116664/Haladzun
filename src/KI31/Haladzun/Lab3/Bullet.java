package KI31.Haladzun.Lab3;

/**
 * ����� ��������� ������� ���
 */
public class Bullet {
    int weight;

    public Bullet(int weight){
        Lab3.setLog("Bullet()\n");
        this.weight = weight;
    }

    /**
     * ���������� ���� ���
     * @param weight
     */
    public void setWeight(int weight){
        Lab3.setLog("setWeight\n");
        this.weight = weight;
    }

    /**
     * ������� ���� ���
     * @return
     */
    public int getWeight(){
        Lab3.setLog("getWeight\n");
        return weight;
    }
}
