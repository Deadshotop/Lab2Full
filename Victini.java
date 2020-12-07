package MyBrodyagi;
import ru.ifmo.se.pokemon.*;
import MyAbilki.*;

public class Victini extends Pokemon{
    public Victini(String name, int level){
        super(name, level);
        setStats(100, 100,100, 100, 100, 100);
        setType(Type.FIRE, Type.PSYCHIC);
        setMove(new Confide(), new FlareBlitz(), new DoubleTeam(), new Thunderbolt());
    }
}