package C16_Mediator;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends Frame implements ActionListener, Mediator {
    private ColleagueCheckBox checkBoxGeust;
    private ColleagueCheckBox checkBoxLogin;
    private ColleagueTextField textFieldUser;
    private ColleagueTextField textFieldPass;
    private ColleagueButton buttonOK;
    private ColleagueButton buttonCancel;

    public LoginFrame(String title) throws HeadlessException {
        super(title);
        setBackground(Color.lightGray);
        setLayout(new GridLayout(4,2));

        createColleageues();

        add(checkBoxGeust);
        add(checkBoxLogin);
        add(new Label("User Name"));
        add(textFieldUser);
        add(new Label("Password"));
        add(textFieldPass);
        add(buttonOK);
        add(buttonCancel);

        colleagueChanged();

        pack();
        setVisible(true);
    }

    @Override
    public void createColleageues() {
        CheckboxGroup checkboxGroup = new CheckboxGroup();
        checkBoxGeust = new ColleagueCheckBox("Guest", checkboxGroup, true);
        checkBoxLogin = new ColleagueCheckBox("Login", checkboxGroup, false);
        textFieldUser = new ColleagueTextField("",10);
        textFieldPass = new ColleagueTextField("", 10);
        textFieldPass.setEchoChar('*');
        buttonOK = new ColleagueButton("OK");
        buttonCancel = new ColleagueButton("Cancel");

        checkBoxGeust.setMediator(this);
        checkBoxLogin.setMediator(this);
        textFieldUser.setMediator(this);
        textFieldPass.setMediator(this);
        buttonOK.setMediator(this);
        buttonCancel.setMediator(this);

        checkBoxGeust.addItemListener(checkBoxGeust);
        checkBoxLogin.addItemListener(checkBoxLogin);
        textFieldUser.addTextListener(textFieldUser);
        textFieldPass.addTextListener(textFieldPass);
        buttonOK.addActionListener(this);
        buttonCancel.addActionListener(this);

    }

    @Override
    public void colleagueChanged() {
        if (checkBoxGeust.getState()) {
            textFieldUser.setColleagueEnabled(false);
            textFieldPass.setColleagueEnabled(false);
            buttonOK.setColleagueEnabled(true);
        } else {
            textFieldUser.setColleagueEnabled(true);
            userPassChanged();
        }
    }

    private void userPassChanged() {
        if (textFieldUser.getText().length() > 0) {
            textFieldPass.setColleagueEnabled(true);
            if (textFieldPass.getText().length() > 0)
                buttonOK.setColleagueEnabled(true);
            else
                buttonOK.setColleagueEnabled(false);
        } else {
            textFieldPass.setColleagueEnabled(false);
            buttonOK.setColleagueEnabled(false);
        }
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.toString());
        System.exit(0);
    }
}
