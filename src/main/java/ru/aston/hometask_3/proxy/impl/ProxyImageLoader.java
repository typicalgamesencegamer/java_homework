package ru.aston.hometask_3.proxy.impl;

import ru.aston.hometask_3.proxy.api.Loader;

public class ProxyImageLoader implements Loader {
    private String path;
    private ImageLoader image;

    public ProxyImageLoader(String path) {
        this.path = path;
    }

    @Override
    public void run() {
        if (image == null) {
            image = new ImageLoader(path);
        }
        image.run();
    }
}
