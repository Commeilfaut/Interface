import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Driver driver = new Driver("Pole");
        Driver driver2 = new Driver("Fool");
        Driver driver3= new Driver("Print");
        Programmer programmmer = new Programmer("Scote");
        Programmer programmmer2 = new Programmer("Elena");
        Programmer programmmer3 = new Programmer("Mary");
        Cook cook = new Cook("Bann");
        Cook cook2 = new Cook("Brook");
        Cook cook3 = new Cook("Brenda");

        ArrayList<Worker> workers = new ArrayList<>();
        workers.add(driver);
        workers.add(driver2);
        workers.add(driver3);
        workers.add(cook);
        workers.add(cook2);
        workers.add(cook3);
        workers.add(programmmer);
        workers.add(programmmer2);
        workers.add(programmmer3);
        for(Worker worker : workers) {
            worker.voice();
        }

        ArrayList<Driver> drivers = new ArrayList<>();
        drivers.add(driver);
        drivers.add(driver2);
        drivers.add(driver3);
        for (Driver drivercar : drivers) {
            drivercar.driveCar();
        }
        ArrayList<Cook> cooks = new ArrayList<>();
        cooks.add(cook);
        cooks.add(cook2);
        cooks.add(cook3);
        for (Cook cooker : cooks) {
            cooker.CookFood();
        }

        ArrayList<Programmer> programmers = new ArrayList<>();
        programmers.add(programmmer);
        programmers.add(programmmer2);
        programmers.add(programmmer3);
        for (Programmer programmer : programmers) {
            programmer.programming();
        }


    }


}