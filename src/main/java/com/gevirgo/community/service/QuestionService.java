package com.gevirgo.community.service;

import com.gevirgo.community.dto.QuestionDTO;
import com.gevirgo.community.mapper.QuestionMapper;
import com.gevirgo.community.mapper.UserMapper;
import com.gevirgo.community.model.Question;
import com.gevirgo.community.model.User;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Description :
 * @Author : dingliangliang
 * @Date: 2020-09-20 16:32
 */
@Service
public class QuestionService {
    @Autowired
    QuestionMapper questionMapper;
    @Autowired
    UserMapper userMapper;
    public List<QuestionDTO> list() {
        List<Question> questions = questionMapper.list();
        List<QuestionDTO> questionDTOList = new ArrayList<>();
        if (!CollectionUtils.isEmpty(questions)){
            for (Question question : questions) {
                User user = userMapper.findById(question.getCreator());
                QuestionDTO questionDTO = new QuestionDTO();
                BeanUtils.copyProperties(question,questionDTO);
                questionDTO.setUser(user);
                questionDTOList.add(questionDTO);
            }
        }
        return questionDTOList;
    }
}
