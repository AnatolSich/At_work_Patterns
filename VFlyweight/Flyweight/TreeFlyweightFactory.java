package VFlyweight.Flyweight;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class TreeFlyweightFactory {
    static Map<String, TreeFlyweight> treeFlyweightsCache = new HashMap<>();

    public static TreeFlyweight getTreeFlyweight(String name, Color color, String otherTreeData) {
        TreeFlyweight result = treeFlyweightsCache.get(name);
        if (result == null) {
            result = new TreeFlyweight(name, color, otherTreeData);
            treeFlyweightsCache.put(name, result);
        }
        return result;
    }
}
