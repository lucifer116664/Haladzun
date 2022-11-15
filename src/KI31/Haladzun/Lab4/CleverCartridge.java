package KI31.Haladzun.Lab4;

import java.util.Scanner;

public class CleverCartridge extends Cartridge implements Aim{
    Scanner sc = new Scanner(System.in);

    boolean successfulShot;
    private boolean battery;
    int distance;

    public CleverCartridge() {
        super();
        battery = true;
        distance = 0;
    }

    @Override
    public String shoot() {
        String result;

        if (capCanBeUsed == 0) {
            result = "Капсуль неможливо використати знову.";
        } else if (!bulletIsLoaded || !powderIsLoaded || !battery){
            result = "Ви не можете вистрелити. Патрон пустий.";
        } else {
            System.out.println("Вкажіть відстань до цілі:");
            distance = sc.nextInt();

            result = "Бах!!!";
            if (distance > 150)
                canNotAutoAim();
            else
                canAutoAim();

            powderIsLoaded = false;
            bulletIsLoaded = false;
            capCanBeUsed--;
            isShotSuccessful();
        }
        return result;
    }

    @Override
    public void reloadCartridge() {
        super.reloadCartridge();
        battery = true;
    }

    @Override
    public void canAutoAim() {
        System.out.println("");
        successfulShot = true;
    }

    @Override
    public void canNotAutoAim() {
        System.out.println("");
        successfulShot = Math.random() < 0.5;
    }

    @Override
    public void isShotSuccessful() {
        if (successfulShot)
            System.out.println("Ви попали у ціль.");
        else
            System.out.println("Ви промазали.");
    }
}
