package pt.up.fe.ldts.example1;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<OrderLine> lines;

    public Order() {
        lines = new ArrayList<>();
    }

    public void add(Product product, int quantity) {
        lines.add(new OrderLine(product, quantity));
    }

    public boolean isElegibleForFreeDelivery() {
        double total = getTotal();

        if (total > 100) return true;
        return false;
    }

    private double getTotal() {
        double total = 0;

        for (OrderLine line : lines)
            total += line.getTotal();
        return total;
    }

    public String printOrder() {
        StringBuffer printBuffer = new StringBuffer();

        for (OrderLine line : lines)
            line.print(printBuffer);

        double total = getTotal();

        printBuffer.append("Total: " + total);

        return printBuffer.toString();
    }

}