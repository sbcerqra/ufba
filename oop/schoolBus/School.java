import java.util.ArrayList;

class School {
  private String name, cnpj, phoneNumber;
  private Address address;
  private ArrayList<Student> students;

  public School(String name, String cnpj, String phoneNumber) {
    this.name = name;
    this.cnpj = cnpj;
    this.phoneNumber = phoneNumber;
    this.students = new ArrayList<Student>();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCnpj() {
    return cnpj;
  }

  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public ArrayList<Student> getStudents() { 
    return students;
  }

  public void setStudents(ArrayList<Student> students) { 
    this.students = students;
  }

  public void addStudent(Student newStudent) {
    students.add(newStudent);
  }

  public void showStudents() {
    for (Student student : students) {
      System.out.println("Registration: " + student.getRegistration());
      System.out.println("CPF: " + student.getCpf());
      System.out.println("Social Name: " + student.getSocialName());
      System.out.println("School Year: " + student.getSchoolYear());
    }
  }
}
