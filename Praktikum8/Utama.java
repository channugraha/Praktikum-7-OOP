        import java.util.*;

public class Utama {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("Dennis Raze");
        customer.setAddress("Kp.Durian Runtuh");

        Order order = new Order();
        order.setDate(new Date());
        order.setStatus("Processed");

        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setQuantity(3);
        orderDetail.setTaxStatus("Taxable");

        Item item = new Item();
        item.setShippingWeight(5);
        item.setDescription("Tools");

        Cash cash = new Cash();
        cash.setAmount(200);
        cash.setCashTendered(200);

        Check check = new Check();
        check.setName("Dennis Raze");
        check.setBankID("112233");

        Credit credit = new Credit();
        credit.setNumber("1122334455");
        credit.setType("MasterCard");
        credit.setExpDate(new Date());

        System.out.println("Nama : " + customer.getName());
        System.out.println("Alamat : " + customer.getAddress());
        System.out.println("Tanggal : " + order.getDate());
        System.out.println("Status : " + order.getStatus());
        System.out.println("Jumlah : " + orderDetail.getQuantity());
        System.out.println("Status Pajak : " + orderDetail.getTaxStatus());
        System.out.println("Berat Kirim : " + item.getShippingWeight() + "Kg");
        System.out.println("Deskripsi : " + item.getDescription());
        System.out.println("Jumlah : " + cash.getAmount());
        System.out.println("Uang Tunai : " + cash.getCashTendered());
        System.out.println("Nama : " + check.getName());
        System.out.println("ID Bank : " + check.getBankID());
        System.out.println("Nomor : " + credit.getNumber());
        System.out.println("Jenis : " + credit.getType());
        System.out.println("Tanggal Kadaluarsa : Jan 28 2024");
    }
}