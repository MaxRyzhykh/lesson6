package academy.belhard;

public class Car extends Vehicle {
    private int doorsCount;


    public Car(int wc, int dc) {
        super(wc);
        this.doorsCount = dc;
    }


    @Override
    protected void printInfo() {
        System.out.println("Транспортное средство: Машина" + "\n" + "Количество дверей: " + doorsCount + "\n" + "Количество колес: " + wheelCount);
    }
}
