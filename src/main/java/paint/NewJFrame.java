/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package paint;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JComponent;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class NewJFrame extends javax.swing.JFrame implements DrawingEngine, Node{

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        canvas1 = new java.awt.Canvas();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Paint");
        setBackground(new java.awt.Color(0, 0, 153));

        canvas1.setBackground(new java.awt.Color(255, 255, 255));
        canvas1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        canvas1.setMinimumSize(new java.awt.Dimension(382, 300));

        jButton1.setBackground(new java.awt.Color(0, 255, 255));
        jButton1.setText("Circle");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 255, 255));
        jButton2.setText("Square");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 255, 255));
        jButton3.setText("Line Segment");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 255, 255));
        jButton4.setText("Rectangle");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jComboBox1.setBackground(new java.awt.Color(0, 255, 255));
        jComboBox1.setToolTipText("Choose figure");

        jButton5.setBackground(new java.awt.Color(0, 255, 255));
        jButton5.setText("Colorize");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(0, 255, 255));
        jButton6.setText("Delete");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(0, 255, 255));
        jButton7.setText("Fill");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(canvas1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton5)
                                .addGap(18, 18, 18)
                                .addComponent(jButton6))
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton7)
                        .addGap(56, 56, 56))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5)
                            .addComponent(jButton6))
                        .addGap(18, 18, 18)
                        .addComponent(jButton7)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try
        {
            String radius = JOptionPane.showInputDialog(null,"Radius");
            String px = JOptionPane.showInputDialog(null,"X");
            String py = JOptionPane.showInputDialog(null,"Y");
            double r = Double.parseDouble(radius);
            int x = Integer.parseInt(px);
            int y = Integer.parseInt(py);
            Circle c = new Circle(++circles);
            properties.put("Radius" + circles, r);
            c.setProperties(properties);
            c.setPosition(new Point(x, y));
            addShape(c);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "No valid entries.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try
        {  
            String length = JOptionPane.showInputDialog(null,"Length");
            String px = JOptionPane.showInputDialog(null,"X");
            String py = JOptionPane.showInputDialog(null,"Y");
            double l = Double.parseDouble(length);
            int x = Integer.parseInt(px);
            int y = Integer.parseInt(py);
            Rectangle s = new Rectangle(++rectangles);
            properties.put("Length" + rectangles, l);
            properties.put("Width" + rectangles, l);
            s.setProperties(properties);
            s.setPosition(new Point(x, y));
            addShape(s);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "No valid entries.");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try
        {  
            String length = JOptionPane.showInputDialog(null,"Length");
            String px = JOptionPane.showInputDialog(null,"X");
            String py = JOptionPane.showInputDialog(null,"Y");
            double l = Double.parseDouble(length);
            int x = Integer.parseInt(px);
            int y = Integer.parseInt(py);
            Rectangle s = new Rectangle(++rectangles);
            properties.put("Length" + rectangles, l);
            properties.put("Width" + rectangles, l);
            s.setProperties(properties);
            s.setPosition(new Point(x, y));
            addShape(s);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "No valid entries.");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        try
        {  
            String length = JOptionPane.showInputDialog(null,"Length");
            String angle = JOptionPane.showInputDialog(null,"Angle");
            String px = JOptionPane.showInputDialog(null,"X");
            String py = JOptionPane.showInputDialog(null,"Y");
            double l = Double.parseDouble(length);
            double a = Double.parseDouble(angle);
            int x = Integer.parseInt(px);
            int y = Integer.parseInt(py);
            LineSegment m = new LineSegment(++lines);
            properties.put("Length" + lines, l);
            properties.put("Angle" + lines, a*22.0/7/180);
            m.setProperties(properties);
            m.setPosition(new Point(x, y));
            addShape(m);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "No valid entries.");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        Colorizing c = new Colorizing(1);
        c.setVisible(true);
        c.setPreviousNode(this);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        String[] id = jComboBox1.getSelectedItem().toString().split("_");
        switch(id[0])
        {
            case "rectangle":
            {
                
                removeShape(rec.get(Integer.parseInt(id[1])-1));
                break;
            }
            case "circle":
            {
                removeShape(cir.get(Integer.parseInt(id[1])-1));
                break;
            }
            case "line":
            {
                removeShape(lin.get(Integer.parseInt(id[1])-1));
                break;
            }
        }
        jComboBox1.removeItem(jComboBox1.getSelectedItem());
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        Colorizing c = new Colorizing(2);
        c.setVisible(true);
        c.setPreviousNode(this);
    }//GEN-LAST:event_jButton7ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }
ArrayList<Rectangle> rec = new ArrayList<Rectangle>();
ArrayList<Circle> cir = new ArrayList<Circle>();
ArrayList<LineSegment> lin = new ArrayList<LineSegment>();
ArrayList<Shape> shapes = new ArrayList<Shape>();
HashMap<String, Double> properties = new HashMap<String, Double>();
public void addShape(Shape shape)
{
    String id;
    if(shape.getClass() == new Rectangle(-1).getClass())
    {
        id = "rectangle_" + rectangles;
        rec.add(rectangles-1, (Rectangle)shape);
    }
    else if(shape.getClass() == new Circle(-1).getClass())
    {
        id = "circle_" + circles;
        cir.add(circles-1, (Circle)shape);
    }
    else
    {
        id = "line_" + lines;
        lin.add(lines-1, (LineSegment)shape);
    }
    shapes.add(shape);
    jComboBox1.addItem(id);
    refresh(canvas1.getGraphics());
}
public void removeShape(Shape shape)
{
    if(shape.getClass() == new Rectangle(-1).getClass())
    {
        rectangles--;
        rec.remove(shape);
    }
    else if(shape.getClass() == new Circle(-1).getClass())
    {
        circles--;
        cir.remove(shape);
    }
    else
    {
        lines--;
        lin.remove(shape);
    }
    shapes.remove(shape);
    refresh(canvas1.getGraphics());
}
public Shape[] getShapes()
{
    return shapes.toArray(new Shape[shapes.size()]);
}
public void refresh(Graphics canvas)
{
    canvas1.getGraphics().clearRect(0, 0, canvas1.getWidth(), canvas1.getHeight());
    for(Shape s : getShapes())
    {
        System.out.println(s);
        s.draw(canvas1.getGraphics());
        this.add((JComponent)s);
    }
}
int circles = 0;
int rectangles = 0;
int lines = 0;
Node prevNode;
public void setPreviousNode(Node node)
{
    this.prevNode = node;
}
public Node getPreviousNode()
{
    return this.prevNode;
}
void setColor(Color x)
{
    //shapes.get(jComboBox1.getSelectedItem()).setColor(x);
    String[] id = jComboBox1.getSelectedItem().toString().split("_");
    System.out.println(id[0]);
    System.out.println(id[1]);
    switch(id[0])
    {
        case "rectangle":
        {
            rec.get(Integer.parseInt(id[1])-1).setColor(x);
            break;
        }
        case "circle":
        {
            cir.get(Integer.parseInt(id[1])-1).setColor(x);
            break;
        }
        case "line":
        {
            lin.get(Integer.parseInt(id[1])-1).setColor(x);
            break;
        }
    }
    this.refresh(canvas1.getGraphics());
}
void setFillColor(Color x)
{
    String[] id = jComboBox1.getSelectedItem().toString().split("_");
    switch(id[0])
    {
        case "rectangle":
        {
            rec.get(Integer.parseInt(id[1])-1).setFillColor(x);
            break;
        }
        case "circle":
        {
            cir.get(Integer.parseInt(id[1])-1).setFillColor(x);
            break;
        }
        case "line":
        {
            lin.get(Integer.parseInt(id[1])-1).setFillColor(x);
            break;
        }
    }
    this.refresh(canvas1.getGraphics());
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Canvas canvas1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox<String> jComboBox1;
    // End of variables declaration//GEN-END:variables
}