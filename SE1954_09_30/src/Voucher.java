public class Voucher {
    private String VID;                // Mã voucher
    private int discountInPercentage;  // Giảm giá dưới dạng phần trăm
    private int maxDiscount;           // Giảm giá tối đa
    private int minPOValue;            // Giá trị đơn hàng tối thiểu để áp dụng
    private String applyFromDate;      // Ngày bắt đầu áp dụng
    private String applyToDate;        // Ngày kết thúc áp dụng
    private int applyToCusType;        // Loại khách hàng được áp dụng (ví dụ: 0 - khách thường, 1 - khách VIP)

    // Constructor
    public Voucher(String VID, 
            int discountInPercentage,
            int maxDiscount, 
            int minPOValue,
            String applyFromDate,
            String applyToDate,
            int applyToCusType) {
        this.VID = VID;
        this.discountInPercentage = discountInPercentage;
        this.maxDiscount = maxDiscount;
        this.minPOValue = minPOValue;
        this.applyFromDate = applyFromDate;
        this.applyToDate = applyToDate;
        this.applyToCusType = applyToCusType;
    }

    // Getters and Setters
    public String getVID() {
        return VID;
    }

    public void setVID(String VID) {
        this.VID = VID;
    }

    public int getDiscountInPercentage() {
        return discountInPercentage;
    }

    public void setDiscountInPercentage(int discountInPercentage) {
        this.discountInPercentage = discountInPercentage;
    }

    public int getMaxDiscount() {
        return maxDiscount;
    }

    public void setMaxDiscount(int maxDiscount) {
        this.maxDiscount = maxDiscount;
    }

    public int getMinPOValue() {
        return minPOValue;
    }

    public void setMinPOValue(int minPOValue) {
        this.minPOValue = minPOValue;
    }

    public String getApplyFromDate() {
        return applyFromDate;
    }

    public void setApplyFromDate(String applyFromDate) {
        this.applyFromDate = applyFromDate;
    }

    public String getApplyToDate() {
        return applyToDate;
    }

    public void setApplyToDate(String applyToDate) {
        this.applyToDate = applyToDate;
    }

    public int getApplyToCusType() {
        return applyToCusType;
    }

    public void setApplyToCusType(int applyToCusType) {
        this.applyToCusType = applyToCusType;
    }

    // toString method
    @Override
    public String toString() {
        return "Voucher{\n" +
                "  VID='" + VID + "',\n" +
                "  discountInPercentage=" + discountInPercentage + "%,\n" +
                "  maxDiscount=" + maxDiscount + ",\n" +
                "  minPOValue=" + minPOValue + ",\n" +
                "  applyFromDate='" + applyFromDate + "',\n" +
                "  applyToDate='" + applyToDate + "',\n" +
                "  applyToCusType=" + applyToCusType + "\n" +
                '}';
    }
}
