import java.util.*;

public class Credit extends Payment{
	
	private String number;
	private String type;
	private Date expDate;
	
	public boolean authorized(){
        return true;
    }

	public void setNumber(String number) {
        this.number = number;
    }
	
    public String getNumber() {
        return number;
    }

	public void setType(String type) {
        this.type = type;
    }
	
    public String getType() {
        return type;
    }

	public void setExpDate(Date expDate) {
        this.expDate = expDate;
    }
	
    public Date getExpDate() {
		return expDate;
	}
}