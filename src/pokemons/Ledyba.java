package pokemons;

import moves.ViceGrip;
import ru.ifmo.se.pokemon.Type;

public class Ledyba extends Koffing {

    public Ledyba(String name, int level) {
        // 1. Calls Koffing's constructor (which sets DoubleTeam and Flatter)
        super(name, level);

        // 2. Overwrite elemental types for Ledyba (Bug and Flying)
        setType(Type.BUG, Type.FLYING);

        // 3. Overwrite base stats: (HP, Attack, Defense, Sp.Atk, Sp.Def, Speed)
        setStats(55, 20, 30, 40, 80, 55);

        // 4. Add the 3rd move to the inherited moves
        addMove(new ViceGrip());
    }
}