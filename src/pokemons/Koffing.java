package pokemons;

import moves.DoubleTeam;
import moves.Flatter;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;


public class Koffing extends Pokemon{

    public Koffing(String name, int level) {
        super(name, level);

        // 1. Set Elemental Type
        setType(Type.POISON);

        // 2. Set Base Stats: (HP, Attack, Defense, Special Attack, Special Defense, Speed)
        setStats(40, 65, 95, 60, 45, 35);

        // 3. Assign Attacks
        setMove(new DoubleTeam(), new Flatter());
    }

}
