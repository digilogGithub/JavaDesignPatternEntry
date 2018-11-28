package C16_Mediator;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ColleagueCheckBox extends Checkbox implements Colleague, ItemListener {
    private Mediator mediator;

    public ColleagueCheckBox(String label, CheckboxGroup group, boolean state) throws HeadlessException {
        super(label, group, state);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setColleagueEnabled(boolean enabled) {
        setEnabled(enabled);
    }

    public void itemStateChanged(ItemEvent event) {
        mediator.colleagueChanged();
    }
}
