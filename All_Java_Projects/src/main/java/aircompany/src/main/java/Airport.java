package aircompany.src.main.java;

import aircompany.src.main.java.Planes.MilitaryPlane;
import aircompany.src.main.java.Planes.PassengerPlane;
import aircompany.src.main.java.Planes.Plane;
import aircompany.src.main.java.Planes.experimentalPlane;
import aircompany.src.main.java.models.MilitaryType;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * version: 1.1
 * made by Vitali Shulha
 * 4-Jan-2019
 */


public class Airport {
    private List<? extends Plane> planes;

    List<PassengerPlane> getPassengerPlanes() {
//     List<? extends Plane> list = this.planes;
        List<PassengerPlane> passengerPlanes = new ArrayList<>();
        for (Plane plane : planes) {if (plane instanceof PassengerPlane){
            passengerPlanes.add((PassengerPlane) plane);}
        }
        return passengerPlanes;
    }
    List<MilitaryPlane> getMilitaryPlanes() {
        List<MilitaryPlane> militaryPlanes = new ArrayList<>();
        for (Plane plane : planes) {
            if (plane instanceof MilitaryPlane) {
                militaryPlanes.add((MilitaryPlane) plane);
            }
        }
        return militaryPlanes;
    }
    public PassengerPlane getPassengerPlaneWithMaxCapacity() {
        List<PassengerPlane> passengerPlanes = getPassengerPlanes();
        PassengerPlane planeWithMaxCapacity = passengerPlanes.get(0);
        for (PassengerPlane passengerPlane : passengerPlanes) {
            if (passengerPlane.getPassengersCapacity() >
                    planeWithMaxCapacity.getPassengersCapacity()) {
                planeWithMaxCapacity = passengerPlane;
            }
        }
        return planeWithMaxCapacity;
    }
    public List<MilitaryPlane> getTransportMilitaryPlanes() {
    List<MilitaryPlane> transportMilitaryPlanes = new ArrayList<>();
    List<MilitaryPlane> militaryPlanes = getMilitaryPlanes();
        for (MilitaryPlane plane : militaryPlanes) {
            if (plane.getType() == MilitaryType.TRANSPORT) {
                transportMilitaryPlanes.add(plane);
            }
        }
    return transportMilitaryPlanes;
    }
    public List<MilitaryPlane> getBomberMilitaryPlanes() {
        List<MilitaryPlane> bomberMilitaryPlanes = new ArrayList<>();
        List<MilitaryPlane> militaryPlanes = getMilitaryPlanes();
        for (MilitaryPlane plane : militaryPlanes) {
            if (plane.getType() == MilitaryType.BOMBER) {
                bomberMilitaryPlanes.add(plane);
            }
        }
        return bomberMilitaryPlanes;
    }
    public List<experimentalPlane> getExperimentalPlanes() {
        List<experimentalPlane> experimentalPlanes = new ArrayList<>();
        for (Plane plane : planes) {
            if (plane instanceof experimentalPlane) {
                experimentalPlanes.add((experimentalPlane) plane);
            }
        }
        return experimentalPlanes;
    }
    Airport sortByMaxDistance() {
        planes.sort(new Comparator<Plane>() {
            public int compare(Plane plane1, Plane plane2) {
                return plane1.getMaxFlightDistance()- plane2.getMaxFlightDistance();
            }
        });
        return this;
    }
    Airport sortByMaxSpeed() {
        planes.sort(new Comparator<Plane>() {
            public int compare(Plane plane1, Plane plane2) {
                return plane1.getMaxSpeed() - plane2.getMaxSpeed();
            }
        });
        return this;
    }
    public void sortByMaxLoadCapacity() {
        planes.sort(new Comparator<Plane>() {
            public int compare(Plane plane1, Plane plane2) {
                return plane1.getMaxLoadCapacity() - plane2.getMaxLoadCapacity();
            }
        });
    }
    public List<? extends Plane> getPlanes() {
        return planes;
    }
    @Override
    public String toString() {
        return "Airport{" +
                "Planes=" + planes.toString() +
                '}';
    }
    public Airport(List<? extends Plane> planes) {
        this.planes = planes;
    }
}
