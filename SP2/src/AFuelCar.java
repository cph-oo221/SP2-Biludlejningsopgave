public abstract class AFuelCar extends ACar
{
    protected int kmPrlitre;
    public AFuelCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrlitre)
    {
        super(registrationNumber, make, model, numberOfDoors);
        this.kmPrlitre = kmPrlitre;
    }

    // should return “Gasoline” or “Diesel”
    public abstract String getFuelType();

    // should return how many kilometres the car can drive on 1 litre of fuel
    public int kmPrLitre()
    {
        return kmPrlitre;
    }
}
