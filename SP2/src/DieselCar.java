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
            registrationFee += 10470; // additional fee
            registrationFee += 15260; // equalization tax
        }
        else if (kmPrlitre < 10)
        {
            registrationFee += 5500; // additional fee
            registrationFee += 2770; // equalization tax
        }
        else if (kmPrlitre < 15)
        {
            registrationFee += 2340; // additional fee
            registrationFee += 1850; // equalization tax
        }
        else if (kmPrlitre < 20)
        {
            registrationFee += 1050; // additional fee
            registrationFee += 1390; // equalization tax
        }
        else
        {
            registrationFee += 330; // additional fee
            registrationFee += 130; // equalization tax
        }

        // check for an additional particle emission tax
        // if a car does not have a particulate filter fitted.
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
        return "DieselCar: " +
                " | kmPrlitre: " + kmPrlitre +
                " | registrationNumber: " + registrationNumber +
                " | make: " + make + " | model: " + model +
                " | numberOfDoors: " + numberOfDoors +
                " | particleFilter: " + particleFilter +" |";
    }
}
