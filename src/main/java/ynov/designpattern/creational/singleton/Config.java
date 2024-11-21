package ynov.designpattern.creational.singleton;

import java.util.HashMap;
import java.util.Map;

public class Config {
    private Config() {}
    private static final Map<String, String> settings = new HashMap<>();

    static {
        settings.put("apiKey", "eff54fee5g46e78ge6h");
        settings.put("mode", "development");
        settings.put("bddUser", "root");
        settings.put("bddPassword", "root");
        settings.put("bddName", "db");
    }

    public static String getSettings(String key) {
        return settings.get(key);
    }

    public static void setSettings(String key, String value) {
        settings.put(key, value);
    }
}
