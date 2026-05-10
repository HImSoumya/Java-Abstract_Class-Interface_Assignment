// Create an abstract class `FileProcessor` with method `processFile()`. Implement subclasses `TextFile`, `ImageFile`, and `VideoFile`.
abstract class FileProcessor {

    abstract void processFile();
}

class TextFile extends FileProcessor {

    private String fileName;

    TextFile(String fileName) {
        this.fileName = fileName;
    }

    @Override
    void processFile() {
        System.out.println("Processing Text File: " + fileName);
        System.out.println("Reading text content...");
    }
}

class ImageFile extends FileProcessor {

    private String fileName;

    ImageFile(String fileName) {
        this.fileName = fileName;
    }

    @Override
    void processFile() {
        System.out.println("Processing Image File: " + fileName);
        System.out.println("Rendering image...");
    }
}

class VideoFile extends FileProcessor {

    private String fileName;

    VideoFile(String fileName) {
        this.fileName = fileName;
    }

    @Override
    void processFile() {
        System.out.println("Processing Video File: " + fileName);
        System.out.println("Playing video...");
    }
}

public class Main {

    public static void main(String[] args) {

        FileProcessor fp;

        fp = new TextFile("notes.txt");
        fp.processFile();

        System.out.println();

        fp = new ImageFile("photo.png");
        fp.processFile();

        System.out.println();

        fp = new VideoFile("movie.mp4");
        fp.processFile();
    }
}