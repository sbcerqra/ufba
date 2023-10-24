class Address {
  private String streetName, additionalInfo, neighborhood;
  private int houseNumber;

  public Address(String streetName, String additionalInfo, String neighborhood, int houseNumber) {
    this.streetName = streetName;
    this.additionalInfo = additionalInfo;
    this.neighborhood = neighborhood;
    this.houseNumber = houseNumber;
  }
  public String getStreetName() {
    return streetName;
  }

  public void setStreetName(String streetName) {
    this.streetName = streetName;
  }

  public String getAdditionalInfo() {
    return additionalInfo;
  }

  public void setAdditionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
  }

  public String getNeighborhood() {
    return neighborhood;
  }

  public void setNeighborhood(String neighborhood) {
    this.neighborhood = neighborhood;
  }

  public int getHouseNumber() {
    return houseNumber;
  }

  public void setHouseNumber(int houseNumber) {
    this.houseNumber = houseNumber;
  }

}