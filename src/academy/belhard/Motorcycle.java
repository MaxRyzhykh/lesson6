package academy.belhard;

public class Motorcycle extends Vehicle implements Costable {
    private int motorcycle_cost;
    private int maxSpeed;


    public Motorcycle(int wc, int maxSpeed, int mc) {
        super(wc);
        this.maxSpeed = maxSpeed;
        this.motorcycle_cost = mc;
    }


    @Override
    protected void printInfo() {
        System.out.println("Транспортное средство: Мотоцикл" + "\n" + "Количество дверей: 0" + "\n"
                + "Количество колес: " + wheelCount + "\n" + "Максимальная скорость: " + maxSpeed
                + " км/ч" + "\n" + "Цена: " + getCost());
    }

    @Override
    public int getCost() {
        return motorcycle_cost;
    }
}
