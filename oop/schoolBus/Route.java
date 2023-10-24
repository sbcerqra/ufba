import java.util.ArrayList;

public class Route {
  private ArrayList<StoppingPoint> stoppingPoints;
  private int id;
  private int numberOfRoutes = 0;

  public Route(int id) {
    this.stoppingPoints = new ArrayList<StoppingPoint>();
    this.id = id;
    numberOfRoutes++;
  }

  public ArrayList<StoppingPoint> getStoppingPoints() {
    return stoppingPoints;
  }

  public void setStoppingPoints(ArrayList<StoppingPoint> stoppingPoints) {
    this.stoppingPoints = stoppingPoints;
  }

  public void addStoppingPoint(StoppingPoint stoppingPoint) {
    stoppingPoints.add(stoppingPoint);
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getNumberOfRoutes() {
    return numberOfRoutes;
  }
}