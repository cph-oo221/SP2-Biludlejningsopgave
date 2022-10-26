public class DieselCar extends AFuelCar
{
    private final boolean particleFilter;

    public DieselCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrlitre, boolean particleFilter)
    {
        super(registrationNumber, make, model, numberOfDoors, kmPrlitre);
        this.particleFilter = particleFilter;
    }

    @Override
    public String getRegistrationNumber()
    {
        return registrationNumber;
    }

    @Override
    public String getMake()
    {
        return make;
    }

    @Override
    public String getModel()
    {
        return model;
    }

    @Override
    public int getNumberOfDoors()
    {
        return numberOfDoors;
    }

    @Override
    public String getFuelType()
    {
        return "Diesel";
    }

    @Override
    public int getRegistrationFee()
    {
        int registrationFee = 0;
        if (kmPrlitre < 5)
        {
            registrationFee += 10470;
            registrationFee += 15260;
        }
        else if (kmPrlitre < 10)
        {
            registrationFee += 5500;
            registrationFee += 2770;
        }
        else if (kmPrlitre < 15)
        {
            registrationFee += 2340;
            registrationFee += 1850;
        }
        else if (kmPrlitre < 20)
        {
            registrationFee += 1050;
            registrationFee += 1390;
        }
        else
        {
            registrationFee += 330;
            registrationFee += 130;
        }

        if(!hasParticleFilter())
        {
            registrationFee += 1000;
        }
        return registrationFee;
    }

    public boolean hasParticleFilter()
    {
        return particleFilter;
    }

    @Override
    public String toString()
    {
        return "DieselCar: " + "| particleFilter: " + particleFilter +
                " | kmPrlitre: " + kmPrlitre +
                " | registrationNumber: " + registrationNumber +
                " | make: " + make + " | model: " + model +
                " | numberOfDoors: " + numberOfDoors + " |";
    }
}
