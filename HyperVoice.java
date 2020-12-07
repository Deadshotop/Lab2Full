package MyAbilki;

import ru.ifmo.se.pokemon.*;

public class HyperVoice extends SpecialMove {
    public HyperVoice(){
        super(Type.NORMAL, 90,100);
    }
    @Override
    protected void applyOppDamage(Pokemon p, double damage){
        Status cond = p.getCondition();
        if (cond.equals(Status.NORMAL)) {
            p.setMod(Stat.HP, (int) Math.round(damage));
        }
    }
    @Override
    protected String describe() {
        return "LYUTI ORRR";
    }
}
