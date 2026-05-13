// Create an interface `Storage` with methods `upload()` and `download()`. Implement classes `GoogleDrive` and `Dropbox`.

interface Storage {

    void upload();

    void download();
}

class GoogleDrive implements Storage {

    @Override
    public void upload() {
        System.out.println("Uploading file to Google Drive...");
    }

    @Override
    public void download() {
        System.out.println("Downloading file from Google Drive...");
    }
}

class Dropbox implements Storage {

    @Override
    public void upload() {
        System.out.println("Uploading file to Dropbox...");
    }

    @Override
    public void download() {
        System.out.println("Downloading file from Dropbox...");
    }
}

public class Main {

    public static void main(String[] args) {

        Storage s;

        s = new GoogleDrive();
        s.upload();
        s.download();

        System.out.println();

        s = new Dropbox();
        s.upload();
        s.download();
    }
}