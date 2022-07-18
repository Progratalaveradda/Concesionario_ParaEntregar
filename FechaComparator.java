
import java.util.Comparator;

public class FechaComparator implements Comparator<Reparacion> {
    @Override
    public int compare(Reparacion r1, Reparacion r2) {
        if( r1.getFechaDeCreacion() > r2.getFechaDeCreacion()) return 1;
        return -1;
    }
}