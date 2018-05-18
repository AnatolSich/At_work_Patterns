package UProxy.ProxyService;

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

//Loading bigDataFile executes only when commits imageDisplay() method
class ImageDisplayProxyService implements ImageDisplayServiceInterface {

    ImageDisplayService realService;
    private String bigDataFile;

    public ImageDisplayProxyService(String bigDataFile) {
        this.bigDataFile = bigDataFile;
    }

    @Override
    public void imageDisplay() {
        this.realService = new ImageDisplayService(this.bigDataFile);
        realService.imageDisplay();
    }


}

