package ru.aston.hometask_3.proxy.client;

import ru.aston.hometask_3.proxy.api.Loader;
import ru.aston.hometask_3.proxy.impl.ProxyImageLoader;

public class Main {
    public static void main(String[] args) {
        Loader loader = new ProxyImageLoader("C://Desktop//image.png");
        System.out.println("Some actions...");
        loader.run();
        loader.run();
    }
}
