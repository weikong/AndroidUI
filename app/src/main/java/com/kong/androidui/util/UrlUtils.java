package com.kong.androidui.util;

import java.net.MalformedURLException;
import java.net.URL;

public class UrlUtils {
    public static String getHost(String url) throws MalformedURLException {
        return new URL(url).getHost();
    }
}
