public class Driver extends Worker implements DriveCar{
    public Driver(String name) {
        super(name);
    }

    @Override
    public void driveCar() {
        System.out.println("Вожу машину");

    }
}
