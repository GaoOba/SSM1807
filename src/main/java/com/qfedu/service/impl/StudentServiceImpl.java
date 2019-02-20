package com.qfedu.service.impl;

import com.qfedu.dao.StudentDao;
import com.qfedu.entity.Student;
import com.qfedu.service.StudentService;
import com.qfedu.utils.ResultUtil;
import com.qfedu.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl  implements StudentService {
    @Autowired
    private StudentDao studentDao;

    @Override
    public ResultVo addStudent(Student student) {

        return ResultUtil.exec(studentDao.save(student) >0,"新增记录",null);
    }
}
