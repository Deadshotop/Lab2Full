package MyBrodyagi;
import ru.ifmo.se.pokemon.*;
import MyAbilki.*;

public class Igglybuff extends Pokemon{
    public Igglybuff(String name, int level){
        super(name, level);
        setStats(90, 30,15, 40, 20, 15);
        setType(Type.FAIRY, Type.NORMAL);
        setMove(new ThunderWave(), new DoubleTeam());
    }
}