package lab7.cscd211Inheritance;

/**
 * The TruckEngine class is a child of the Engine class.  It contains an additional parameter, and a boolean
 */
public class TruckEngine extends Engine
{
    private boolean diesel;

    /**
     * TruckEngine first calls the appropriate constructor of Engine and then sets the boolean
     */
    public TruckEngine(final String manufacturer, final int horsePower, final boolean diesel)
    {
        super(manufacturer, horsePower);

        this.diesel = diesel;
    }

    /**
     * This toString returns Manufacturer the value with HP of the horse power value The to String returns Truck Engine - the value + a call to the Engine class toString and (is a diesel engine or is NOT a diesel engine) depending on the boolean diesel
     */
    public String toString()
    {
        return "Truck Engine - " + super.toString() + (this.diesel ? " is a diesel engine" : " is NOT a diesel engine") ;
    }

    /**
     * The calcOutput method first grabs the value from the Engine calcOutput method. If the TruckEngine is a diesel engine that value is divided by 18 otherwise the value is divided by 8 for non-diesel.
     */
    public int calcOutput()
    {
        if(this.diesel)
            return super.calcOutput() / 18;


        return super.calcOutput() / 8;
    }



}