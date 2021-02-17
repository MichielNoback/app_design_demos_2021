package nl.bioinf.oop.game;

public class Location {
    private final double x;
    private final double y;
    private final double z;

    public Location(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public Location moveBy(double deltaX, double deltaY, double deltaZ) {
        return new Location(this.x + deltaX, this.y + deltaY, this.z + deltaZ);
    }

    /**
     * Determines whether this Location is located within a certain 3D space.
     * Assumed is that space is defined from (0, 0, 0) as minimum.
     * @param x
     * @param y
     * @param z
     * @return withiSpace
     */
    public boolean isWithinSpace(double x, double y, double z) {
        return (this.x >=0 && this.y >= 0 && this.z >= 0 &&
                this.x <= x && this.y <= y && this.z <= z);
    }
}