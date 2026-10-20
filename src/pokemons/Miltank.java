package pokemons;

import moves.Assurance;
import ru.ifmo.se.pokemon.Type;

public final class Miltank extends Ledyba {

    public Miltank(String name, int level) {
        // 1. Calls Ledyba constructor (inherits DoubleTeam, Flatter, ViceGrip)
        super(name, level);

        // 2. Overwrite elemental type for Miltank (Normal)
        setType(Type.NORMAL);

        // 3. Overwrite base stats: (HP, Attack, Defense, Sp.Atk, Sp.Def, Speed)
        setStats(95, 80, 105, 40, 70, 100);

        // 4. Add the 4th move
        addMove(new Assurance());
    }
}
