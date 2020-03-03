public class Sedan extends Vehicle implements Price
{
    private String make;
    private int year;

    public Sedan(String colour, String make, int year)
    {
        super(colour);
        this.make = make;
        this.year = year;
    }

    public String getMake()
    {
        return make;
    }

    public int getYear()
    {
        return year;
    }

    public void setMake()
    {
        this.make = make;
    }

    public void setYear()
    {
        this.year = year;
    }

    @Override
    public String toString()
    {
        return "Sedan \n" + "Make: " + make + "Colour: " + getColour() + "Year: " + year;
    }

    @Override
    public void Price()
    {
        System.out.println("Price: R50 000");
    }
}
