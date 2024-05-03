import java.awt.*;
public class calc extends Frame
{
calc()
{
setTitle("Calculator");
setSize(200,250);
TextField t=new TextField("0");
t.setBounds(10,10,200,90);
add(t);
Button b1=new Button("%");
b1.setBounds(50,10,100,100);
add(b1);
setLayout(null);
setVisible(true);
}
public static void main(String args[])
{
calc c=new calc();
}
}