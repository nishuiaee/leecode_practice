package DesignPattern.Proxy;

import java.net.URL;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-10-10 21:21
 **/
public class HighResolutionImage implements Image{
    private URL imageURL;
    private long startTime;
    private int height;
    private int width;

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public HighResolutionImage(URL imageURL) {
        this.imageURL = imageURL;
        this.startTime = System.currentTimeMillis();
        this.width = 600;
        this.height = 600;
    }

    public boolean isLoad() {
        long endTime = System.currentTimeMillis();
        return endTime - startTime > 3000;
    }

    @Override
    public void showImage() {
        System.out.println("Readl Image: " + imageURL);
    }
}
