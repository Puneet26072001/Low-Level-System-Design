class FileInvoiceDao implements InvoiceDao{
  Invoice invoice;
  public FileInvoiceDao(Invoice UpdatedInvoice)
  {
    this.invoice=  UpdatedInvoice;
  }
  public void Save(Invoice invoice){
    // code to save to File
  }
  
}
