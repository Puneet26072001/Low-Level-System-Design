class DBInvoiceDao implements InvoiceDao{
  Invoice invoice;
  public DBInvoiceDao(Invoice UpdatedInvoice)
  {
    this.invoice=  UpdatedInvoice;
  }
  public void Save(Invoice invoice){
    // code to save to DB
  }
  
}
