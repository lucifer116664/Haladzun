package KI31.Haladzun.Lab4;

/**
 * ����� ��������� ������� �������
 */
public abstract class Cartridge {
    protected int capCanBeUsed;
    protected boolean bulletIsLoaded;
    protected boolean powderIsLoaded;

    public Cartridge(){
        capCanBeUsed = 5;
        bulletIsLoaded = true;
        powderIsLoaded = false;
    }

    /**
     * ������ ������
     * @return
     */
    public abstract String shoot();/*{
        String result;

        if (capCanBeUsed == 0) {
            result = "������� ��������� ����������� �����.";
        }else if (!bulletIsLoaded || !powderIsLoaded){
            result = "�� �� ������ ����������. ������ ������.";
        } else {
            result = "���!!!";
            powderIsLoaded = false;
            bulletIsLoaded = false;
            capCanBeUsed--;
        }
        return result;
    }*/

    /**
     * ��������� ������ ������� �� �������� ����
     */
    public void reloadCartridge(){
        powderIsLoaded = true;
        bulletIsLoaded = true;
    }
}
