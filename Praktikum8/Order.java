import java.util.Date;

public class Order{
	
	private Date date;
	private String status;
	
	public double calcSubTotal(){
        return 0.0;
    }

    public double calcTax(){
        return 0.0;
    }

    public double calcTotal(){
        return 0.0;
    }

    public double calcTotalWeight(){
        return 0.0;
    }
	
	public void setDate(Date date) {
        this.date = date;
    }
	
    public Date getDate() {
        return date;
    }

	public void setStatus(String status) {
        this.status = status;
    }
	
    public String getStatus() {
        return status;
    }

    
}
	
	