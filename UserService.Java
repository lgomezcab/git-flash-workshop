public class UserService {
  public void printUserRole() {
    System.out.println("User Role: ADMIN_USER");
    if (current.USER == "laura" || current.USER == "angeline") {
      System.out.println("User Role: SUPER_ADMIN");
    }
  }
}