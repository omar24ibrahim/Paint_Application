/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paint;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import static java.lang.Math.cos;
import static java.lang.Math.sin;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JComponent;

/**
 *
 * @author HP
 */
public class LineSegment extends JComponent/*Canvas*/ implements Shape
{
    private int id;
    private double length;
    private double angle;
    private Point position = new Point();
    private HashMap<String, Double> properties = new HashMap<>();
    private Color color = Color.BLACK;
    private Color fillColor = null;
    public LineSegment(int id)
    {
        this.id = id;
    }
    /*public int getId()
    {
        return this.id;
    }*/
    public void setPosition(Point position)
    {
        this.position = position;
    }
    public Point getPosition()
    {
        return this.position;
    }
    public void setProperties(Map<String, Double> properties)
    {
        this.properties.put("Length" + id, properties.get("Length" + id));
        this.length = properties.get("Length" + id);
        this.properties.put("Angle" + id, properties.get("Angle" + id));
        this.angle = properties.get("Angle" + id);
    }
    public Map<String, Double> getProperties()
    {
        return this.properties;
    }
    public void setColor(Color color)
    {
        this.color = color;
    }
    public Color getColor()
    {
        return this.color;
    }
    public void setFillColor(Color color)
    {
        this.fillColor = color;
    }
    public Color getFillColor()
    {
        return this.fillColor;
    }
    public void draw(Graphics canvas)
    {
        canvas.setColor(this.getColor());
        canvas.drawLine(this.position.x, this.position.y, (int)(this.position.x + (this.length * cos(this.angle))), (int)(this.position.y + (this.length * sin(this.angle))));
    }
}
