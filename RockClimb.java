package MyAbilki;

import ru.ifmo.se.pokemon.*;

public class RockClimb extends PhysicalMove {
    public RockClimb(){
        super(Type.NORMAL,90,85);
    }
    @Override
    protected void applyOppDamage(Pokemon def, double d){
        Status cond = def.getCondition();
        if (cond.equals(Status.NORMAL)) {
            def.setMod(Stat.HP, (int) Math.round(d));
        }
    }
    @Override
    protected void applyOppEffects(Pokemon def) {
        if (Math.random() <= 0.1){
            Effect.confuse(def);
        }
    }
    @Override
    protected String describe(){
        return "PARKUR PATSANSKI DVIJ";
    }
}
