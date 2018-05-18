package UProxy.Service;

import java.util.ArrayList;
import java.util.List;

public class ProxyTest {
    public static void main(String[] args) {
        Browser browser = new Browser();
//Adding images to browser page (every image is loaded immediately)
        browser.addImage("aaa.jpg");
        browser.addImage("bbb.jpg");
        browser.addImage("ccc.tif");
        browser.addImage("ddd.jpg");
        browser.addImage("eee.tif");
        browser.addImage("fff.tif");

//Display all images on page
        browser.display();
    }

}

class Browser {

    List<ImageDisplayServiceInterface> list = new ArrayList<>();

    public void addImage(String image) {
        list.add(new ImageDisplayService(image));
    }

    public void display() {
        for (ImageDisplayServiceInterface imageService : list
                ) {
            imageService.imageDisplay();
        }
    }
}