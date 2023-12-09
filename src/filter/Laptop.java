package filter;

public class Laptop {

    private String name;
    private int ram;
    private int price;
    private String color;
    private Boolean gamingLaptop;
    private String os;

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getGamingLaptop() {
        return gamingLaptop;
    }

    public void setGamingLaptop(Boolean gamingLaptop) {
        this.gamingLaptop = gamingLaptop;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        String temp = "";
        if (gamingLaptop) {
            temp = "(**Игровой) ";
        }
        return String.format("%sНоутбук %s %s\nЦена %d руб\nХарактеристики: ОЗУ %d ГБ, ОС %s\n",
                temp, name, color, price, ram, os);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Laptop) {
            Laptop laptop = (Laptop) obj;
            return name.equals(laptop.name) && price == laptop.price;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return 17 * name.hashCode() + 31 * price;
    }

}
