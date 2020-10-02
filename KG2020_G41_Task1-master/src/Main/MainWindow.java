package Main;

import javax.swing.*;

public class MainWindow extends JFrame {
    public MainWindow() {
        DrawPanel drawPanel = new DrawPanel();
        setContentPane(drawPanel);
    }
}
