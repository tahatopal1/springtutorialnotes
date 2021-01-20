package com.example.collections5.model;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class BasketballPlayers {

    private List<String> list;
    private Map<String, String> map;
    private Properties properties;

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
}
