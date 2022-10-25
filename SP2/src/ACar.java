public abstract class ACar implements Car
{
    public String registrationNumber;
    public String make;
    public String model;
    public int numberOfDoors;

    //The number on the number plate
    public abstract String getRegistrationNumber();

    // The make of the car e.g. Audi
    public abstract String getMake();

    // The model of the car e.g. A6
    public abstract String getModel();

    // The number of doors
    public abstract int getNumberOfDoors();
}
