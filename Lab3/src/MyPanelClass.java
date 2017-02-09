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
        p2.addPoint(width/10, 92*height/200);
        p2.addPoint(x1 + 41, y1 + 73);
        p2.addPoint(x1 + 47, y1 + 58);
        p2.addPoint(x1 + 53, y1 + 73);
        p2.addPoint(x1 + 69, y1 + 73);
        p2.addPoint(x1 + 56, y1 + 83);
        p2.addPoint(x1 + 61, y1 + 98);
        p2.addPoint(x1 + 47, y1 + 88);
        p2.addPoint(x1 + 34, y1 + 98);
        p2.addPoint(x1 + 38, y1 + 83);
        g.setColor(Color.WHITE);
        g.fillPolygon(p2);
}

}

 
