import java.util.Date;
import java.util.List;

class Student {
  private String name, socialName, cpf, mothersName, fathersName, phoneNumber, birthCity, streetName, additionalInfo,
      neighborhood;
  private int registration, schoolYear, houseNumber;
  private Date birthday;
  private School school;
  private StoppingPoint stoppingPoint;

  public Student(String name, String cpf, int registration, int schoolYear) {
    this.name = name;
    this.cpf = cpf;
    this.registration = registration;
    this.schoolYear = schoolYear;
    this.school = school;
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

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
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

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getBirthCity() {
    return birthCity;
  }

  public void setBirthCity(String birthCity) {
    this.birthCity = birthCity;
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

  public int getRegistration() {
    return registration;
  }

  public void setRegistration(int registration) {
    this.registration = registration;
  }

  public int getSchoolYear() {
    return schoolYear;
  }

  public void setSchoolYear(int schoolYear) {
    this.schoolYear = schoolYear;
  }

  public int getHouseNumber() {
    return houseNumber;
  }

  public void setHouseNumber(int houseNumber) {
    this.houseNumber = houseNumber;
  }

  public Date getBirthday() {
    return birthday;
  }

  public void setBirthday(Date birthday) {
    this.birthday = birthday;
  }

  public School getSchool() {
    return school;
  }

  public void setSchool(School school) {
    this.school = school;
  }

}