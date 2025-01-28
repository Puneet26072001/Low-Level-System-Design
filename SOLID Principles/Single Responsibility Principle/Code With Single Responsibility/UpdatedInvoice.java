class UpdatedInvoice{
  private Marker marker;
  private int quantity;
  public UpdatedInvoice(Marker marker,int quantity)
  {
    this.marker=  marker;
    this.quantity=quantity;
  }
  public int CalculateTotal()
  {
    return (marker.price * this.quantity);
  }
  public void SaveToDB(){
    // code to save to DB
  }
  public void PrintInvoice(){
    //code to print invoice
  }
}