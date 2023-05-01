package factoryAbstract.units;

public class BlueFactory extends Factory{
    @Override
    public InfantryUnit createInfantryUnit(UnitType type) {
        switch (type){
            case RIFLEMAN:
                return new Rifleman(20,0,6);
            default:
                throw new UnsupportedOperationException("Unknown type");
        }
    }

    @Override
    public MechanizedUnit createMechanizedUnit(UnitType type) {
        switch (type){
            case TANK:
                return new Tank(75,0,35);
            default:
                throw new UnsupportedOperationException("Unknown type");
        }
    }
    @Override
    public AirUnit createAirUnit(UnitType type) {
        switch (type){
            case HELICOPTER:
                return new Helicopter(20,0,40);
            default:
                throw new UnsupportedOperationException("Unknown type");
        }
    }



}
