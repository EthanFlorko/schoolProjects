package lab7.cscd211Inheritance;

public class CarEngine extends Engine
{
    /**
     * CarEngine calls the constructor of Engine
     */
    public CarEngine(final String manufacturer, final int horsePower)
    {
        super(manufacturer, horsePower);
    }

    /**
     * CarEngine calls the appropriate constructor of Engine.
     */
    public CarEngine(final int horsePower, final String manufacturer)
    {
        super(manufacturer, horsePower);
    }

    /**
     * The toString returns Car Engine and the value from the toString in the Engine class
     */
    public String toString()
    {
        return "Car Engine - " + super.toString();
    }

    /**
     * This method calls the calcOutput from the Engine class and then divides that value by 12
     */
    public int calcOutput()
    {
        return super.calcOutput() / 12;
    }

}