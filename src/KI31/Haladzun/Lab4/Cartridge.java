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
    public abstract String shoot();

    /**
     * ��������� ������ ������� �� �������� ����
     */
    public void reloadCartridge(){
        powderIsLoaded = true;
        bulletIsLoaded = true;
    }
}
