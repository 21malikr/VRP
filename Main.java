/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicle.routing.problem;

import java.util.*;
import java.io.*;

class main
{
    public static void main(String[] args) throws FileNotFoundException
    {
        //  Scanner s = new Scanner(System.in);
        File file = new File("file.txt");
        System.out.println(file.getAbsolutePath());
        Scanner sc = new Scanner(file);
        int x = 0;
        int y = 0;
		int day = Integer.parseInt(sc.nextLine().trim());
        int nos = Integer.parseInt(sc.nextLine().trim()); //amount of what is in the file which is line 2
        int [] xpoints = new int [nos];
        int [] ypoints = new int [nos];
        int i = 0;
        while(sc.hasNext())
        {
            Location L = new Location(sc.nextLine());
            x = L.getX();
            y = L.getY();
            xpoints[i] = x;
            ypoints[i] = y;
            System.out.println("x is " + x + " and y is " + y);
            i++;
            
        }
        for (int j = 0; j<nos-2; j++)
        {
            double distanced = Math.abs(xpoints[j]-xpoints[j+1])+Math.abs(ypoints[j]-ypoints[j+1]);
            double distanceds =  Math.abs(xpoints[j]-xpoints[j+2])+Math.abs(ypoints[j]-ypoints[j+2]);
            if(distanced<distanceds)
            {
                    System.out.println(xpoints[j+1] - xpoints[j]);
                    System.out.println(ypoints[j+1] - ypoints[j]);
                    System.out.println("the first one was closer");
            }
            else if(distanceds<distanced)
            {
                    System.out.println(xpoints[j+2] - xpoints[j]);
                    System.out.println(ypoints[j+2] - ypoints[j]);
                    System.out.println("the second one was closer");
            }
            else if (distanced == distanceds)
            {
                    System.out.println("they are equal");
            }
       }
    }
}

bool hasRemaining(){
	for(bool point: visited)
	if(point) return true;
}

int totaldistance;
int cpoint = 0;
visited[0] = true;
while(hasRemaining){
	int closest;
	for(int from 0 to points.length){
		if(visited[i]) continue;

		p1 = xpoints[i] ypoints[i]
		p2 = xpoints[cpoint] ypoints[cpoint]

		if(p1.distance(p2) < closest)
			closest = i;
	}
	visited[closest] = true;

	totaldistance += distance(xpoints[cpoint] ypoints[cpoint], xpoints[closest] ypoints[closest])
	cpoint = closest;
	
}
for(int k = 0; k<nos; k++)
{
	if(visited[k] = true)
	{
		continue; 
	}
	p1 = (xpoints[k] , ypoints[k]); 
	p2 = (xpoints[cpoint], ypoints[cpoint]);

	if (p1.distance(p2) < closest)

}
