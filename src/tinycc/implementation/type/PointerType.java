package tinycc.implementation.type;

public class PointerType extends Type {
    private Type pointsTo;

    public PointerType(Type pointsTo) {
        this.pointsTo = pointsTo;
    }

    public Type getPointsTo() {
        return pointsTo;
    }

    @Override
    public String toString() {
        return "Pointer" + "[" +  pointsTo + "]";
    }
}
