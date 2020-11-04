package academy.belhard;

public class Car extends Vehicle implements Costable {
    private int car_cost;
    private int doorsCount;


    public Car(int wc, int dc, int cc) {
        super(wc);
        this.doorsCount = dc;
        this.car_cost = cc;
    }


    @Override
    protected void printInfo() {
        System.out.println("Транспортное средство: Машина" + "\n" + "Количество дверей: " + doorsCount + "\n"
                + "Количество колес: " + wheelCount + "\n" + "Цена: " + getCost());
    }

    @Override
    public int getCost() {
        return car_cost;
    }
}
