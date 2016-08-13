
public class Database 
{
	private String _productName;
	private String _category;
	private int _barcode;
	private double _price;
	private String _manu;
	private int _stocklist;
	private int _numberSold;
	
	public Database(String text)
	{
		String[] tempArray;
		tempArray = text.split(", ");
		
		_productName = tempArray[0].replace("," , "");
		_category = tempArray[1].replace("," , "");
		_barcode = Integer.parseInt(tempArray[1].replace("," , ""));
		_price = Double.parseDouble(tempArray[1].replace("," , ""));
		_manu = tempArray[1].replace("," , "");
		_stocklist = Integer.parseInt(tempArray[1].replace("," , ""));
		_numberSold = Integer.parseInt(tempArray[1].replace("," , ""));
	}
	
	//	Accessor Methods
	
}
