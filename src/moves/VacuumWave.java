package moves;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public final class VacuumWave extends SpecialMove {

    public VacuumWave() {
        // Constructor signature: super(type, power, accuracy, priority, hits)
        super(Type.FIGHTING, 40, 100, 1, 1);
    }

    @Override
    protected String describe() {
        return "использует Vacuum Wave";
    }
}