package MyAbilki;
import ru.ifmo.se.pokemon.*;

public class DoubleTeam extends StatusMove {
    public DoubleTeam() {
        type = Type.NORMAL;
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        p.setMod(Stat.EVASION, 1);
    }
    protected java.lang.String describe() {
        return "Double Team";
    }
}
