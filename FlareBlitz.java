package MyAbilki;

import ru.ifmo.se.pokemon.*;

public class FlareBlitz extends PhysicalMove {
    public FlareBlitz(){
        super(Type.FIRE, 120,100);
    }
    @Override
    protected void applyOppDamage(Pokemon def, double d){
        Status defCon = def.getCondition();
        if (defCon.equals(Status.FREEZE)){ def.setCondition(new Effect().condition(Status.NORMAL).turns(0)); }
        if (Math.random() <= 0.1){
            def.setCondition(new Effect().condition(Status.BURN).turns(3));
            def.setMod(Stat.HP, (int) Math.round(d));
        }
        else {
            def.setMod(Stat.HP, (int) Math.round(d));
        }
    }
    @Override
    protected String describe() {
        return "physical attack: произошла атака огненный блитцкрЫг";
    }
}
