package com.zhan.cn.consumerls.lambad;

import java.util.*;

/**
 * @author sir
 * 15:22
 * 境由心生,事在人为
 */
public class MainClass {

    public static void main(String[] args) {
        // 1.无参数，无返回值
        NoArgsNoreturen noreturen = () -> System.out.println("没有返回值");
        noreturen.test();
        // 2.有返回值
        HasArgsHasReturn hasReturn = (a, b) -> {
            System.out.println("开始执行");
            return a + b; 

        };
        System.out.println(hasReturn.add(12, 12));

        // 3.方法的引用 ，就是被引用的方法实现了函数式接口中的方法
        // sub 中的入参和接口中保持一致，但是引用处不需要写入参信息
        NoRuleInte inte = MainClass::sub;
        System.out.println(inte.sub(23, 23));


        // 4.常用集合的lambda排序用法
        List<Book> list = new ArrayList<>();
        list.add(new Book("葵花宝典",12));
        list.add(new Book("移花节目",22));
        list.add(new Book("先天罡气",55));
        list.add(new Book("九阴真经",11));
        list.add(new Book("java开发",9));
        list.sort((t1,t2)-> t1.getPrice()-t2.getPrice());
        System.out.println("List 使用lambda排序");
        System.out.println(list);

        // set集合演示
        TreeSet<Book> set = new TreeSet<>((t1,t2)->t1.getPrice()-t2.getPrice());
        set.add(new Book("葵花宝典",12));
        set.add(new Book("移花节目",22));
        set.add(new Book("先天罡气",55));
        set.add(new Book("九阴真经",11));
        set.add(new Book("java开发",9));
        System.out.println("set 使用lambda排序");
        System.out.println(set);
    }

    public static int sub(int a, int b) {
        System.out.println("执行方法的引用，如果有入参也不需要写括号");
        return a + b;
    }

}


