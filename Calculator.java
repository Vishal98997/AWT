import java.awt.*;

public class Calculator extends Frame {
    public Calculator() {
        setTitle("Calculator");
        setSize(250, 300);

        
        TextField textField = new TextField();
        textField.setBounds(10, 10, 215, 40);
        add(textField);

      
        String[] buttonLabels = {"%", "7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "0", "=", "+"};
        Button[] buttons = new Button[buttonLabels.length];
        int x = 10;
        int y = 60;
        int width = 50;
        int height = 50;
        for (int i = 0; i < buttonLabels.length; i++) {
            buttons[i] = new Button(buttonLabels[i]);
            buttons[i].setBounds(x, y, width, height);
            add(buttons[i]);
            x += width;
            if ((i + 1) % 4 == 0) {
                x = 10;
                y += height;
            }
        }

       
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
