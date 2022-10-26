public abstract class ACar implements Car
{
    protected String registrationNumber;
    protected String make;
    protected String model;
    protected int numberOfDoors;

    public ACar(String registrationNumber, String make, String model, int numberOfDoors)
    {
        this.registrationNumber = registrationNumber;
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
    }

    //The number on the number plate
    public String getRegistrationNumber()
    {
        return registrationNumber;
    }

    // The make of the car e.g. Audi
    public String getMake()
    {
        return make;
    }

    // The model of the car e.g. A6
    public String getModel()
    {
        return model;
    }

    // The number of doors
    public int getNumberOfDoors()
    {
        return numberOfDoors;
    }

    @Override
    public String toString()
    {
        return "ACar{" +
                "registrationNumber='" + registrationNumber + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", numberOfDoors=" + numberOfDoors +
                '}';
    }
}
