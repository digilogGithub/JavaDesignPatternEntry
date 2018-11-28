package C22_Command;

import java.util.Iterator;
import java.util.Stack;

public class MacroCommand implements Command {
    private Stack commands = new Stack();

    @Override
    public void execute() {
        Iterator<Stack> itr = commands.iterator();
        while (itr.hasNext()) {
            ((Command) itr.next()).execute();
        }
    }

    public void append(Command command) {
        if(command != this)
            commands.push(command);
    }

    public void undo() {
        if(!commands.empty())
            commands.pop();
    }

    public void clear() {
        commands.clear();
    }
}
