import java.util.*;

public class Main {
    public static void main(String[] args) {
      Marker marker=new Marker("Apsara","Red",200,2000);
      Invoice invoice=new Invoice(marker,10);
      int total=invoice.CalculateTotal();
      System.out.println(total);
  }
}