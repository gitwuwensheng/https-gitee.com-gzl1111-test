package cn.school.thoughtworks.section3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        Map<String,Integer> www=new HashMap<>();
        List<String> aaa=new ArrayList<>();
        for(String key1 :object.keySet()){//与上一小题相同
            List<String> map2 =object.get(key1);
            for(String aa :map2){
                aaa.add(aa);
            }
        }
        for(String key2:collectionA.keySet()) {
            Integer map1 = collectionA.get(key2);
            for (String bb : aaa) {
                if (bb.equals(key2)) {//与上一小题大致一样，将count-1改为count满3减一
                    int a=map1/3;
                    map1 = map1 - a;

                }
                www.put(key2, map1);
            }
        }
        return  www;
    }
}
