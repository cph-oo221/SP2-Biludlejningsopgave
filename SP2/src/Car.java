public interface Car
{
    //The number on the number plate
    public String getRegistrationNumber();

    // The make of the car e.g. Audi
    public String getMake();

    // The model of the car e.g. A6
    public String getModel();

    // The number of doors
    public int getNumberOfDoors();

    // Calculates the registration fee for the car
    public int getRegistrationFee();
}
