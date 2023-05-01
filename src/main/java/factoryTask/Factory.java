package factoryTask;

import factoryTask.cars.BMWModel;
import factoryTask.cars.Car;
import factoryTask.cars.FordModel;

public interface Factory {

    Car buildFord(FordModel model);
    Car buildBMW(BMWModel model);

}
