package moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Effect;


public final class Supersonic extends StatusMove {
    public Supersonic() {

    super(Type.NORMAL,0,55);
}
    @Override
    protected void applyOppEffects(Pokemon p) {
        // Confuse the opponent
        Effect.confuse(p);
    }

    @Override
    protected String describe() {
        return "использует Supersonic";
    }
}
