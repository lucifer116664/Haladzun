package KI31.Haladzun.Lab4;

/**
 * Описує предметну область патрона
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
     * Робить вистріл
     * @return
     */
    public abstract String shoot();/*{
        String result;

        if (capCanBeUsed == 0) {
            result = "Капсуль неможливо використати знову.";
        }else if (!bulletIsLoaded || !powderIsLoaded){
            result = "Ви не можете вистрелити. Патрон пустий.";
        } else {
            result = "Бах!!!";
            powderIsLoaded = false;
            bulletIsLoaded = false;
            capCanBeUsed--;
        }
        return result;
    }*/

    /**
     * Заправляє патрон порохом та вставляє кулю
     */
    public void reloadCartridge(){
        powderIsLoaded = true;
        bulletIsLoaded = true;
    }
}
