package C19_State;

public interface Context {

    void setClock(int hour);

    void changeState(State instance);

    void recordLog(String s);

    void callSecurityCenter(String s);
}
