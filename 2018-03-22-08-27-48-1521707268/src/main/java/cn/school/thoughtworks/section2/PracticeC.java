package cn.school.thoughtworks.section2;

import java.util.*;

public class PracticeC {
    Map<String, Integer> countSameElements(List<String> collection1) {
        Map<String, Integer> www = new HashMap<>();
        String[] adc=new String[collection1.size()];//初始化一个和1集合一样大小的数组，数组可以用下标查找元素，并且对其进行操作
        int h=0;int t1=0;int t2=0;int c=0;int d=0;//定义5个int，后面用来给集合循环添加数据
        for(int i=0;i<collection1.size();i++){
            adc[i]=collection1.get(i);//遍历1集合，把元素放进数组adc中；即把1集合转化为数组
        }
        for(int i=1;i<adc.length;i++){//遍历数组
            if(adc[i]=="h[3]"){//如果找到“h[3]‘，将其变为”h”，把2赋值给前面初始化的h
                adc[i]="h";
                h=2;
            }
            if(adc[i]=="t-2"){//...
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
            if(adc[i]=="d-5"){//同上
                adc[i]="d";
                d=4;
            }
        }
        List<String> asd=new ArrayList<>(adc.length);//再将数组转化为集合，集合可以使用add添加元素
        for(String s:adc){
            asd.add(s);//把数组里的元素放进集合
        }
        for(int i=0;i<h;i++){//根据前面定义的h给集合添加h个“h“；因为”h[3]"相当于3个“h“，”h[3]”变成“h”后，还得添加两个“h“
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
        for(int i=0;i<d;i++){//同上
            asd.add("d");
        }
        for(String aa:asd){
            Integer i = 1;
            if (www.get(aa) != null ) {//遍历1集合，每遇到一个元素，把它放进www里作为key键，并且对应的“value”值加1
                i = www.get(aa) + 1;
            }
            www.put(aa, i);
        }
        return www;
    }
}


