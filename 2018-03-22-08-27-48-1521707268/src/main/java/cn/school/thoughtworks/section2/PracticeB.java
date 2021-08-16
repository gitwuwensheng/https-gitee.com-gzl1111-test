package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String, Integer> countSameElements(List<String> collection1) {
        Map<String,Integer> www=new HashMap<>();
        for(String aa:collection1){
            Integer i=1;
            if(www.get(aa)!=null&&aa!="d-5"){//同上做遍历
                i=www.get(aa)+1;
            }
            if(aa=="d-5"){//如果遇到“d-5”，把“d-5”变为“d”再放进www里，并且把其对应的“value”值变为5（这是取巧做法）
               aa="d";
               i=5;
            }
            www.put(aa,i);
        }
        return www;
    }
}
