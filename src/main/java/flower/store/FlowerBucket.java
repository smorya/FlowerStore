package flower.store;


import java.util.ArrayList;
public class FlowerBucket {
    ArrayList<FlowerPack> flowerBucket = new ArrayList();
    

    public void add(FlowerPack pack){
        flowerBucket.add(pack);


    }
    public double getPrice(){
        double price = 0;
        for (FlowerPack pack:
             flowerBucket) {
            price += pack.getPacketPrice();

        }
        return price;

    }



}
