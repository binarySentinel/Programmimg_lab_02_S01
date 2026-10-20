package moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public final class Assurance extends PhysicalMove {

    public Assurance() {
        super(Type.DARK, 60, 100);
    }

    @Override
    protected String describe() {
        return "использует Assurance";
    }
}