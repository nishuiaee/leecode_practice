package DesignPattern.Proxy;


import java.net.URL;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-10-10 21:28
 **/
public class ImageViewer {
    public static void main(String[] args) throws Exception{
        String image = "http://image.jpg";
        URL url = new URL(image);
        HighResolutionImage highResolutionImage = new HighResolutionImage(url);
        ImageProxy imageProxy = new ImageProxy(highResolutionImage);
        imageProxy.showImage();
    }
}
