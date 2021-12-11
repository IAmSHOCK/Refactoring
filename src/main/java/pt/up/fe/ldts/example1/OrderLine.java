package pt.up.fe.ldts.example1;

public class OrderLine {
    private Product product;
    private int quantity;

    public OrderLine(Product product, int quantity) {
        this.setProduct(product);
        this.setQuantity(quantity);
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    double getTotal() {
        return getProduct().getPrice() * getQuantity();
    }

    void print(StringBuffer printBuffer) {
        printBuffer.append(getProduct().getName() + "(x" + getQuantity() + "): " + (getProduct().getPrice() * getQuantity()) + "\n");
    }
}
