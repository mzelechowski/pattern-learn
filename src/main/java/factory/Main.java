package factory;

import factory.units.Factory;
import factory.units.Unit;
import factory.units.UnitFactory;
import factory.units.UnitType;

public class Main {

    public static void main(String[] args) {
        Factory factory = new UnitFactory();
        Unit tank = factory.createUnit(UnitType.TANK);
        Unit rifleman=factory.createUnit(UnitType.RIFLEMAN);
    }

}
