import java.util.ArrayList;

public class FleetOfCars
{
    private final ArrayList<Car> fleet = new ArrayList<>();

    public void addCar(Car car)
    {
        fleet.add(car);
    }

    public int getTotalRegistrationFeeForFleet()
    {
        int sum = 0;
        for(Car cars : fleet)
        {
            sum += cars.getRegistrationFee();
        }
        return sum;
    }

    @Override
    public String toString()
    {
        // Each time there is a new car in the fleet is printed
        // it will be on the line below the last car.
        String fleetString = "";
        for(Car cars : fleet)
        {
            fleetString += cars.toString() + " " + "\n";
        }
        return fleetString;
    }
}
