
/**
 * Write a description of class Cyberdemon here.
 *
 * @author (Saba Machavariani)
 * @version (11/06/2026)
 */
public class Cyberdemon extends Demon
{
    // instance variables - replace the example below with your own
    private static final int MAX_CYBERDEMON_HP = 100;
    private static final int MIN_CYBERDEMON_HP = 25;
    private static final int MAX_CYBERDEMON_STR = 40;
    private static final int MIN_CYBERDEMON_STR = 20;
    /**
     * Constructor for objects of class Cyberdemon
     */
    public Cyberdemon()
    {
        super(
            Randomizer.nextInt(MAX_CYBERDEMON_STR - MIN_CYBERDEMON_STR + 1) + MIN_CYBERDEMON_STR,
            Randomizer.nextInt(MAX_CYBERDEMON_HP - MIN_CYBERDEMON_HP + 1) + MIN_CYBERDEMON_HP);
    }
}