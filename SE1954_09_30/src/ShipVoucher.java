
public class ShipVoucher extends Voucher {

    // Constructor
    public ShipVoucher(String VID,
            int discountInPercentage,
            int maxDiscount,
            int minPOValue,
            String applyFromDate
            , String applyToDate,
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
        return "ShipVoucher{\n" + super.toString() + "}";
    }
}
