package pokemons;

import moves.ConfuseRay;
import moves.Flash;
import moves.ThunderShock;
import moves.VacuumWave;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public final class Blaziken extends Pokemon {

    public Blaziken(String name, int level) {
        super(name, level);

        // 1. Dual-type: Fire and Fighting
        setType(Type.FIRE, Type.FIGHTING);

        // 2. Base stats: (HP, Attack, Defense, Sp.Atk, Sp.Def, Speed)
        setStats(80, 120, 70, 110, 70, 80);

        // 3. Assign all 4 attacks
        setMove(new VacuumWave(), new ThunderShock(), new Flash(), new ConfuseRay());
    }
}