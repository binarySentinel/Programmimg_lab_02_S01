import pokemons.*;
import ru.ifmo.se.pokemon.Battle;

public class Main {
    public static void main(String[] args) {
        // 1. Create battle simulation instance
        Battle b = new Battle();

        // 2. Team Ally (Команда союзников)
        b.addAlly(new Blaziken("AP1", 36));
        b.addAlly(new Vespiquen("AP2", 21));
        b.addAlly(new Shiftry("AP3", 30));

        // 3. Team Foe (Команда соперников)
        b.addFoe(new Koffing("OP1", 15));
        b.addFoe(new Ledyba("OP2", 18));
        b.addFoe(new Miltank("OP3", 25));

        // 4. Start the battle loop
        b.go();
    }
}