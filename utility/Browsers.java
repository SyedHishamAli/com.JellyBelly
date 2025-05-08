package com.utility;

import java.util.HashMap;
import java.util.Map;

public final class Browsers {
    private static Map<String, String> browsersList = new HashMap<>();
    private static String browser;

    static {
        browsersList.put("ie9", "IE9");
        browsersList.put("ie10", "IE10");
        browsersList.put("ie11", "IE11");
        browsersList.put("firefox", "Firefox");
        browsersList.put("chrome", "Chrome");
        browsersList.put("safari", "Safari");
        browsersList.put("saucelabs", "Saucelabs");
    }

    private Browsers() {
    }

    public static String get() {
        browser = System.getenv("browser");
        String lowerBrowser = (browser == null ? Utils.getProperty("Browser") : browser).toLowerCase();
        return browsersList.get(lowerBrowser);
    }

    public static String get(String environment) {
        return browsersList.get(environment);
    }

    public static void set(String environment) {
        Browsers.browser = environment;
    }
}
