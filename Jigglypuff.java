package MyBrodyagi;
import ru.ifmo.se.pokemon.*;
import MyAbilki.*;

public class Jigglypuff extends Igglybuff{
    public Jigglypuff(String name, int level){
        super(name, level);
        setStats(115, 45,20, 45, 25, 20);
        setType(Type.FAIRY, Type.NORMAL);
        setMove(new HyperVoice());
    }
}