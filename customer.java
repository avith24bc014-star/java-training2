package code;

public class customer {
    int customer_id;
    String name;
    double bill;

    public customer(int customer_id, String name, double bill) {
        this.customer_id = customer_id;
        this.name = name;
        this.bill = bill;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public String getName() {
        return name;
    }

    public double getBill() {
        return bill;
    }
}
