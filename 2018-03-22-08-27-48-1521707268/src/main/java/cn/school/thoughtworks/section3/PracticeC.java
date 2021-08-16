package cn.school.thoughtworks.section3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        Map<String,Integer> collection3=new HashMap<>();
        for(String aa:collectionA){
            Integer i=1;
            if(collection3.get(aa)!=null){//思路与section2中PracticeA一样，对其进行统计，形成collection3
                i=collection3.get(aa)+1;
            }
            collection3.put(aa,i);
        }
        Map<String,Integer> www=new HashMap<>();
        List<String> aaa=new ArrayList<>();
        for(String key1 :object.keySet()){//同上一小题
            List<String> map2 =object.get(key1);
            for(String aa :map2){
                aaa.add(aa);
            }
        }
        for(String key2:collection3.keySet()) {
            Integer map1 = collection3.get(key2);
            for (String bb : aaa) {
                if (bb.equals(key2)) {
                    int a=map1/3;
                    map1 = map1 - a;

                }
                www.put(key2, map1);
            }
        }
        return  www;
    }
}
