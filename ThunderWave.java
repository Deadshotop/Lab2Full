package MyAbilki;

import ru.ifmo.se.pokemon.*;

public class ThunderWave extends SpecialMove {
    public ThunderWave(){
        super(Type.ELECTRIC, 90,20);
    }
    @Override
    protected void applyOppEffects(Pokemon def){
        Effect.paralyze(def);
        int DisableToAttack = (int) (def.getStat(Stat.ATTACK) - def.getStat(Stat.ATTACK));
        int HalfSpeed = (int) (def.getStat(Stat.SPEED)/2);
        if(Math.random() <= 0.25){
            def.setMod(Stat.ATTACK, DisableToAttack);
            def.setMod(Stat.SPEED, HalfSpeed);
        }
    }

    @Override
    protected String describe(){
        return "OHH U PARALYZED";
    }
}
