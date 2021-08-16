package cn.school.thoughtworks.section3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeD {
    Map<String,Integer> createUpdatedCollection(List<String> collection1, Map<String,List<String>> object) {
        Map<String, Integer> collection3 = new HashMap<>();
        String[] adc=new String[collection1.size()];
        int h=0;int t1=0;int t2=0;int c=0;int d=0;
        for(int i=0;i<collection1.size();i++){//思路与section2中PracticeC一样,对其进行统计，形成collection3
            adc[i]=collection1.get(i);
        }
        for(int i=1;i<adc.length;i++){
            if(adc[i]=="h[3]"){
                adc[i]="h";
                h=2;
            }
            if(adc[i]=="t-2"){
                adc[i]="t";
                t1=1;
            }
            if(adc[i]=="t[10]"){
                adc[i]="t";
                t2=9;
            }
            if(adc[i]=="c:8"){
                adc[i]="c";
                c=7;
            }
            if(adc[i]=="d-5"){
                adc[i]="d";
                d=4;
            }
        }
        List<String> asd=new ArrayList<>(adc.length);
        for(String s:adc){
            asd.add(s);
        }
        for(int i=0;i<h;i++){
            asd.add("h");
        }
        for(int i=0;i<t1;i++){
            asd.add("t");
        }
        for(int i=0;i<t2;i++){
            asd.add("t");
        }
        for(int i=0;i<c;i++){
            asd.add("c");
        }
        for(int i=0;i<d;i++){
            asd.add("d");
        }
        for(String aa:asd){
            Integer i = 1;
            if (collection3.get(aa) != null ) {
                i = collection3.get(aa) + 1;
            }
            collection3.put(aa, i);//至此形成collection3
        }
        Map<String,Integer> www=new HashMap<>();
        List<String> aaa=new ArrayList<>();
        for(String key1 :object.keySet()){
            List<String> map2 =object.get(key1);
            for(String aa :map2){
                aaa.add(aa);
            }
        }
        for(String key2:collection3.keySet()) {//同上一小题
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
