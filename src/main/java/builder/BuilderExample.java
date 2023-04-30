package builder;

public class BuilderExample {
    public static void main(String[] args) {
       // House house = new House("walls", "floors", "roof", "window"," doors", "doors", "garage");
        House house = new House.HouseBuilder()
                .buildWalls("murowane")
                .buildFloors("wooden")
                .buildRoof("pV roof")
                .buildDoors("secure")
                .buildGarage("for two cars")
                .build();
        System.out.println(house);
    }
}
