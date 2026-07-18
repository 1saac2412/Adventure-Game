public class Player extends Entity
{
    private double level;
    private int coints;


    public Player()
    {
        super();
        this.level = 1;
        this.coints = 0;
    }


    // Getters
    public double getLevel()
    {
        return this.level;
    }
    public int getCoints()
    {
        return this.coints;
    }

    // Setters
    public void setLevel(double level)
    {
        this.level = level;
    }
    public void addCoins(int coints)
    {
        this.coints += coints;
    }

}