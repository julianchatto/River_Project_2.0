import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RiverRunner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();


        int riverLength = 0;
        int simulations = 0;

        while (riverLength < 20) {
            System.out.println("How large would you like the river to be? (>= 20)");
            riverLength = s.nextInt();
        }
        while (simulations < 20) {
            System.out.println("How many simulations would you like to run? (>= 20)");
            simulations = s.nextInt();
        }


        ArrayList<Animal> river = new ArrayList<>();


        // TODO: Construct River
        while ((getBigBearCount(river) < 1) || (getBabyBearCount(river) < 2) || (getBabyFishCount(river) < 2) || (getBigFishCount(river) < 2)) {
            for (int i = 0; i < riverLength; i++) {
                int r1 = r.nextInt(100);
                if (r1 < 40) { // empty river
                    river.add(new Water());
                } else if (r1 <= 55)  { // Baby bear
                    river.add(new BabyBear());
                } else if (r1 < 65) { // Fish
                    river.add(new BigFish());
                } else if (r1 < 95){ // baby fih
                    river.add(new BabyFish());
                } else { // bear
                    river.add(new BigBear());
                }

            }
        }

        System.out.println("Original river: " + arrayPrinter(river));


        // TODO: Form Interactions
        while (simulations != 0) {
            for (int i = 0; i < river.size(); i++) {
                river.get(i).setAge(river.get(i).getAge() + 1);
                river.get(i).setHunger(river.get(i).getHunger() - .3);

                //river = checkCharacteristics(river);

                if (river.get(i).getAnimaltype().equals("Big Bear")) {
                    if (river.get(i).getAge() > 50) {
                        river.set(i, new Water());
                        break;
                    }
                }
                if (river.get(i).getAnimaltype().equals("Big Fish")) {
                    if (river.get(i).getAge() > 20) {
                        river.set(i, new Water());
                        break;
                    }
                }
                if (river.get(i).getHunger() <=0) {
                    river.set(i, new Water());
                    break;
                }

                if (river.get(i).getAnimaltype().equals("Baby Fish")) {
                    if (river.get(i).getAge() > 6) {
                        river.set(i, new BigFish());

                    }
                }
                if (river.get(i).getAnimaltype().equals("Baby Bear")) {
                    if (river.get(i).getAge() > 14) {
                        river.set(i, new BigBear());
                    }
                }
                int r1 = r.nextInt(3);
                if (r1 == 0) {

                }

            }


            System.out.println(arrayPrinter(river));
            simulations--;
        }




    }

    public static int getBigBearCount(ArrayList<Animal> n){
        int count = 0;
        for (Animal x : n) {
            if (x.getAnimaltype().equals("Big Bear"))
                count++;
        }
        return count;
    }
    public static int getBabyBearCount(ArrayList<Animal> n ){
        int count = 0;
        for (Animal x : n) {
            if (x.getAnimaltype().equals("Big Bear"))
                count++;
        }
        return count;
    }
    public static int getBigFishCount(ArrayList<Animal> n ){
        int count = 0;
        for (Animal x : n) {
            if (x.getAnimaltype().equals("Big Bear"))
                count++;
        }
        return count;
    }
    public static int getBabyFishCount(ArrayList<Animal> n ){
        int count = 0;
        for (Animal x : n) {
            if (x.getAnimaltype().equals("Big Bear"))
                count++;
        }
        return count;
    }
    public static String arrayPrinter(ArrayList<Animal> n ) {
        String array = "[ ";
        for (Animal x: n)
            array += x.getAnimaltype() + ", ";
        array += "]";
        return array;
    }

    public static boolean isFood() {
        Random r = new Random();
        int r2 = r.nextInt(2);
        return r2 < 1;

    }

    public static ArrayList<Animal> checkCharacteristics(ArrayList<Animal> n) {
        ArrayList<Animal> river = n;

        return river;
    }
}
