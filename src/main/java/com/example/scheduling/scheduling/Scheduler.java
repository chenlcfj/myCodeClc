package com.example.scheduling.scheduling;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
        List<String> list=new ArrayList<>();
        list.add("clc");
        list.add("www");
        list.add("dll");
        list.forEach(any-> System.out.println(any));
        list.forEach(item->{
            if (item.equals("dll")) {
                System.out.println("+++++++-"+item);
            }
        });
    }
}
