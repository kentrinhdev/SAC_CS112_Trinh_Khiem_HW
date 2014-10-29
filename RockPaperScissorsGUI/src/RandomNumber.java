public class RandomNumber
{
    private int computerGesture;

    public void setANumber()
    {
    	computerGesture=(int)(Math.random() * 3 + 1);
    } // end void setANumber
 
    public int getANumber()
    {
        return computerGesture;
    } // end int getANumber

} // end class RandomNumber
