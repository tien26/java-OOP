package programmer.zaman.now.data;

public class Bus implements Car{
    public void drive() {
        System.out.println("drive Bus");
    }

    public int getTier() {
        return 8;
    }

    public String getBrand() {
        return "Hino";
    }

    public boolean isMaintanance() {
        return false;
    }

    public boolean isBig() {
        return true;
    }
}
