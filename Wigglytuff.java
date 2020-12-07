package MyBrodyagi;
import ru.ifmo.se.pokemon.*;
import MyAbilki.*;

public class Wigglytuff extends Jigglypuff{
    public Wigglytuff(String name, int level){
        super(name, level);
        setStats(140, 70,45, 85, 50, 45);
        setType(Type.FAIRY, Type.NORMAL);
        setMove(new Rest());
    }
}