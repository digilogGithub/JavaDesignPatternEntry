package C19_State;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SafeFrame extends Frame implements ActionListener, Context {
    private String hour;
    private TextField textClock = new TextField(60);
    private TextArea textScreen = new TextArea(10, 60);
    private Button buttonUse = new Button("금고사용");
    private Button buttonAlarm = new Button("비상벨");
    private Button buttonPhone = new Button("읿반통화");
    private Button buttonExit = new Button("종료");
    private State state = DayState.getInstance();


    public SafeFrame(String title) throws HeadlessException {
        super(title);
        setBackground(Color.lightGray);
        setLayout(new BorderLayout());
        add(textClock, BorderLayout.NORTH);
        textClock.setEditable(false);
        add(textScreen, BorderLayout.CENTER);
        textScreen.setEditable(false);

        Panel panel = new Panel();
        panel.add(buttonUse);
        panel.add(buttonAlarm);
        panel.add(buttonPhone);
        panel.add(buttonExit);
        add(panel, BorderLayout.SOUTH);
        pack();
        setVisible(true);

        buttonUse.addActionListener(this);
        buttonAlarm.addActionListener(this);
        buttonPhone.addActionListener(this);
        buttonExit.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.toString());
        if(e.getSource()==buttonUse)
            state.doUse(this);
        else if (e.getSource() == buttonAlarm)
            state.doAlarm(this);
        else if (e.getSource() == buttonPhone)
            state.doPhone(this);
        else if (e.getSource() == buttonExit)
            System.exit(0);
        else
            System.out.println("?");
    }

    @Override
    public void setClock(int hour) {
        String clockString = "현재 시간은";
        if(hour<10)
            this.hour = "0" + hour + ":00";
        else
            this.hour = hour + ":00";
        System.out.println(clockString+this.hour);
        textClock.setText(clockString+" "+this.hour);
        state.doClock(this, hour);
    }

    @Override
    public void changeState(State instance) {
        System.out.println(state+"에서 "+instance+"로 상태가 변하였습니다");
        state = instance;
    }

    @Override
    public void recordLog(String s) {
        textScreen.append(hour+": Call!"+s+"\n");

    }

    @Override
    public void callSecurityCenter(String s) {
        textScreen.append(hour+"Record..."+s+"\n");
    }
}
