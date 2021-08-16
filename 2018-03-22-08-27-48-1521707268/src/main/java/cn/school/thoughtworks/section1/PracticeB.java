package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PracticeB {
    List<String> collectSameElements(List<String> collection1, List<List<String>> collection2) {
        List<String> aa = new ArrayList<>();//初始化列表aa
        for(int i=0;i<collection2.size();i++){
            aa=collection2.get(i);//collection2列表里放的也是列表，把collection2里列表里的元素放进一个新集合
        }
        List<String> qqq = new ArrayList();
        for(String integer :aa) {//与Practice一致，两个列表找相同，添加进qqq
            if (collection1.contains(integer)) {
                qqq.add(integer);
            }
        }
        Collections.sort(qqq);//排序
        return  qqq;
    }
}
