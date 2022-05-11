package com.xiaoyingwei.demo7.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

/**
 * @author xiaoyingwei
 * @since 22/4/2022 下午4:03
 */
public class QuesBank {
    private int id;//题库id
    private String name;//题库名称
    private String director;//负责人
    private String intro;//简介
    private int numOfPlan;//计划数量
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime completeDate;//预估时间
    private String type;//类型
    private String addToPubPool;//是否加入公共池

    public QuesBank() {

    }

    public QuesBank(int id, String name, String director, String intro, int numOfPlan, LocalDateTime completeDate, String type, String addToPubPool) {
        this.id = id;
        this.name = name;
        this.director = director;
        this.intro = intro;
        this.numOfPlan = numOfPlan;
        this.completeDate = completeDate;
        this.type = type;
        this.addToPubPool = addToPubPool;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public int getNumOfPlan() {
        return numOfPlan;
    }

    public void setNumOfPlan(int numOfPlan) {
        this.numOfPlan = numOfPlan;
    }

    public LocalDateTime getCompleteDate() {
        return completeDate;
    }

    public void setCompleteDate(LocalDateTime completeDate) {
        this.completeDate = completeDate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAddToPubPool() {
        return addToPubPool;
    }

    public void setAddToPubPool(String addToPubPool) {
        this.addToPubPool = addToPubPool;
    }
}
