package bridge;

import java.util.List;

public class RouteMap {
    private final List<String> upSide;
    private final List<String> downSide;
    private final MapFormat mapFormat = MapFormat.FORMAT;

    public RouteMap(List<String> upSide, List<String> downSide) {
        this.upSide = upSide;
        this.downSide = downSide;
    }

    public List<String> format() {
        return mapFormat.convertToFormatStrings(List.of(upSide, downSide));
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof RouteMap) {
            return upSide.equals(((RouteMap) other).upSide)
                    && downSide.equals(((RouteMap) other).downSide);
        }
        return false;
    }

    @Override
    public String toString() {
        return "upSide: " + upSide + ", " + "downSide: " + downSide;
    }

}
