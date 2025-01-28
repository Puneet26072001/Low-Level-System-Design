import java.util.*;

public class Main {
    public static void main(String[] args) {
      Marker marker=new Marker("Apsara","Red",20000,2000);
      UpdatedInvoice invoice=new UpdatedInvoice(marker,10);
      int total=invoice.CalculateTotal();
      System.out.println("The total calculated cost is: "+total);
  }
}