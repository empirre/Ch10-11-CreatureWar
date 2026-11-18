
/**
 * Write a description of class Elf here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Elf extends Creature
{
    // instance variables - replace the example below with your own
    private static final int MAX_ELF_HP = 25;
    private static final int MIN_ELF_HP = 8;
    private static final int MAX_ELF_STR = 18;
    private static final int MIN_ELF_STR = 5;
    /**
     * Constructor for objects of class Elf
     */
    public Elf()
    {
        super(
            Randomizer.nextInt(MAX_ELF_STR - MIN_ELF_STR + 1) + MIN_ELF_STR,
            Randomizer.nextInt(MAX_ELF_HP - MIN_ELF_HP + 1) + MIN_ELF_HP );
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

        if (Randomizer.nextInt(100) < 10)
        {
            damage = damage * 2;
        }

        return damage;
    }
}