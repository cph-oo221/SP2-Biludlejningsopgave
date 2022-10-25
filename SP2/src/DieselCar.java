public class DieselCar extends AFuelCar
{
    // TODO Registreringsafgiften skal beregnes ud fra beskrivelsen i toppen af opgaven.

    @Override
    public String getFuelType()
    {
        return null;
    }

    @Override
    public int getRegistrationFee()
    {
        return 0;
    }

    public boolean hasParticleFilter()
    {
        //  der fortæller om bilen har et partikelfilter monteret.
        return true;
    }
}
