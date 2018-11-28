package C11_Composite;

public class Client {
    public static void main(String[] args) {
        try {

            System.out.println("Making root entries...");
            Directory rootDir = new Directory("Root");
            Directory binDir = new Directory("bin");
            Directory tmpDir = new Directory("tmp");
            Directory usrDir = new Directory("usr");
            rootDir.add(binDir);
            rootDir.add(tmpDir);
            rootDir.add(usrDir);
            binDir.add(new File("vi", 10000));
            binDir.add(new File("index", 20000));
            rootDir.printList();

            System.out.println();
            System.out.println("Making user entries...");
            Directory kim = new Directory("Kim");
            Directory lee = new Directory("Lee");
            Directory park = new Directory("Park");
            rootDir.add(kim);
            rootDir.add(lee);
            rootDir.add(park);
            kim.add(new File("diary.html", 100));
            kim.add(new File("Composite.java", 200));
            lee.add(new File("memo.txt", 300));
            park.add(new File("index", 400));
            park.add(new File("index", 500));
            rootDir.printList();
        } catch (FileTreatmentException e) {
            e.printStackTrace();
        }
    }
}
