package com.xiaoyingwei.demo7.mapper;

import com.xiaoyingwei.demo7.bean.QuesBank;

import java.util.List;

/**
 * @author xiaoyingwei
 * @since 29/4/2022 下午4:26
 */
public interface QuesBankMapper {
    public String addQuesBank(QuesBank quesBank);

    public List<QuesBank> getQuesBank();

    public String updateQuesBank(QuesBank quesBank);

    public String deleteQuesBank(Integer id);

    public QuesBank getOneQuesBank(Integer id);
}
