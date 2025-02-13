import java.util.*;

public class Main {
    public static void main(String[] args) {
    Waiter waiter=new Waiter();
    waiter.takeOrder();
    Cook cook=new Cook();
    cook.decideMenu();
  }
}