package com.xiaoyingwei.demo7.controller;

import com.xiaoyingwei.demo7.bean.QuesBank;
import com.xiaoyingwei.demo7.mapper.QuesBankMapper;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @author xiaoyingwei
 * @since 22/4/2022 下午4:11
 */
@RestController
public class QuesBankController {
    private QuesBankMapper quesBankMapper;
    //添加题库
    @PostMapping("/v1/quesBanks")
    public String addQuesBank(@RequestBody QuesBank quesBank) {
       /** System.out.println(quesBank.getId());
        System.out.println(quesBank.getName());
        System.out.println(quesBank.getDirector());
        System.out.println(quesBank.getIntro());
        System.out.println(quesBank.getNumOfPlan());
        System.out.println(quesBank.getCompleteDate());
        System.out.println(quesBank.getType());
        System.out.println(quesBank.getAddToPubPool());*/
        return quesBankMapper.addQuesBank(quesBank);
    }
    //编辑题库
    @PutMapping("/v1/quesBanks/{id}")
    public String updateQuesBank(@RequestBody QuesBank quesBank){
       /* System.out.println(quesBank.getId());
        System.out.println(quesBank.getName());
        System.out.println(quesBank.getDirector());
        System.out.println(quesBank.getIntro());
        System.out.println(quesBank.getNumOfPlan());
        System.out.println(quesBank.getCompleteDate());
        System.out.println(quesBank.getType());
        System.out.println(quesBank.getAddToPubPool());*/
        return quesBankMapper.updateQuesBank(quesBank);
    }
    //删除题库
    @DeleteMapping("/v1/quesBanks/{id}")
    public String deleteQuesBank(Integer id){
        /*System.out.println(id);*/
        return  quesBankMapper.deleteQuesBank(id);
    }
    //按id查询题库
    @GetMapping("/v1/quesBanks/{id}")
    public QuesBank getOneQuesBank(@PathVariable Integer id){
        //return new QuesBank(1,"高数","1","专升本高数",100, LocalDateTime.now(),"公开","是");
        return quesBankMapper.getOneQuesBank(id);
    }
    //查询所有题库
    @GetMapping("/v1/quesBanks")
    public List<QuesBank> getManyQuesBank(){
        List<QuesBank> list = new ArrayList<QuesBank>();
       /* list.add(new QuesBank(1,"高数","1","专升本高数",100, LocalDateTime.now(),"公开","是"));
        list.add(new QuesBank(2,"语文","1","专升本语文",100, LocalDateTime.now(),"公开","是"));*/
        list=quesBankMapper.getQuesBank();
        return list;
    }
}
