package C21_Proxy;

public class Printer implements Printable {
    private String name;

    public Printer() {
        heavyJob("Print의 인스턴스를 생성 중");
    }

    public Printer(String name) {
        this.name = name;
        heavyJob("Print의 인스턴스(" + name + ")를 생성 중");
    }

    @Override
    public void setPrinterName(String name) {
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        return name;
    }

    @Override
    public void print(String string) {
        System.out.println("=== "+name+" ===");
        System.out.println(string);
    }

    private void heavyJob(String string) {
        System.out.println(string);
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(".");
        }
        System.out.println("완료.");
    }
}
