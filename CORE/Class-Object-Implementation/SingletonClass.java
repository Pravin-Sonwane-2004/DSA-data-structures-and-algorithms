public class SingletonClass {
    void main() throws Exception {
      Singletone s = Singletone.retInstance();
      IO.print(s.hashCode());
      IO.println();
      Singletone s1 = Singletone.retInstance();
      IO.print(s1.hashCode());

    }
}

class Singletone {
  private static Singletone instance;

  public static Singletone retInstance() throws Exception {
    if(instance == null) {
    try {
    return instance = new Singletone();
  }
    catch(Exception e) {
      e.printStackTrace();
    }
  }
  return instance;
  }
}