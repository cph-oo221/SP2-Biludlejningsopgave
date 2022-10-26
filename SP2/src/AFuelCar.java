public abstract class AFuelCar extends ACar
{
    protected int kmPrlitre;
    public AFuelCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrlitre)
    {
        super(registrationNumber, make, model, numberOfDoors);
        this.kmPrlitre = kmPrlitre;
    }

    public abstract String getFuelType();

    public int kmPrLitre()
    {
        return kmPrlitre;
    }
}
