package Lab3;
import java.util.HashMap;

/**
 * This class stores the basic state necessary for the A* algorithm to compute a
 * path across a map. This state includes a collection of "open waypoints" and
 * another collection of "closed waypoints." In addition, this class provides
 * the basic operations that the A* pathfinding algorithm needs to perform its
 * processing.
 **/

public class AStarState {
    /** This is a reference to the map that the A* algorithm is navigating. **/
    private final Map2D map;
    private final HashMap<Location, Waypoint> openWaypoints = new HashMap<>();
    private final HashMap<Location, Waypoint> closeWaypoints = new HashMap<>();

    /** Initialize a new state object for the A* pathfinding algorithm to use. **/
    public AStarState(Map2D map) {
        if (map == null)
            throw new NullPointerException("map cannot be null");
        this.map = map;
    }

    /** Returns the map that the A* pathfinder is navigating. **/
    public Map2D getMap() {
        return map;
    }

    /**
     * Этот метод сканирует все открытые путевые точки и возвращает путевую точку с
     * минимальной общей стоимостью. Если открытых путевых точек нет, этот метод
     * возвращает null.
     **/
    public Waypoint getMinOpenWaypoint() {

        final Waypoint[] MinOpenWaypoint = new Waypoint[1];
        final float[] j = new float[1];
        j[0] = Float.MAX_VALUE;
        openWaypoints.forEach((k, v) -> {
            if (v.getTotalCost() < j[0]) {
                MinOpenWaypoint[0] = v;
                j[0] = v.getTotalCost();
            }
        });
        return MinOpenWaypoint[0];
    }

    /**
     * Этот метод добавляет путевую точку в коллекцию "открытые путевые точки" (или
     * потенциально обновляет уже имеющуюся путевую точку). Если в новом
     * местоположении путевых точек еще нет открытой путевой точки, то новая путевая
     * точка просто добавляется в коллекцию. Однако если в местоположении новой
     * путевой точки уже есть путевая точка, то новая путевая точка заменяет старую
     * только в том случае, если значение "предыдущей стоимости" новой путевой точки
     * меньше значения "предыдущей стоимости" текущей путевой точки.
     **/
    public boolean addOpenWaypoint(Waypoint newWP) {
        if (openWaypoints.get(newWP.getLocation()) == null)
            openWaypoints.put(newWP.getLocation(), newWP);
        else if (newWP.getPreviousCost() < openWaypoints.get(newWP.getLocation()).getPreviousCost())
            openWaypoints.replace(newWP.getLocation(), newWP);
        return false;
    }

    /** Возвращает текущее количество открытых путевых точек. **/
    public int numOpenWaypoints() {
        return openWaypoints.values().size();
    }

    /**
     * Этот метод перемещает путевую точку в указанном месте из открытого списка в
     * закрытый.
     **/
    public void closeWaypoint(Location loc) {
        closeWaypoints.put(loc, openWaypoints.get(loc));
        openWaypoints.remove(loc);
    }

    /**
     * Возвращает true, если коллекция закрытых путевых точек содержит путевую точку
     * для указанного местоположения.
     **/
    public boolean isLocationClosed(Location loc) {
        return closeWaypoints.containsKey(loc);
    }
}
