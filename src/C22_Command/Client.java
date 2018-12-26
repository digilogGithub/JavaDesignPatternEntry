package C22_Command;

import javax.swing.*;
import java.awt.event.*;

public class Client extends JFrame implements ActionListener, MouseMotionListener, WindowListener {
    private DrawCommand command;
    private MacroCommand macroCommand = new MacroCommand();
    private DrawCanvas drawCanvas = new DrawCanvas(400, 400, macroCommand);
    private JButton clearButton = new JButton("clear");

    public Client(String title) {
        super(title);

        this.addWindowListener(this);
        drawCanvas.addMouseMotionListener(this);
        clearButton.addActionListener(this);

        Box buttonBox = new Box(BoxLayout.X_AXIS);
        buttonBox.add(clearButton);
        Box mainBox = new Box(BoxLayout.Y_AXIS);
        mainBox.add(buttonBox);
        mainBox.add(drawCanvas);
        getContentPane().add(mainBox);

        pack();
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == clearButton) {
            macroCommand.clear();
            drawCanvas.repaint();
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        command = new DrawCommand(drawCanvas, e.getPoint());
        macroCommand.append(command);
        command.execute();
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }

    public static void main(String[] args) {
        new Client("CommandNode Pattern Sample");
    }
}
