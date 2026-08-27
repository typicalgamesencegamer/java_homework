package ru.aston.hometask_3.proxy.impl;

import ru.aston.hometask_3.proxy.api.Loader;

public class ImageLoader implements Loader {
    private String path;

    public ImageLoader(String path) {
        this.path = path;
        load();
    }

    private void load() {
        System.out.println("Loading image: " + path);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("Image loading interrupted");
        }
    }

    @Override
    public void run() {
        System.out.println("Showing image: " + path);
    }
}
