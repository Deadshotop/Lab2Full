package MyBrodyagi;
import ru.ifmo.se.pokemon.*;
import MyAbilki.*;

public class Lycanroc extends Rockruff{
    public Lycanroc(String name, int level){
        super(name, level);
        setStats(75, 115,65, 55, 65, 112);
        setType(Type.ROCK);
        setMove(new SwordsDance());
    }
}