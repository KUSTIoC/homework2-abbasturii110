public class Invoice {

	private String PN;
	private String PD;
	private int quantity;
	private double PPI;
	

	public Invoice() {
		PN = "";
		PD ="";
		quantity = 0;
		PPI = 0.0;
	}
	
	
	public Invoice(String PN, String PD, int quantity, double PPI) {
		
		setPN(PN);
		setPD(PD);
		setQuantity(quantity);
		setPPI(PPI);
	}
	
	
	public double getInvoiceAmount(){
		return quantity * PPI;
	}

	
	public String getPN() {
		return PN;
	}
	
	public void setPN(String PN) {
		this.PN = PN;
	}
	
	public String getPD() {
		return PD;
	}

	
	public void setPD(String PD) {
		this.PD = PD;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	
	public void setQuantity(int quantity) {
		
		if (quantity > 0) {
			this.quantity = quantity;
		} else {
			this.quantity = 0;
		}
	}
	
	public double getPPI() {
		return PPI;
	}
	
	
	public void setPPI(double PPI) {
		if (PPI > 0) {
			this.PPI = PPI;
		} else {
			this.PPI = 0.0;
		}
	}

	
	@Override
	public String toString() {
		return "Invoice [PN=" + PN + ", PD="
				+ PD + ", quantity=" + quantity
				+ ", PPI=" + PPI + "]";
	}
	
	
}