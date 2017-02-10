import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;

import javax.swing.JPanel;

public class MyPanelClass extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7057541440811488699L;

	public void paintComponent(Graphics g) {
        super.paintComponent(g);

        //Compute interior coordinates
        Insets myInsets = this.getInsets();
        int x1 = myInsets.left;
        int y1 = myInsets.top;
        int x2 = getWidth() - myInsets.right - 1;
        int y2 = getHeight() - myInsets.bottom - 1;
        int width = x2 - x1;
        int height = y2 - y1;

        //Paint the background
        g.setColor(Color.WHITE);
        g.fillRect(x1, y1, width + 1, height + 1);
        g.setColor(Color.RED);
        g.fillRect(x1, y1, width , height/5 );
        g.fillRect(x1, y1 +2*height/5 , width, height/5);
        g.fillRect(x1, y1 +4*height/5 , width, height/5);
        /*  g.setColor(Color.WHITE);
        g.drawLine(x1, y1, x2, y2);
        g.setColor(Color.BLUE);
        g.drawLine(x1, y2, x2, y1);
        
        //
        //g.setColor(Color.LIGHT_GRAY);
        //g.fillOval(width/2-22 , height/2-22, 55, 55);
*/
        Polygon p = new Polygon();
        p.addPoint(x1, y1 );
        p.addPoint(width/2, height/2);
        p.addPoint(x1, height);

        g.setColor(Color.BLUE);
        g.fillPolygon(p);
        //125*height/200
        Polygon p2 = new Polygon();
        p2.addPoint(27*width/250, 92*height/200);
        p2.addPoint(42*width/250, 92*height/200);
        p2.addPoint(47*width/250, 75*height/200);
        p2.addPoint(53*width/250, 92*height/200);
        p2.addPoint(67*width/250, 92*height/200);
        p2.addPoint(56*width/250, 102*height/200);
        p2.addPoint(61*width/250, 119*height/200);
        p2.addPoint(47*width/250, 108*height/200);
        p2.addPoint(34*width/250, 119*height/200);
        p2.addPoint(38*width/250, 102*height/200);
        g.setColor(Color.WHITE);
        g.fillPolygon(p2);
}

}

 
