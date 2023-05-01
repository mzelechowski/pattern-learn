package factoryAbstract.units;

public class RedFactory extends Factory{
    @Override
    public InfantryUnit createInfantryUnit(UnitType type) {
        switch (type){
            case RIFLEMAN:
                return new Rifleman(25,0,5);
            default:
                throw new UnsupportedOperationException("Unknown type");
        }
    }

    @Override
    public MechanizedUnit createMechanizedUnit(UnitType type) {
        switch (type){
            case TANK:
                return new Tank(100,0,25);
            default:
                throw new UnsupportedOperationException("Unknown type");
        }
    }

    @Override
    public AirUnit createAirUnit(UnitType type) {
        switch (type) {
            case HELICOPTER:
                return new Helicopter(15, 0, 45);
            default:
                throw new UnsupportedOperationException("Unknown type");
        }
    }
}
