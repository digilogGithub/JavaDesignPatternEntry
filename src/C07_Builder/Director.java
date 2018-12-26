package C07_Builder;

public class Director {

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.makeTitle("Greeting");
        builder.makeString("Day and Night");
        builder.makeItem(new String[] {"좋은 아침 입니다.","안녕하세요."});
        builder.makeString("밤에");
        builder.makeItem(new String[] {
                "안녕히세요.",
                "안녕히 주무세요.",
                "안녕히 계세요"
        });
        builder.close();
    }
}
