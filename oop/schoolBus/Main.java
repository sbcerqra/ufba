import java.util.Scanner;
import java.util.ArrayList;

class Main {
  public static void ShowMenu() {
  System.out.println("=============================");
  System.out.println("            Menu ");
  System.out.println("\n1. Add Student");
  System.out.println("2. Add Driver");
  System.out.println("3. Add School");
  System.out.println("4. Add Car");
  System.out.println("5. Create Contract");
  System.out.println("6. Create Stopping point");
  System.out.println("7. Create Route");
  System.out.println("8. Calculate thingy");
  System.out.println("9. Total routes created");
  System.out.println("10. Stopping points created");
  System.out.println("11. Exit");
  System.out.println("=============================");
  }
  
  public static Student createStudent() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter student's name:");
    String nameStudent = sc.nextLine(); 
    System.out.println("Enter student's cpf:");
    String studentsCPF = sc.nextLine(); 
    System.out.println("Enter student's registration:");
    int registration = sc.nextInt(); 
    System.out.println("Enter student's School Year:");
    int schoolYear = sc.nextInt(); 
    Student student = new Student(nameStudent, studentsCPF, registration, schoolYear);
    return student;
  }

  public static Driver createPrivateDriver() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter driver name:");
    String driverName = sc.next(); 
    System.out.println("Enter driver license type:");
    String licenseType = sc.nextLine(); 
    System.out.println("Enter driver license number:");
    String licenseNumber = sc.nextLine(); 
    Driver driver = new Driver(driverName, licenseType, licenseNumber);
    return driver;
  }
  
  public static Driver createOutsourcedDriver() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter driver name:");
    String driverName = sc.next(); 
    System.out.println("Enter driver license type:");
    String licenseType = sc.nextLine(); 
    System.out.println("Enter driver license number:");
    String licenseNumber = sc.nextLine();
    System.out.println("Creating driver's contracts... ");
    Driver driver = new Driver(driverName, licenseType, licenseNumber);
    return driver;
  }

  public static School createSchool() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter school name:");
    String schoolName = sc.nextLine(); 
    System.out.println("Enter school cnpj:");
    String schoolCNPJ = sc.nextLine(); 
    System.out.println("Enter school phone number:");
    String schoolNumber = sc.nextLine(); 
    School school = new School(schoolName, schoolCNPJ, schoolNumber);
    return school;
  }

  public static Contract createContract() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter contract number: ");
    int contractNumber = sc.nextInt();
    System.out.println("Enter contract value: ");
    double contractValue = sc.nextDouble();
    Contract contract = new Contract(contractNumber, contractValue);
    return contract;    
  }
  
  public static Car createPrivateCar() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter car license plate:");
    String carLPlate = sc.nextLine();
    System.out.println("Enter car model:");
    String carModel = sc.nextLine();
    System.out.println("Enter car year:");
    int carYear = sc.nextInt();
    Car car = new Car(carLPlate, carYear, carModel);
    return car;
  }
  public static Car createOutsourcedCar() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter car license plate:");
    String carLPlate = sc.nextLine();
    System.out.println("Enter car year:");
    int carYear = sc.nextInt();
    System.out.println("Enter car model:");
    String carModel = sc.nextLine();
    System.out.println("Enter car contract info... \n");
    Contract contract = createContract();
    Car car = new Car(carLPlate, carYear, carModel, contract);
    return car;
  }

  public static StoppingPoint createStoppingPoint() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter stopping point name:");
    String sPtName = sc.nextLine();
    System.out.println("Enter stopping point id:");
    int sPtId = sc.nextInt();
    System.out.println("Enter stopping point latitude:");
    double sPtLatitude = sc.nextDouble();
    System.out.println("Enter stopping point longitude:");
    double sPtLongitude = sc.nextDouble();
    StoppingPoint sPt = new StoppingPoint(sPtName, sPtId, sPtLatitude, sPtLongitude);
    return sPt;
  }

  public static Route createRoute( ArrayList<StoppingPoint> stoppingPoints) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter route id:");
    int routeId = sc.nextInt();
    Route route = new Route(routeId);
    System.out.println("Enter how many stopping points you want to add:");
    int numberOfStops = sc.nextInt();
    System.out.println("Getting the available Stopping points...\n");
    for (StoppingPoint stop : stoppingPoints) {
        System.out.println("Place:" + stop.getName());
        System.out.println("Id: " + stop.getId() + "\n");
    }
    for (int i = 0; i < numberOfStops; i++) { 
      System.out.println("Enter the id of the stopping point you want to add:");
      int sPtId = sc.nextInt();
      for (StoppingPoint stop : stoppingPoints) {
          if (stop.getId() == sPtId) {
            route.addStoppingPoint(stop);
            break;
        }
      }
    }
    return route;
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Student> students = new ArrayList<>();
    ArrayList<Driver> drivers = new ArrayList<>();
    ArrayList<Car> cars = new ArrayList<>();
    ArrayList<StoppingPoint> stoppingPoints = new ArrayList<>();
    ArrayList<Route> routes = new ArrayList<>();

    while (true) {
      ShowMenu();
      int choice = sc.nextInt();
      
      switch (choice) {
        case 1:
          Student student = createStudent();
          students.add(student);
          System.out.println("Your student was succesfully created");

        case 2:
          System.out.println("Enter 1 for outsorced and 0 for private:");
          int outsorced = sc.nextInt();
          if (outsorced == 0) {
            Driver driver = createPrivateDriver();
            drivers.add(driver);
            System.out.println("Your private driver was succesfully created");
          } else { 
            Driver driver = createOutsourcedDriver();
            drivers.add(driver);
            System.out.println("Your outsourced driver was succesfully created");
          }
          break;
     
        case 3:
          School school = createSchool();
          System.out.println("Your school was succesfully created");
          break;   
          
        case 4:
          System.out.println("Enter 1 for rented and 0 for private");
          int carRented = sc.nextInt();
          if (carRented == 0) {
            Car car = createPrivateCar();
            cars.add(car);
            System.out.println("Your private car was succesfully created");
          } else {
            Car car = createOutsourcedCar();
            cars.add(car);
            System.out.println("Your outsourced car was succesfully created");
          }
          break;
          
        case 5:
          Contract contract = createContract();
          System.out.println("Your contract was succesfully created \n");
          break;
          
        case 6:
          StoppingPoint sPt = createStoppingPoint();
          stoppingPoints.add(sPt);
          System.out.println("Your stopping point was succesfully created");
          break;
         
        case 7:
          Route route = createRoute(stoppingPoints);
          routes.add(route);
          System.out.println("Your route was succesfully created");
          break;
          
        case 8:
          // calculate demand
          break;
          
        case 9:
          int numberOfRoutes = routes.size();
          System.out.println("Total routes created: " + numberOfRoutes);
          break;
          
        case 10:
          int numberOfStops = stoppingPoints.size();
          System.out.println("Total stopping points created: " + numberOfStops);
          break;
          
        case 11:
          sc.close();
          System.exit(0);
        }
      }
    }
}
