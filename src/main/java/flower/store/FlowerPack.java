package flower.store;

import lombok.Getter;
import lombok.Setter;

public class FlowerPack {
    private Flower flower;
    private int amount;
    @Getter @Setter
    private double packetPrice;
    public FlowerPack(Flower newFlower, int newAmount){
        flower = newFlower;
        amount = newAmount;
    }
    public void setPacketPrice(){
        packetPrice = flower.getPrice() * amount;
    }
}
