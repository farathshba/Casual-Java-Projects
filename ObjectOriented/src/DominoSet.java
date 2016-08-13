
class DominoSet 
{
	Tile[] Hold = new Tile[28];
	
	public DominoSet()
	{
		int left;
		int right;
		
		for(int i = 0; i < 28; i++)
		{
			right = (int)Math.round(Math.random()*6);
			left = (int)Math.round(Math.random()*6);
			
			Hold[i] = new Tile(left, right);
			
		}
	}
}
