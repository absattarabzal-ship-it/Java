import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LAB10 extends JPanel implements ActionListener {

    // Компоненты
    private JButton clickButton, redButton, greenButton, blueButton, submitButton;
    private JTextField nameField;
    private String message = "";
    private String name = "";
    private int clickCount = 0;
    private Color shapeColor = Color.RED;

    // Анимация
    private int circleX = 50;
    private boolean moveRight = true;
    private Timer timer;

    public LAB10() {
        // Layout
        setLayout(null);

        // Кнопка ClickMe
        clickButton = new JButton("Click Me!");
        clickButton.setBounds(20, 20, 100, 30);
        clickButton.addActionListener(this);
        add(clickButton);

        // Кнопки цвета
        redButton = new JButton("Red");
        greenButton = new JButton("Green");
        blueButton = new JButton("Blue");
        redButton.setBounds(130, 20, 60, 30);
        greenButton.setBounds(200, 20, 70, 30);
        blueButton.setBounds(280, 20, 70, 30);
        redButton.addActionListener(this);
        greenButton.addActionListener(this);
        blueButton.addActionListener(this);
        add(redButton); add(greenButton); add(blueButton);

        // Текстовое поле и кнопка Submit
        nameField = new JTextField(15);
        nameField.setBounds(360, 20, 120, 30);
        submitButton = new JButton("Submit");
        submitButton.setBounds(490, 20, 80, 30);
        submitButton.addActionListener(this);
        add(nameField); add(submitButton);

        // Таймер для анимации
        timer = new Timer(50, e -> {
            if (moveRight) circleX += 5;
            else circleX -= 5;
            if (circleX >= 500) moveRight = false;
            if (circleX <= 0) moveRight = true;
            repaint();
        });
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Задание 1 и 2: фигуры
        g.setColor(shapeColor);
        g.fillRect(50, 70, 150, 100); // прямоугольник
        g.setColor(Color.MAGENTA);
        g.fillOval(250, 70, 100, 100); // круг
        g.setColor(Color.ORANGE);
        g.drawLine(50, 200, 200, 200); // линия

        g.setColor(Color.BLACK);
        g.drawString("Rectangle", 70, 65);
        g.drawString("Circle", 270, 65);
        g.drawString("Line", 90, 195);

        // Задание 3: текст
        g.setColor(Color.BLACK);
        g.drawString("Hello Java Applet", 100, 250);

        // Задание 4,5,6: сообщения
        g.drawString(message, 50, 300);

        // Задание 8: анимация круга
        g.setColor(Color.CYAN);
        g.fillOval(circleX, 350, 50, 50);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == clickButton) {
            clickCount++;
            message = "Button clicked " + clickCount + " times!";
        } else if (e.getSource() == submitButton) {
            name = nameField.getText();
            message = "Привет, " + name + "!";
        } else if (e.getSource() == redButton) shapeColor = Color.RED;
        else if (e.getSource() == greenButton) shapeColor = Color.GREEN;
        else if (e.getSource() == blueButton) shapeColor = Color.BLUE;
        repaint();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("LAB10 Swing Applet");
        LAB10 panel = new LAB10();
        panel.setPreferredSize(new Dimension(600, 450));
        frame.add(panel);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}