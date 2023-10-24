import java.util.ArrayList;

public class StoppingPoint {
  private String name;
  private double latitude, longitude;
  private int id;
  private ArrayList<Student> students;
  private int numberOfStops = 0;

  public StoppingPoint(String name, int id, double latitude, double longitude) {
    this.name = name;
    this.id = id;
    this.latitude = latitude;
    this.longitude = longitude;
    this.students = new ArrayList<Student>();
    numberOfStops++;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getLatitude() {
    return latitude;
  }

  public void setLatitude(double latitude) {
    this.latitude = latitude;
  }

  public double getLongitude() {
    return longitude;
  }

  public void setLongitude(double longitude) {
    this.longitude = longitude;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public ArrayList<Student> getStudents() {
    return students;
  }

  public void setStudents(ArrayList<Student> students) {
    this.students = students;
  }

  public int getNumberOfStops() {
    return numberOfStops;
  }

  public void setNumberOfStops(int numberOfStops) {
    this.numberOfStops = numberOfStops;
  }

}