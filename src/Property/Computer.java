package Property;

public class Computer extends TangibleAsset {

    private String makerName;

    public Computer(String name, int price, String color, String makerName, double weight) {
        super(name, price, color, weight);
        this.makerName = makerName;
    }

    public String getmakerName() {
        return makerName;
    }

    public void setIsbn(String makerName) {
        this.makerName = makerName;
    }


}
