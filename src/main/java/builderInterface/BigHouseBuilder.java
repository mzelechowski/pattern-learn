package builderInterface;

public class BigHouseBuilder implements HouseBuilder {

    private House house;

    public BigHouseBuilder(){
        this.house= new House();
    }

    @Override
    public void buildWalls() {
        this.house.setWalls("big Walls");
    }

    @Override
    public void buildFloors() {
        this.house.setFloors("big Floors");
    }

    @Override
    public void buildRooms() {
        this.house.setRooms("big rooms");
    }

    @Override
    public void roof() {
        this.house.setRoof("big roof");
    }

    @Override
    public void windows() {
        this.house.setWindows("big windows");
    }

    @Override
    public void doors() {
        this.house.setDoors("big doors");
    }

    @Override
    public void garage() {
        this.house.setGarage("big garage");
    }

    public House getHouse() {
        return house;
    }
}
