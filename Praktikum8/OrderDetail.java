public class OrderDetail{
	
	private int quantity;
	private String taxStatus;
	
	public double calcSubTotal(){
        return 0.0;
    }

    public double calcWeight(){
        return 0.0;
    }

    public double calcTax(){
        return 0.0;
    }

	public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
	
    public int getQuantity() {
        return quantity;
    }

	public void setTaxStatus(String taxStatus) {
        this.taxStatus = taxStatus;
    }
	
    public String getTaxStatus() {
        return taxStatus;
    }
	
}