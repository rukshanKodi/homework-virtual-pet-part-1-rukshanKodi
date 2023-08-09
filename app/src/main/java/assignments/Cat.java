package assignments;

import java.util.stream.Stream;

public class Cat {
    public int hunger;
    private int thirst;
    private int boredom;
    private int parasites;
    public boolean alive = true;
    private int maxVal;

    public void cat(int hunger, int thirst, int boredom, int parasites, boolean alive, int maxVal) {
        this.hunger = hunger;
        this.parasites = parasites;
        this.boredom = boredom;
        this.parasites = parasites;
        this.alive = alive;
        this.maxVal = maxVal;

    }

    public void infoView() {
        System.out.println( System.lineSeparator()+"I'm hungry :" + hunger);
        System.out.println("I'm thirsty :" + thirst);
        System.out.println("I'm boredom :" + boredom);
        System.out.println("I'm parasites :" + parasites);

    }

    public void tick() {
        if ((hunger > 50 || thirst > 50 || boredom > 50 || parasites > 50)) {

            alive = false;
        } else {
            hunger = hunger + 5;
            thirst = thirst + 5;
            boredom = boredom + 5;
            parasites = parasites + 5;
        }

        System.out.println("aa");
    }

    public void feed() {

        hunger = hunger - 10;
        thirst = thirst + 5;
        boredom = boredom + 5;
        parasites = parasites + 5;
    }

    public void water() {

        hunger = hunger + 5;
        thirst = thirst - 10;
        boredom = boredom + 5;
        parasites = parasites + 5;
    }

    public void boredom() {

        hunger = hunger + 5;
        thirst = thirst + 5;
        boredom = boredom - 10;
        parasites = parasites + 5;
    }

    public void parasites() {

        hunger = hunger + 5;
        thirst = thirst + 5;
        boredom = boredom + 5;
        parasites = parasites - 10;
    }

    public void animate() {
        maxVal = Math.max(Math.max(hunger, boredom), Math.max(boredom, parasites));
        char incomplete = '░';
        char complete = '█';
        StringBuilder builder = new StringBuilder();

        Stream.generate(() -> incomplete).limit(50).forEach(builder::append);

        // System.out.println(msg);
        while (maxVal < 70) {
            try {
                builder.replace(maxVal, maxVal, String.valueOf(complete));

                String progressBar = "\r" + " " + builder + " "+ maxVal ;
                System.out.print(progressBar + System.lineSeparator());
                 break;
            } catch (Exception ignore) {
            }
        }
    }

    public void Status() {
        // alive = true;

    }

    public int getThirst() {
        return thirst;
    }

    public void setThirst(int thirst) {
        this.thirst = thirst;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getBoredom() {
        return boredom;
    }

    public void setBoredom(int boredom) {
        this.boredom = boredom;
    }

    public int getParasites() {
        return parasites;
    }

    public void setParasites(int parasites) {
        this.parasites = parasites;
    }

    public void feed(int i, int j) {
    }

    public boolean isAlive() {
        return alive;
    }

    public int getMaxVal() {
        return maxVal;
    }

    public void setMaxVal(int maxVal) {
        this.maxVal = maxVal;
    }

}
