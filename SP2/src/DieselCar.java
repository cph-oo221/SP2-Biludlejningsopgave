public class DieselCar extends AFuelCar
{
    // TODO Registreringsafgiften skal beregnes ud fra beskrivelsen i toppen af opgaven.

    protected final boolean particleFilter;

    public DieselCar(String registrationNumber, String make, String model, int numberOfDoors, boolean particleFilter, int kmPrlitre)
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
            registrationFee += 15260;
        }
        else if (kmPrlitre < 10)
        {
            registrationFee += 2770;
        }
        else if (kmPrlitre < 15)
        {
            registrationFee += 1850;
        }
        else if (kmPrlitre < 20)
        {
            registrationFee += 1390;
        }
        else
        {
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
        //  der fortæller om bilen har et partikelfilter monteret.
        return particleFilter;
    }

    @Override
    public String toString()
    {
        return "DieselCar{" +
                "particleFilter=" + particleFilter +
                ", kmPrlitre=" + kmPrlitre +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", numberOfDoors=" + numberOfDoors +
                "} " + super.toString();
    }
}