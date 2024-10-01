
public class ShopeeVoucher extends Voucher {

    // Constructor
    public ShopeeVoucher(String VID,
            int discountInPercentage,
            int maxDiscount,
            int minPOValue,
            String applyFromDate,
            String applyToDate,
            int applyToCusType) {
        super(VID, 
                discountInPercentage,
                maxDiscount, 
                minPOValue, 
                applyFromDate, 
                applyToDate, 
                applyToCusType);
    }

    // toString method
    @Override
    public String toString() {
        return "ShopeeVoucher{\n" + super.toString() + "}";
    }
}
