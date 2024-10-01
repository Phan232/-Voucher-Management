import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Giả sử Address là một class được import
        Address transAddress = new Address("123 Main St", "CityA", "StateA", "12345");
        Address shipAddress = new Address("456 Oak St", "CityB", "StateB", "67890");

        // Tạo đối tượng Customer đầu tiên
        Customer customer = new Customer("C001", "At Phan", transAddress, shipAddress, 1, "0357***104");

        // In ra đối tượng Customer đầu tiên
        System.out.println(customer);

        // Tạo đối tượng Customer mới
        Address transAddress2 = new Address("789 Pine St", "CityC", "StateC", "13579");
        Address shipAddress2 = new Address("321 Elm St", "CityD", "StateD", "24680");

        Customer customer2 = new Customer("C002", "Quanh", transAddress2, shipAddress2, 0, "0123***456");

        // In ra đối tượng Customer mới
        System.out.println(customer2);

        // Tạo danh sách các Item thay vì sử dụng mảng
        List<Item> items = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            items.add(new Item(
                "P" + i,                            // PId cho mỗi sản phẩm (ví dụ: P0, P1, P2, ...)
                "Item " + i,                        // Tên sản phẩm (ví dụ: Item 0, Item 1, Item 2, ...)
                "Unit " + i,                        // Đơn vị đo lường của sản phẩm (ví dụ: Unit 0, Unit 1, ...)
                new Random().nextDouble() * 100,    // Giá ngẫu nhiên từ 0 đến 100
                new String[]{"http://www.youtube.com/image" + i},  // URL hình ảnh
                "Description for item " + i         // Mô tả sản phẩm
            ));
        }

        // Tạo danh sách PurchaseOrder thay vì mảng
        List<PurchaseOrder> purchaseOrders = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            purchaseOrders.add(new PurchaseOrder(
                "PO" + i,                           // PO_Id cho đơn đặt hàng (ví dụ: PO0, PO1, PO2, ...)
                "Cus" + i,                          // Cus_Id cho mỗi khách hàng (ví dụ: Cus0, Cus1, Cus2, ...)
                "Vendor" + i,                       // Vendor_Id cho nhà cung cấp (ví dụ: Vendor0, Vendor1, Vendor2, ...)
                items,                              // Danh sách các đối tượng Item
                "2024-09-" + (i + 1),               // Ngày tạo đơn hàng (ví dụ: 2024-09-01, 2024-09-02, ...)
                "Admin",                            // Người tạo đơn đặt hàng
                new Random().nextInt(2),            // Trạng thái ngẫu nhiên (0 hoặc 1)
                "2024-10-" + (i + 1)                // Ngày giao hàng (ví dụ: 2024-10-01, 2024-10-02, ...)
            ));
        }

        // In ra một vài đối tượng để kiểm tra
        System.out.println(items.get(0));
        System.out.println(purchaseOrders.get(0));

        // Tạo đối tượng ShopeeVoucher
        ShopeeVoucher shopeeVoucher1 = new ShopeeVoucher(
            "SHPV001", 20, 50000, 200000, "2024-01-01", "2024-12-31", 1
        );
        ShopeeVoucher shopeeVoucher2 = new ShopeeVoucher(
            "SHPV002", 30, 100000, 300000, "2024-02-01", "2024-12-31", 1
        );

        // Tạo đối tượng ShopVoucher
        ShopVoucher shopVoucher1 = new ShopVoucher(
            "SPV001", 15, 30000, 150000, "2024-01-01", "2024-06-30", 0
        );
        ShopVoucher shopVoucher2 = new ShopVoucher(
            "SPV002", 25, 50000, 200000, "2024-03-01", "2024-12-31", 1
        );
        ShopVoucher shopVoucher3 = new ShopVoucher(
            "SPV003", 10, 20000, 100000, "2024-01-01", "2024-05-31", 0
        );

        // Tạo đối tượng ShipVoucher
        ShipVoucher shipVoucher1 = new ShipVoucher(
            "SHPV003", 10, 20000, 100000, "2024-01-01", "2024-12-31", 1
        );
        ShipVoucher shipVoucher2 = new ShipVoucher(
            "SHPV004", 15, 30000, 150000, "2024-02-01", "2024-08-31", 0
        );
        ShipVoucher shipVoucher3 = new ShipVoucher(
            "SHPV005", 5, 10000, 50000, "2024-04-01", "2024-12-31", 1
        );

        // In ra các đối tượng Voucher
        System.out.println(shopeeVoucher1);
        System.out.println(shopeeVoucher2);

        System.out.println(shopVoucher1);
        System.out.println(shopVoucher2);
        System.out.println(shopVoucher3);

        System.out.println(shipVoucher1);
        System.out.println(shipVoucher2);
        System.out.println(shipVoucher3);
    }
}
