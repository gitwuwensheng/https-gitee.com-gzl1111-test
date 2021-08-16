package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class PracticeC {
    List<String> collectSameElements(List<String> collection1, Map<String,List<String>> collection2) {
        List<String> bb = new ArrayList<>();
        bb=collection2.get("value");//把2集合里的“value”对应的元素放进bb中
        List<String> qqq = new ArrayList();
        for(String integer :bb) {//同上两集合找相同
            if (collection1.contains(integer)) {
                qqq.add(integer);
            }
        }
        Collections.sort(qqq);//排序
        return  qqq;
    }
}
