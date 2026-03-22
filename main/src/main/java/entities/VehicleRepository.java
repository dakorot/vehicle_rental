package entities;

import java.util.List;

public interface VehicleRepository {
    public void rentVehicle(Vehicle vehicle);
    public Vehicle returnVehicle(int id);
    public List<Vehicle> getVehicles();
    public void save();
    public void load();
}
