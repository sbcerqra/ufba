import java.util.ArrayList;
import java.util.Iterator;
import java.util.Date; 

class Contract {
  private int contractNumber;
  private Date startDate, endDate;
  private double value;
  private ArrayList<Driver> drivers;
  private ArrayList<Car> cars;

  public Contract(int contractNumber, double value) {
    this.contractNumber = contractNumber;
    this.value = value;
    this.drivers = new ArrayList<Driver>();
    this.cars = new ArrayList<Car>();
  }

  public int getContractNumber() {
    return contractNumber;
  }

  public void setContractNumber(int contractNumber) {
    this.contractNumber = contractNumber;
  }

  public Date getStartDate() {
    return startDate;
  }

  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  public Date getEndDate() {
    return endDate;
  }

  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }

  public double getValue() {
    return value;
  }

  public void setValue(double value) {
    this.value = value;
  }

  public ArrayList<Driver> getDrivers() {
    return drivers;
  }

  public void setDrivers(ArrayList<Driver> drivers) {
    this.drivers = drivers;
  }

  public ArrayList<Car> getCars() {
    return cars;
  }

  public void setCars(ArrayList<Car> cars) {
    this.cars = cars;
  }

  public void addCars(Car newCar) {
    if (newCar.getRented() == 1) {
      cars.add(newCar);
    } else {
      System.out.println("Invalid Method");
    }
  }

  public void removeCar(Car car) {
    Iterator<Car> it = cars.iterator();
    while (it.hasNext()) {
      Car rentedCar = it.next();
      if (rentedCar.equals(car)) {
        it.remove();
        return;
      }
    }
    System.out.println("This car doesn't exist");
  }

  public void addDriver(Driver newDriver) {
    if (newDriver.getOutsourced() == 1) {
      drivers.add(newDriver);
    } else {
      System.out.println("Invalid Method");
    }
  }

  public void removeDriver(Driver driver) {
    Iterator<Driver> it = drivers.iterator();
    while (it.hasNext()) {
      Driver outsourcedDriver = it.next();
      if (outsourcedDriver.equals(driver)) {
        it.remove();
        return;
      }
    }
    System.out.println("This driver doesn't exist");
  }    
  
}