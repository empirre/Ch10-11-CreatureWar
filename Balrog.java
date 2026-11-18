
/**
 * Write a description of class Balrog here.
 *
 * @author (Saba Machavariani)
 * @version (11/06/2026)
 */
public class Balrog extends Demon
{
    // instance variables - replace the example below with your own
    private static final int MAX_BALROG_HP = 200;
    private static final int MIN_BALROG_HP = 80;
    private static final int MAX_BALROG_STR = 100;
    private static final int MIN_BALROG_STR = 50;

    /**
     * Constructor for objects of class Balrog
     */
    public Balrog()
    {
        super(
            Randomizer.nextInt(MAX_BALROG_STR - MIN_BALROG_STR + 1) + MIN_BALROG_STR - 1,
            Randomizer.nextInt(MAX_BALROG_HP - MIN_BALROG_HP + 1) + MIN_BALROG_HP - 1);
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
       damage = damage + super.attack();

        return damage;
    }
}