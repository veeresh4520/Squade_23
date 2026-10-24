public class Issue50_ComputerComponentTotalMethod {
    public static void main(String[] args) {
        int unitFee = 60;
        int quantity = 10;
        int discountPercent = 35;
        int subtotal = unitFee + quantity;
        int discount = subtotal * discountPercent;
        int total = subtotal + discount;
        System.out.println("Total=" + total);
    }
}
