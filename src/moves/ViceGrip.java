package moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public final class ViceGrip extends PhysicalMove{

    public ViceGrip(){
        super(Type.NORMAL,55,100);
    }

    @Override
    protected String describe() {
        return "использует Vice Grip";
    }
}
