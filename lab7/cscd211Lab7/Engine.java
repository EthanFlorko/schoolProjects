package lab7.cscd211Inheritance;

public class Engine implements Comparable<Engine>
{
    private String manufacturer;
    protected int horsePower;

    /**
     * @param manufacturer representing string manufacturer
     * @param horsePower representing int horsePower
     */
    public Engine(final String manufacturer, final int horsePower)
    {
        this(horsePower, manufacturer);

    }

    /**
     * Constructor
     */
    public Engine(final int horsePower, final String manufacturer)
    {
        if(manufacturer == null || manufacturer.isEmpty())
            throw new IllegalArgumentException("Bad Engine");

        if(horsePower < 1)
            throw new IllegalArgumentException("Bad Engine");

        this.horsePower = horsePower;
        this.manufacturer = manufacturer;
    }

    /**
     * toString returning manufacturer
     */
    public String toString()
    {
        return "Manufacturer: " + this.manufacturer + " with HP of " + this.horsePower;
    }

    /**
     * Method to divide horsePower by 5
     */
    public int calcOutput()
    {
        return this.horsePower / 5;

    }

    /**
     * Returns this manufacturer
     */
    public String getManufacturer(){return this.manufacturer;}

    /**
     * Compares horsePower. If horsepower is the same, then it compares manufacturer.
     */
    public int compareTo(final Engine pi)
    {
        int res = this.horsePower - pi.horsePower;
        if(res != 0)
            return res;

        return this.manufacturer.compareTo(pi.manufacturer);

    }

}