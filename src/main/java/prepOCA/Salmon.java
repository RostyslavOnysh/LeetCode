package prepOCA;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Salmon {
    int num_players;
    String name, ground_condition;

    Salmon(int np, String sname, String sground) {
        num_players = np;
        name = sname;
        ground_condition = sground;
    }
}