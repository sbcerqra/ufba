import java.util.ArrayList;
import java.util.Date;

class Driver {
  private String name, socialName, nationalRegister, mothersName, fathersName, street, phoneNumber, birthCountry,
      licenseType, licenseNumber, neighborhood;
  private int houseNumber, addressAddOn, outsourced;
  private Date birthdayDate;
  private ArrayList<Contract> contracts;

  public Driver(String name, String licenseType, String licenseNumber) {
    this.outsourced = 0;
    this.name = name;
    this.licenseType = licenseType;
    this.licenseNumber = licenseNumber;
  }

  public Driver(String name, String licenseType, String licenseNumber, ArrayList<Contract> contracts) {
    this.outsourced = 1;
    this.name = name;
    this.licenseType = licenseType;
    this.licenseNumber = licenseNumber;
    this.contracts = new ArrayList<Contract>();
  }

  public void isOutsourced() {
    if (this.getOutsourced() == 1) {
      System.out.println("This driver is outsourced");
    } else {
      System.out.println("This driver is from the company");
    }
  }

  public ArrayList<Contract> getContracts() {
    return contracts;
  }

  public void setContracts(ArrayList<Contract> contracts) {
    if (this.getOutsourced() == 0) {
      System.out.println("Invalid method");
    } else {
      this.contracts = contracts;
    }
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSocialName() {
    return socialName;
  }

  public void setSocialName(String socialName) {
    this.socialName = socialName;
  }

  public String getNationalRegister() {
    return nationalRegister;
  }

  public void setNationalRegister(String nationalRegister) {
    this.nationalRegister = nationalRegister;
  }

  public String getMothersName() {
    return mothersName;
  }

  public void setMothersName(String mothersName) {
    this.mothersName = mothersName;
  }

  public String getFathersName() {
    return fathersName;
  }

  public void setFathersName(String fathersName) {
    this.fathersName = fathersName;
  }

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getBirthCountry() {
    return birthCountry;
  }

  public void setBirthCountry(String birthCountry) {
    this.birthCountry = birthCountry;
  }

  public String getLicenseType() {
    return licenseType;
  }

  public void setLicenseType(String licenseType) {
    this.licenseType = licenseType;
  }

  public String getLicenseNumber() {
    return licenseNumber;
  }

  public void setLicenseNumber(String licenseNumber) {
    this.licenseNumber = licenseNumber;
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

  public int getAddressAddOn() {
    return addressAddOn;
  }

  public void setAddressAddOn(int addressAddOn) {
    this.addressAddOn = addressAddOn;
  }

  public int getOutsourced() {
    return outsourced;
  }

  public void setOutsourced(int outsourced) {
    this.outsourced = outsourced;
  }

  public Date getBirthdayDate() {
    return birthdayDate;
  }

  public void setBirthdayDate(Date birthdayDate) {
    this.birthdayDate = birthdayDate;
  }
}
