package com.girik;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class MapInterface {
    public static void main(String[] args) {
        Map <String,String> map=new HashMap<>();
        map.put("myName","Girik");
        map.put("Actor","Akshay");
        map.put("CEO","Sasan");

        Set <String> keys=map.keySet(); //fetching all keys from the map

        for (String key:keys){
            System.out.println(key+ " "+map.get(key));
        }

        System.out.println(map);
    }
}
