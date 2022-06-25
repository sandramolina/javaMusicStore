package behaviours;

public interface ISell {
    Sellable getItem();
    double getCostPrice();
    double getRetailPrice();
    void setRetailPrice(double retailPrice);
    double calculateMarkup();

}
