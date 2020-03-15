import java.awt.*;
import java.applet.*;

public class House extends Applet
{
	public void paint(Graphics g)
	{
		setBackground(Color.cyan);
		g.setColor(Color.blue);         //roof color
		int x1[] ={400,800,700,300,400}; //roof
		int y1[] ={200,200,360,360,200};
		int n1 = 5;
		g.fillPolygon(x1,y1,n1);       //roof
		g.setColor(Color.red);         //wall color   
		g.fillRect(490,340,400,160);   //wall
		g.setColor(Color.green);       //front wall color
		int x3[] ={410,490,490,330,330,410};  
		int y3[] ={200,340,500,500,340,200};
		int n3 = 5;
		g.fillPolygon(x3,y3,n3);
		g.setColor(Color.blue);
		int x2[] ={400,800,900,500,400};
		int y2[] ={200,200,360,360,200};
		int n2=5;
		g.fillPolygon(x2,y2,n2);  //roof at other sides
		g.setColor(Color.cyan);   //windows color
		g.fillRect(550,380,100,80); //windows1
		g.fillRect(550,380,100,80);
		g.setColor(Color.yellow);
		g.setColor(Color.magenta);
		int x4[] ={370,420,420,370,370};
		int y4[] ={360,390,470,500,360};
		int n4 =5;
		g.fillPolygon(x4,y4,n4);

  
	}
}
/*
<applet code=house width=1366 height=708
*/


