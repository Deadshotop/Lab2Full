package MyAbilki;
import ru.ifmo.se.pokemon.*;
public class Confide extends StatusMove {
    public Confide() {
        super(Type.NORMAL, 0, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon def){
        def.setMod(Stat.SPECIAL_ATTACK, -1);
    }
    protected java.lang.String describe() {
        return "TSIGANSKIE FOCUSI";
    }
}
