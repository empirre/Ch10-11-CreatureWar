
/**
 * Write a description of class Demon here.
 *
 * @author (Saba Machavariani)
 * @version (11/06/2026)
 */
public class Demon extends Creature
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Demon
     */
    public Demon(int str,int hp)
    {
        super(str, hp);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int attack()
    {
        int damage = super.attack();

        if (Randomizer.nextInt(100) < 5)
        {
            damage = damage + 50;
        }

        return damage;
    }
}