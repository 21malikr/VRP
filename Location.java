/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicle.routing.problem;

/**
 * @author Kyle_2
 */
class Location{
    String s = "";
    String a = "";
    String h = "";
    int convertedS = 0;
    int convertedA = 0;

    public Location(String pos)
    {
        pos = pos.trim();
        String[] vals = pos.split(",");

        s = vals[0].substring(0, vals[0].length()-1);
        a = vals[1].substring(0, vals[1].length()-1);
        h = vals[2];

        ConvertAvenue();
        ConvertStreet();
    }

    private void ConvertStreet()
    {
        convertedS = Integer.parseInt(s);
        convertedS = convertedS * 2;
        if(h.length() == 1)
        {
            convertedS = convertedS - 1;
        }
    }

    private void ConvertAvenue()
    {
        convertedA = Integer.parseInt(a);

        char ch = h.charAt(0);

        int add = ch - 65;
        System.out.println(ch + "   " + add);
        convertedA = (convertedA - 1) * 10 + add + 1;
    }
    public int getX()
    {
        return convertedS;
    }
    public int getY()
    {
        return convertedA;
    }
   public int Distance (int nos)
   {   //basically what will happen here is that make new arrays and compare the points in their arrays. 
   boolean hasvisited = true;
   int [] xpoints = new int [nos];
   int [] ypoints = new int [nos];
   int locationy = 225;
   int counter = 0;
   List <int> pointsx = new ArrayList<>();
   List <int> pointsy = new ArrayList<>();

   int locationx =251;	
   boolean after = true;
	   while(hasvisited= true)
	   {
		   for{int i = 0; int i< nos-2; i ++}
		   {
			double comparedOrigin1 = Math.abs(xpoints[i]-locationx)+Math.abs(ypoints[i]-locationy;
			double comparedOrigin2 = Math.abs(xpoints[i+1]-locationx)+Math.abs(ypoints[i+1]-locationy);

			if(comparedOrigin1>comparedOrigin2)
			{
				locationy = ypoints[i];
				locationx = xpoints[i];
				after = false;
			}
			if (comparedOrigin1<comparedOrigin2)
			{
				locationx = xpoints[i+1];
				locationy = ypoints[i+1];	
			}
			if (after = false)
			{
				counter++;
				pointsx.add(xpoints[i]/*the point that is missed so this works and then what you do after is continue and make sure that the loop continues to run and also works fine as well as comparing it better so you create new thing of has visited points or just do the psedo code*/ );
				pointsy.add(ypoints[i]);
			}
		   }

	   }
	    while(pointsx.get()!= 0)
		{
			for(int i = 0; i<pointsx.get(); i--)
			{
				pointsx.remove()
			}
		}
   }
}
