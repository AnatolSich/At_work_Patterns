package UProxy.ProxyService;

import java.util.ArrayList;
import java.util.List;

public class ProxyTest {
    public static void main(String[] args) {
        Browser browser = new Browser();
//Adding images to browser page (images are not loaded)
        browser.addImage("aaa.jpg");
        browser.addImage("bbb.jpg");
        browser.addImage("ccc.tif");
        browser.addImage("ddd.jpg");
        browser.addImage("eee.tif");
        browser.addImage("fff.tif");
//Loading and display all images on page
        browser.display();
    }

}

//ImageDisplayService instance was changed to ImageDisplayProxyService instance
class Browser {

    List<ImageDisplayServiceInterface> list = new ArrayList<>();

    public void addImage(String image) {
        list.add(new ImageDisplayProxyService(image));
    }

    public void display() {
        for (ImageDisplayServiceInterface imageService : list
                ) {
            imageService.imageDisplay();
        }
    }
}