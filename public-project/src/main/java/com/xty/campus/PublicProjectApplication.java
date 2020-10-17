package com.xty.campus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.xty.campus.mapper")
public class PublicProjectApplication {
    public static void main(String[] args) {
        SpringApplication.run(PublicProjectApplication.class,args);

    }

    /*public void getDay(String start,String end){
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date startTime = null;
        Date endTime = null;

        try {
            startTime = df.parse(start);
            endTime = df.parse(end);
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }*/
}
