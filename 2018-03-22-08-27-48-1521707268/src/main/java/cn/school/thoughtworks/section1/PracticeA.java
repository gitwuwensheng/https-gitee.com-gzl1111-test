package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class PracticeA {
    List<String> collectSameElements(List<String> collection1, List<String> collection2) {
        List<String> qqq = new ArrayList();//初始化列表qqq
        for(String integer:collection2) {//在collection1中找collection2的元素，找到就把这个元素添加到qqq
            if (collection1.contains(integer)) {
                qqq.add(integer);
            }
        }
        Collections.sort(qqq);//对qqq元素进行按照a、b、c的顺序排序
        return  qqq;
    }
}
