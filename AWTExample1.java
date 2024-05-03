//AWT EXAMPLE BY INHERITANCE
import java.awt.*;
public class AWTExample1 extends Frame
{
//initialization using constructor
AWTExample1()
{
//creating a button 
Button b=new Button("Click me");
b.setBounds(30,100,80,30);
//add button to the frame
add(b);
//frame Size 300 width and 300 height
setSize(300,300);
//setting the title of frame
setTitle("This is our basic AWT Example");
//No Layout Manager
setLayout(null);
//new frame will be visible by 
setVisible(true);
}
public static void main(String args[])
{

AWTExample1 f=new AWTExample1();
}
}
