import java.awt.*;
import java.awt.event.*;

public class form extends Frame {
    Label userLabel, passLabel, messageLabel;
    TextField userText, passText;
    Button submitButton;

    public form() {
        // Create components
        userLabel = new Label("Username:");
        passLabel = new Label("Password:");
        messageLabel = new Label();
        userText = new TextField();
        passText = new TextField();
        passText.setEchoChar('*');
        submitButton = new Button("Submit");

        // Set layout manager to null for absolute positioning
        setLayout(null);
        // Set bounds for components
        userLabel.setBounds(50, 50, 80, 30);
        userText.setBounds(150, 50, 150, 30);
        passLabel.setBounds(50, 100, 80, 30);
        passText.setBounds(150, 100, 150, 30);
        submitButton.setBounds(150, 150, 80, 30);
        messageLabel.setBounds(50, 200, 250, 30);

        // Add components to frame
        add(userLabel);
        add(userText);
        add(passLabel);
        add(passText);
        add(submitButton);
        add(messageLabel);


        // Set frame properties
        setTitle("Login Form");
        setSize(300, 150);
        setVisible(true);

        // Add window listener to close the window
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent ae) {
        String username = userText.getText();
        String password = passText.getText();
        if (username.equals("admin") && password.equals("admin")) {
            messageLabel.setText("Login successful!");
        } else {
            messageLabel.setText("Invalid credentials.");
        }
    }

    public static void main(String[] args) {
        new form();
    }
}
