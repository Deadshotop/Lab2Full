package MyAbilki;

import ru.ifmo.se.pokemon.*;

public class Thunderbolt extends SpecialMove {
    public Thunderbolt(){
        super(Type.ELECTRIC, 90,100);
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
        if(Math.random() <= 0.1){
            Effect.paralyze(def);
        }
    }
    @Override
    protected String describe(){
        return "DZZZZZZZZZ THUNDERBOLT";
    }
}
