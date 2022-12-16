public class Check extends Payment{
	
	private String name;
	private String bankID;
	
	public boolean authorized(){
        return true;
    }

	public void setName(String name) {
        this.name = name;
    }
	
    public String getName() {
        return name;
    }

	public void setBankID(String bankID) {
        this.bankID = bankID;
    }
	
    public String getBankID() {
        return bankID;
    }

}