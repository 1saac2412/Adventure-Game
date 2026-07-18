public class Entity
{
    private String name;
    private double attackPower;
    private double health;

    public Entity()
    {
        this.name = "Entity";
        this.health = 100.0;
        this.attackPower = 5;
    }

    public Entity(String name, double health, double attackPower)
    {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    // Getters
    public String getName()
    {
        return this.name;
    }

    public double getHealth()
    {
        return this.health;
    }
    public double getAttackPower()
    {
        return this.attackPower;
    }


    // Setters
    public void setName(String name)
    {
        this.name = name;
    }
    public void setHealth(double health)
    {
        this.health = health;
    }
    public void setAttackPower(double attackPower)
    {
        this.attackPower = attackPower;
    }

    public void attack(Entity entity)
    {
        entity.setHealth(Math.round(entity.getHealth() - (this.attackPower + Math.random()*10)) );
    }
}