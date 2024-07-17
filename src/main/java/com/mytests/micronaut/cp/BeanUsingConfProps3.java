package com.mytests.micronaut.cp;


import jakarta.inject.Inject;
import jakarta.inject.Singleton;

/**
 * *******************************
 * <p>Created by irina on 07.05.2020.</p>
 * <p>Project: micronaut-config-properties</p>
 * *******************************
 */
@Singleton
public class BeanUsingConfProps3 {
    @Inject
    MyConfProps3 props3;
    
    public String getProperties(){
        
        String p1 = "enumMap: "+props3.getEnumMap();
        String p2 = "enum1Enum2Map: "+props3.getEnum1Enum2Map();
        String p3 = "foo9Bar: "+props3.getFoo9Bar();
         return p1+" "+p2+" "+p3;
    }
}
