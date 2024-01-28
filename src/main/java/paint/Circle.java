/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paint;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JComponent;

/**
 *
 * @author HP
 */
public class Circle extends JComponent/*Canvas*/ implements Shape
{
    private int id;
    private double radius;
    private Point position = new Point();
    private HashMap<String, Double> properties = new HashMap<>();
    private Color color = Color.BLACK;
    private Color fillColor = null;
    public Circle(int id)
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
        this.properties.put("Radius" + id, properties.get("Radius" + id));
        this.radius = this.properties.get("Radius" + id);
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
        if(this.getFillColor() == null)
        {
            canvas.drawOval(this.position.x - (int)(this.radius), this.position.y - (int)(this.radius), (int)(2*this.radius), (int)(2*this.radius));
        }
        else
        {
            canvas.setColor(this.getFillColor());
            canvas.fillOval(this.position.x - (int)(this.radius), this.position.y - (int)(this.radius), (int)(2*this.radius), (int)(2*this.radius));
        }
    }
}
