package flower.store;

import lombok.Getter;
import lombok.Setter;
import java.lang.Math;


@Setter
public class Flower {
    @Getter
    private double sepalLength;
    private FlowerColor color;
    private final int MAXIMUM_NUMBER = 100;
    @Getter
    private double price;
    public void setPrice(int number){
        price = Math.min(number, MAXIMUM_NUMBER);
    }


    @Getter
    private FlowerType flowerType;



    public String getColor() {
        return color.toString();
    }
}
