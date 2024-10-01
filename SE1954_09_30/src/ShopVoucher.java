
public class ShopVoucher extends Voucher {

    // Constructor
    public ShopVoucher(String VID,
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
        return "ShopVoucher{\n" + super.toString() + "}";
    }
}
