/**
 * Created by student1 on 17.10.20.
 */
public class Porshe extends Car {
    private int maxspeed;
    private double weight;
    private int horsepower;
    private String name;
    Porshe(int ms, double w, int hp, String n) {
        super(ms, w, hp, n);
        maxspeed = ms;
        weight = w;
        horsepower = hp;
        name = n;
    }

    public void getCar(){
        System.out.print(maxspeed + " " + weight + " " + horsepower + " " + name);
        System.out.println();
    }
}
