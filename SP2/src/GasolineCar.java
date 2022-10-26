public class GasolineCar extends AFuelCar
{
    // TODO Registreringsafgiften skal beregnes ud fra beskrivelsen i toppen af opgaven.
    public GasolineCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrlitre)
    {
        super(registrationNumber, make, model, numberOfDoors, kmPrlitre);
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
        return "Gasoline";
    }


    @Override
    public int getRegistrationFee()
    {
        if (kmPrlitre < 5)
        {
            return 10470;
        }
        else if (kmPrlitre < 10)
        {
            return 5500;
        }
        else if (kmPrlitre < 15)
        {
            return 2340;
        }
        else if (kmPrlitre < 20)
        {
            return 1050;
        }
        else
        {
            return 330;
        }
    }

    @Override
    public String toString()
    {
        return "GasolineCar{" +
                "kmPrlitre=" + kmPrlitre +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", numberOfDoors=" + numberOfDoors +
                "} " + super.toString();
    }

}
