import java.util.Random;

public class FlipCoin {

    public static void main(String[] args) {

        // 50% de chance superior, 50% de chance inferior
        Random rand = new Random();
        double chance = rand.nextDouble();
        System.out.println(chance);
        if (chance  < 0.5) {
        System.out.println("superior!");
     
    }
        else{
            System.out.println("inferior!");
        }
        }
    }

