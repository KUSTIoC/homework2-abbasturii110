public class InvoiceTest {

	public static void main(String[] args) {

		
		
		Invoice invoice1 = new Invoice("P000001", "Part Number 1", 5, 4.99);
		System.out.println("Standard Functionality Test.");
		printInvoiceMessage(invoice1);
		
		
		Invoice invoice2 = new Invoice("P000002", "Part Number 2", 0, 4.99);
		System.out.println("Testing 0 Quantity.");
		printInvoiceMessage(invoice2);
		
		
		Invoice invoice3 = new Invoice("P000003", "Part Number 3", -2, 4.99);
		System.out.println("Testing negative Quanity.");
		printInvoiceMessage(invoice3);
		
		
		Invoice invoice4 = new Invoice("P000004", "Part Number 4", 5, -4.99);
		System.out.println("Testing Negative Price.");
		printInvoiceMessage(invoice4);
		
		
		Invoice invoice5 = new Invoice("P000005", "Part Number 5", 72, 187.65);
		System.out.println("Standard Functionality Test with some larger numbers.");
		printInvoiceMessage(invoice5);
		
		
		Invoice invoice6 = new Invoice();
		invoice6.setPN("P00006");
		invoice6.setPD("Part Number 6");
		invoice6.setQuantity(20);
		invoice6.setPPI(22.99);
		System.out.println("Testing Bean setters.");
		printInvoiceMessage(invoice6);
		
		invoice6.setQuantity(-33);
		System.out.println("Testing Bean setters with negative Quantity.");
		printInvoiceMessage(invoice6);
		
		
		invoice6.setQuantity(20); 
		invoice6.setPPI(-33.98);
		System.out.println("Testing Bean setters with negative Price Per Item.");
		printInvoiceMessage(invoice6);
	}
	
	public static void printInvoiceMessage(Invoice invoice){

		System.out.printf("Invoice for Part: %s \t", invoice.getPN() );
		System.out.printf("Part Description: %s \t", invoice.getPD() );
		System.out.printf("Quantity: %s \t", invoice.getQuantity() );
		System.out.printf("Price Per Item: %.2f \n", invoice.getPPI());
		System.out.printf("Total Invoice Amount: %.2f \n", invoice.getInvoiceAmount() );
		System.out.println("***************************************************");
		System.out.println();
	}

}