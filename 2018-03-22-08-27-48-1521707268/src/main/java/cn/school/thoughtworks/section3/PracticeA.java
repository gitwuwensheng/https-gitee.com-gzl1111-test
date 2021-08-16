package cn.school.thoughtworks.section3;

import java.util.*;

public class PracticeA {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        Map<String,Integer> www=new HashMap<>();
        List<String> aaa=new ArrayList<>();
        for(String key1 :object.keySet()){//做一次遍历，把object里的list拿出来赋值给map2
            List<String> map2 =object.get(key1);
            for(String aa :map2){//在遍历中再对map2座一次遍历，把map2里的元素拿出来放进一个集合，因为按照test中要求，我们需要的是2集合里value属性中的元素
                aaa.add(aa);
            }
        }
        for(String key2:collectionA.keySet()) {
            Integer map1 = collectionA.get(key2);//初始化 map1接收collectionA里的value属性值
            for (String bb : aaa) {
                if (bb.equals(key2)) {//找到与2集合里value属性中元素相同的元素，并将其对应的count-1
                    map1 = map1 - 1;
                }
                www.put(key2, map1);
            }
        }
        return  www;
    }
}