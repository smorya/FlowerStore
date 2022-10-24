package flower.store;

public class Store {
    public void search(Flower flowerToFind) {
        FlowerType type = flowerToFind.getFlowerType();

        switch (type) {
            case ROSE:
                System.out.println("Here you are, rose!");
                break;
            case CHAMOMILE:
                System.out.println("Here you are, chamomile!");
                break;
            case TULIP:
                System.out.println("Here you are, tulip!");
                break;
        }
    }
}

