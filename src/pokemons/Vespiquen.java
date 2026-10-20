package pokemons;

import moves.DoubleTeam;
import moves.MuddyWater;
import moves.Swagger;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Vespiquen extends Pokemon {

    public Vespiquen(String name, int level) {
        super(name, level);

        // 1. Set elemental types (Bug and Flying)
        setType(Type.BUG, Type.FLYING);

        // 2. Set base stats: (HP, Attack, Defense, Sp.Atk, Sp.Def, Speed)
        setStats(70, 80, 102, 80, 102, 40);

        // 3. Assign 3 initial attacks
        setMove(new Swagger(), new DoubleTeam(), new MuddyWater());
    }
}