
class Car {
  private String licensePlate, model;
  private int year, capacity, rented;
  public Contract contract;

  public Car(String licensePlate, int year, String model) {
    this.rented = 0;
    this.licensePlate = licensePlate;
    this.year = year;
    this.model = model;
  }

  public Car(String licensePlate, int year, String model, Contract contract) {
    this.rented = 1;
    this.contract = contract;
    this.licensePlate = licensePlate;
    this.model = model;
    this.year = year;
  }

  public void isRented() {

    if (this.getRented() == 1) {
      System.out.println("This car is rented");
    } else {
      System.out.println("This car is private");
    }
  }

  public String getLicensePlate() {
    return licensePlate;
  }

  public void setLicensePlate(String licensePlate) {
    this.licensePlate = licensePlate;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public int getCapacity() {
    return capacity;
  }

  public void setCapacity(int capacity) {
    this.capacity = capacity;
  }

  public Contract getContract() {
    return contract;
  }

  public void setRContract(Contract contract) {
    this.contract = contract;
  }

  public int getRented() {
    return rented;
  }

  public void setRented(int rented) {
    this.rented = rented;
  }
}