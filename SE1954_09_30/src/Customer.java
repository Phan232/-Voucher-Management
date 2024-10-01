//thông tin khách hành
public class Customer {
    private String CusId;       // Mã khách hàng
    private String Name;        // Tên khách hàng
    private Address transAddress; // Địa chỉ giao dịch
    private Address shipAddress;  // Địa chỉ giao hàng
    private int CusType;        // Loại khách hàng (0: thường, 1: VIP)
    private String PhoneNo;     // Số điện thoại

    // Constructor
    public Customer(String CusId, String Name, Address transAddress, Address shipAddress, int CusType, String PhoneNo) {
        this.CusId = CusId;
        this.Name = Name;
        this.transAddress = transAddress;
        this.shipAddress = shipAddress;
        this.CusType = CusType;
        this.PhoneNo = PhoneNo;
    }
    public String getCusId() {
        return CusId;
    }

    public void setCusId(String CusId) {
        this.CusId = CusId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public Address getTransAddress() {
        return transAddress;
    }

    public void setTransAddress(Address transAddress) {
        this.transAddress = transAddress;
    }

    public Address getShipAddress() {
        return shipAddress;
    }

    public void setShipAddress(Address shipAddress) {
        this.shipAddress = shipAddress;
    }

    public int getCusType() {
        return CusType;
    }

    public void setCusType(int CusType) {
        this.CusType = CusType;
    }

    public String getPhoneNo() {
        return PhoneNo;
    }

    // Getters và Setters
    // ... (tương tự code của bạn)
    public void setPhoneNo(String PhoneNo) {
        this.PhoneNo = PhoneNo;
    }

    // toString method
    @Override
    public String toString() {
        return "Customer{\n" +
                "  CusId='" + CusId + "',\n" +
                "  Name='" + Name + "',\n" +
                "  transAddress=" + transAddress + ",\n" +
                "  shipAddress=" + shipAddress + ",\n" +
                "  CusType=" + CusType + ",\n" +
                "  PhoneNo='" + PhoneNo + "'\n" +
                '}';
    }
}
