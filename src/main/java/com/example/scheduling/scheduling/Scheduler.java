package com.example.scheduling.scheduling;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;

@Component
public class Scheduler {
    int counter = 0;
    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm:ss MM/dd YYYY");

    //使用@Scheduled，创建定时方法，
    @Scheduled(fixedRate = 4000)
    public void schedulerTest() {
        counter++;
        System.out.println("定时任务,第" + counter + "此执行:" + simpleDateFormat.format(new Date()));
    }

    //定时到具体某一时刻执行，下面是每天指定时刻执行
    @Scheduled(cron = "40 46 16 ? * *")
    public void schedulerTest2() {
        counter++;
        System.out.println("定时任务,第" + counter + "此执行:++" + simpleDateFormat.format(new Date()));
    }

    @Scheduled(fixedDelay = 3000)
    public void sum() {
        int n = 100;
        int sum = 0;
        String reg = "\\d+\\.\\d+\\.\\d+\\.\\d";
        boolean matches = Pattern.matches(reg, "333.2.0.4");
        for (int i = 0; i < n; i++) {
            sum += i;
        }
        System.out.println(sum + "  " + simpleDateFormat.format(new Date()) + matches);
        //labmda 表达式
        List<String> list = new ArrayList<>();
        list.add("clc");
        list.add("www");
        list.add("dll");
        list.forEach(any -> System.out.println(any));
        list.forEach(item -> {
            if (item.equals("dll")) {
                System.out.println("+++++++-" + item);
            }
        });
        //map集合不属于Collection，它有自己的foreach()方法
        HashMap<String, User> map = new HashMap<>();
        User user1 = new User();
        user1.setId(10);
        user1.setName("clc");
        user1.setAge(27);
        User user2 = new User(1);
        User user3 = new User(2);
        User user4 = new User(2);
        map.put("1", user1);
        map.put("2", user2);
        map.put("3", user3);
        System.out.println(map.get("1").getId());
        map.forEach((k,v)-> v.setName("我是谁"));
        System.out.println(map.get("1")+","+map.get("2"));
    }
}
