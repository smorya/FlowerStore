package flower.store;

import lombok.Getter;
import lombok.Setter;



@Setter
public class Flower {
    @Getter
    private double sepalLength;
    private FlowerColor color;
    @Getter
    private double price;
    public void setPrice(int number) {
        price = number;
    }

    @Getter
    private FlowerType flowerType;

    public String getColor() {
        return color.toString();
    }
}
