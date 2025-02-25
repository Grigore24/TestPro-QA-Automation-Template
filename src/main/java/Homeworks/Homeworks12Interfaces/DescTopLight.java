package Homeworks.Homeworks12Interfaces;

public class DescTopLight implements UsElectricalPlug {
    private String model;
    private int price;

    public DescTopLight(String model, int price) {
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void keeProperSize() {
        System.out.println("I keep proper sizes");
    }

    @Override
    public void keeProperMaterials() {
        System.out.println("I keep proper materials");
    }

    @Override
    public String toString() {
        return "DescTopLight{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
