package academy.belhard;


public class Main {

    public static void main(String[] args) {
        Car car1 = new Car(4,5,9600);
        Motorcycle motorcycle1 = new Motorcycle(2,360,3600);
        Car car2 = new Car(4,3,15000);
        Motorcycle motorcycle2 = new Motorcycle(3,100,300);


        car1.printInfo();
        motorcycle1.printInfo();
        car2.printInfo();
        motorcycle2.printInfo();
    }
}
