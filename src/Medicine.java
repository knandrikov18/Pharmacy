import java.time.LocalDate;

public class Medicine {
    public String medicineName;
    public int price;
    public int quantity;
    public String dateOfExpiring;
    public LocalDate expirationDate;

    public Medicine() {
        this.medicineName = medicineName;
        this.price = price;
        this.quantity = quantity;
        this.dateOfExpiring = dateOfExpiring;
    }

    @Override
    public String toString() {
        return "Medicine{" +
                "medicineName='" + medicineName + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", dateOfExpiring='" + dateOfExpiring + '\'' +
                '}';
    }

    public String getMedicineName() {
        return medicineName;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getDateOfExpiring() {
        return dateOfExpiring;
    }
}
