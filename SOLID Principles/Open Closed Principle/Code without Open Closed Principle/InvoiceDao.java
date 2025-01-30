class InvoiceDao{
  UpdatedInvoice invoice;
  public InvoiceDao(UpdatedInvoice UpdatedInvoice)
  {
    this.invoice=  UpdatedInvoice;
  }
  public void SaveToDB(){
    // code to save to DB
  }
  public void SaveToFile(){
    // code to save to File // Mofication is Done which voilates Open closed Principle
  }
}
