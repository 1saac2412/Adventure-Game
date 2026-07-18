public class Entity
{
    private String name;
    private float attackPower;
    private float health;

    public Entity()
    {
        this.name = "Entity";
        this.health = 100.0f;
        this.attackPower = 0.1f;
    }

    public Entity(String name, float health, float attackPower)
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

    public float getHealth()
    {
        return this.health;
    }
    public float getAttackPower()
    {
        return this.attackPower;
    }


    // Setters
    public void setName(String name)
    {
        this.name = name;
    }
    public void setHealth(float health)
    {
        this.health = health;
    }
    public void setAttackPower(float attackPower)
    {
        this.attackPower = attackPower;
    }

    public void attack(Entity entity)
    {
        entity.setHealth(entity.getHealth() - this.attackPower);
    }
}