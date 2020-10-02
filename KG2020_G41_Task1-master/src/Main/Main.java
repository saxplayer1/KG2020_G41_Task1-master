package Main;

import javax.swing.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        MainWindow mWindow = new MainWindow();
        mWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mWindow.setSize(1000, 1000);
        mWindow.setVisible(true);
    }
}
