package moves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public final class ThunderShock extends SpecialMove {

    public ThunderShock() {
        super(Type.ELECTRIC, 40, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        // 10% chance of paralysis
        if (Math.random() <= 0.10) {
            Effect.paralyze(p);
        }
    }

    @Override
    protected String describe() {
        return "использует Thunder Shock";
    }
}