package com.qfedu.dao;
import com.qfedu.entity.Student;
import org.apache.ibatis.annotations.Insert;

public interface StudentDao {

    //新增
    @Insert("insert into student(name, password, age, sex, phone) values(#{name}, #{password}, #{age}, #{sex}, #{phone})")
    int save(Student student);


}
