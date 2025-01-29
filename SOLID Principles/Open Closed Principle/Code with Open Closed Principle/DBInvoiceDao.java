class DBInvoiceDao implements InvoiceDao{
  Invoice invoice;
  public InvoiceDao(Invoice UpdatedInvoice)
  {
    this.invoice=  UpdatedInvoice;
  }
  public void Save(Invoice invoice){
    // code to save to DB
  }
  
}
