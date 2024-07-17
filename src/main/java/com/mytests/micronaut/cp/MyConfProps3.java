package com.mytests.micronaut.cp;

import io.micronaut.context.annotation.ConfigurationProperties;

import java.util.Map;

/**
 * *******************************
 * <p>Created by irina on 07.05.2020.</p>
 * <p>Project: micronaut-config-properties</p>
 * *******************************
 */
@ConfigurationProperties("my.confprops.cp3")
public class MyConfProps3 {
    
    String strProp;
    Map<String, String> stringMap;
    Map<MyEnum1, String> enumStringMap;
    Map<MyEnum1, MyEnum2> enumMap;
    Map<MyEnum2, MyEnum1> enum1Enum2Map;
    Map<MyEnum2, MyEnum1> foo9Bar;

    public String getStrProp() {
        return strProp;
    }

    public void setStrProp(String strProp) {
        this.strProp = strProp;
    }

    public Map<MyEnum2, MyEnum1> getFoo9Bar() {
        return foo9Bar;
    }

    public void setFoo9Bar(Map<MyEnum2, MyEnum1> foo9Bar) {
        this.foo9Bar = foo9Bar;
    }

    public Map<MyEnum2, MyEnum1> getEnum1Enum2Map() {
        return enum1Enum2Map;
    }

    public void setEnum1Enum2Map(Map<MyEnum2, MyEnum1> enum1Enum2Map) {
        this.enum1Enum2Map = enum1Enum2Map;
    }

    public Map<String, String> getStringMap() {
        return stringMap;
    }

    public void setStringMap(Map<String, String> stringMap) {
        this.stringMap = stringMap;
    }

    public Map<MyEnum1, String> getEnumStringMap() {
        return enumStringMap;
    }

    public void setEnumStringMap(Map<MyEnum1, String> enumStringMap) {
        this.enumStringMap = enumStringMap;
    }

    public Map<MyEnum1, MyEnum2> getEnumMap() {
        return enumMap;
    }

    public void setEnumMap(Map<MyEnum1, MyEnum2> enumMap) {
        this.enumMap = enumMap;
    }
}
