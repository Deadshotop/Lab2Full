package MyBrodyagi;
import ru.ifmo.se.pokemon.*;
import MyAbilki.*;

public class Rockruff extends Pokemon{
    public Rockruff(String name, int level){
        super(name, level);
        setStats(45, 65,40, 30, 40, 60);
        setType(Type.ROCK);
        setMove(new Crunch(), new Snarl(), new RockClimb());
    }
}
