package MyAbilki;

import ru.ifmo.se.pokemon.*;

public class Snarl extends SpecialMove {
    public Snarl(){
        super(Type.DARK, 55, 95);
    }
    @Override
    protected void applyOppDamage(Pokemon def, double d){
        Status cond = def.getCondition();
        if (cond.equals(Status.NORMAL)) {
            def.setMod(Stat.HP, (int) Math.round(d));
        }
    }
    @Override
    protected void applyOppEffects(Pokemon def){
        def.setMod(Stat.SPECIAL_ATTACK, -1);
    }
    @Override
    protected java.lang.String describe() {
        return "ROOOARRR";
    }
}
