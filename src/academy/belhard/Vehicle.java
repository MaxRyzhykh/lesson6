package academy.belhard;

public abstract class Vehicle {
    protected int wheelCount;

    public Vehicle(int wc){
        this.wheelCount = wc;
    }


    protected abstract void printInfo();
}
