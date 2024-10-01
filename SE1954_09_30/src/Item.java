import java.util.Arrays;

public class Item {
    private String PId;
    private String Name;
    private String Unit;
    private double Price;
    private String[] Imges;
    private String Desc;

    public Item(String PId, String Name, String Unit, double Price, String[] Imges, String Desc) {
        this.PId = PId;
        this.Name = Name;
        this.Unit = Unit;
        this.Price = Price;
        this.Imges = Imges;
        this.Desc = Desc;
    }
    public String getPId() {
        return PId;
    }

    public void setPId(String PId) {
        this.PId = PId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getUnit() {
        return Unit;
    }

    public void setUnit(String Unit) {
        this.Unit = Unit;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public String[] getImges() {
        return Imges;
    }

    public void setImges(String[] Imges) {
        this.Imges = Imges;
    }

    public String getDesc() {
        return Desc;
    }

    // Getters và Setters
    // ... (tương tự code của bạn)
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    // toString method
    @Override
    public String toString() {
        return "Item{\n" +
                "  PId='" + PId + "',\n" +
                "  Name='" + Name + "',\n" +
                "  Unit='" + Unit + "',\n" +
                "  Price=" + Price + ",\n" +
                "  Imges=" + String.join(", ", Imges) + ",\n" +
                "  Desc='" + Desc + "'\n" +
                '}';
    }
}
