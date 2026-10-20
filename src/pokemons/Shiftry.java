package pokemons;

import moves.Supersonic;
import ru.ifmo.se.pokemon.Type;

public final class Shiftry extends Vespiquen {

    public Shiftry(String name, int level) {
        // 1. Calls Vespiquen constructor (inherits Swagger, DoubleTeam, MuddyWater)
        super(name, level);

        // 2. Overwrite elemental types for Shiftry (Grass and Dark)
        setType(Type.GRASS, Type.DARK);

        // 3. Overwrite base stats: (HP, Attack, Defense, Sp.Atk, Sp.Def, Speed)
        setStats(90, 100, 60, 90, 60, 80);

        // 4. Add the 4th move
        addMove(new Supersonic());
    }
}