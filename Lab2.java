import MyBrodyagi.*;
import ru.ifmo.se.pokemon.*;

public class Lab2 {
    public static void main(String [] args){
        Battle b = new Battle();
        Victini p1 = new Victini("CHELZAHUNDRED", 3);
        Rockruff p2 = new Rockruff("SHAKAL", 2);
        Lycanroc p3 = new Lycanroc("VOLCHARA", 4);
        Igglybuff p4 = new Igglybuff("LILCHEL", 3);
        Jigglypuff p5 = new Jigglypuff("MIDLCHEL", 3);
        Wigglytuff p6 = new Wigglytuff("BIGGIECHEL", 3);

        b.addAlly(p2);
        b.addFoe(p1);
        b.addAlly(p4);
        b.addFoe(p3);
        b.addAlly(p6);
        b.addFoe(p5);
        b.go();
    }
}
