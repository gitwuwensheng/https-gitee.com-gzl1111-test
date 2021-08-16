package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String,Integer> countSameElements(List<String> collection1) {
        Map<String,Integer> www=new HashMap<>();
        for(String aa:collection1){
            Integer i=1;
            if(www.get(aa)!=null){//遍历1集合，每遇到一个元素，把它放进www里作为key键，并且对应的“value”值加1
                i=www.get(aa)+1;
            }
           www.put(aa,i);
        }
        return www;
    }
}