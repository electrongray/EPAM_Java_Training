package Planes;

import models.ClassificationLevel;
import models.ExperimentalTypes;

public class experimentalPlane extends Plane{

    private ExperimentalTypes type;
    private ClassificationLevel classificationLevel;

    public experimentalPlane(String model, int maxSpeed,
                             int maxFlightDistance,
                             int maxLoadCapacity,
                             ExperimentalTypes type,
                             ClassificationLevel classificationLevel) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.type = type;
        this.classificationLevel = classificationLevel;
    }

    public ClassificationLevel getClassificationLevel(){
        return classificationLevel;
    }
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof ExperimentalTypes)) return false;
        if (!super.equals(object)) return false;
        return type == ExperimentalTypes.type;
    }
    @Override
    public int hashCode() {
        return super.hashCode();
    }
    @Override
    public String toString() {
        return "experimentalPlane{" +
                "model='" + model + '\'' +
                '}';
    }
}
