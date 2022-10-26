public class ElectricCar extends ACar
{

    // TODO: Lav attributer til battery capacity og max range,
    // TODO: som initialiseres i konstruktøren.
    // TODO: Beregn watt-timer per kilometer ud fra disse to attributter.

    protected int batteryCapacity;
    protected int maxRange;

    public ElectricCar(String registrationNumber, String make, String model, int numberOfDoors,  int batteryCapacity, int maxRange)
    {
        super(registrationNumber, make, model, numberOfDoors);
        this.batteryCapacity = batteryCapacity;
        this.maxRange = maxRange;
    }


    // returns the battery capacity in kilowatt hours
    public int getBatteryCapacityKWh()
    {

        return batteryCapacity;
    }

    // returns the maximum range in kilometres.
    public int getMaxRangeKm()
    {

        return maxRange;
    }

    // returns the power consumption in watt hours per driven kilometre.
    public int getWhPrKm()
    {

        return (getBatteryCapacityKWh() * 1000) / getMaxRangeKm();

    }

    @Override
    public int getRegistrationFee()
    {
        int kmPrlitre = Math.round(100 / (getWhPrKm() / (float) 91.25));

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
    public String toString()
    {
        return "ElectricCar{" +
                "batteryCapacity=" + batteryCapacity +
                ", maxRange=" + maxRange +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", numberOfDoors=" + numberOfDoors +
                "} " + super.toString();
    }
}
