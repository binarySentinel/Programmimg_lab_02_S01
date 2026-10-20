package moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public final class MuddyWater extends SpecialMove {

    public MuddyWater() {
        super(Type.WATER, 90, 85);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        // 30% chance to lower target's accuracy by 1 stage
        if (Math.random() <= 0.30) {
            p.setMod(Stat.ACCURACY, -1);
        }
    }

    @Override
    protected String describe() {
        return "использует Muddy Water";
    }
}
