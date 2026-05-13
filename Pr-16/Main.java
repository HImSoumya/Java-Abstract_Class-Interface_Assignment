// Create an interface `FileOperation` with methods `read()` and `write()`. Implement classes `TextFile` and `BinaryFile`.

interface FileOperation {
    void read(String filename);

    void write(String filename);
}

class TextFile implements FileOperation {
    @Override
    public void read(String filename) {
        System.out.println("Loading " + filename + " To read its contenet, Please wait for few seconds.");
    }

    @Override
    public void write(String filename) {
        System.out.println("Writing into " + filename);
        System.out.println("Finished writing...");
    }
}

class BinaryFile implements FileOperation {
    @Override
    public void read(String filename) {
        System.out.println("Loading " + filename + " To read its contenet, Please wait for few seconds.");
    }

    @Override
    public void write(String filename) {
        System.out.println("Writing into " + filename);
        System.out.println("Finished writing...");
    }
}

public class Main {

    public static void main(String[] args) {
        FileOperation f;

        f = new TextFile();
        f.read("Demo.txt");
        f.write("Demo.txt");

        f = new BinaryFile();
        f.read("log.bin");
        f.write("log.bin");
    }
}