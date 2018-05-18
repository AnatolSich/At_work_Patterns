package UProxy.Service;

public interface ImageDisplayServiceInterface {
    void imageDisplay();
}

//Loading bigDataFile executes in every instance of ImageDisplayService class
class ImageDisplayService implements ImageDisplayServiceInterface {

    private String bigDataFile;

    public ImageDisplayService(String bigDataFile) {
        this.bigDataFile = bigDataFile;
        if (bigDataFile.contains(".jpg")) imageLoadJpg();
        else if (bigDataFile.contains(".tif")) imageLoadTif();
    }

    @Override
    public void imageDisplay() {

        System.out.println("Display " + bigDataFile);
    }

    private void imageLoadJpg() {
        System.out.println("Load jpg " + bigDataFile);
    }

    private void imageLoadTif() {
        System.out.println("Load tif " + bigDataFile);
    }


}