package cn.yrfk.arrangedorms.service;

import cn.yrfk.arrangedorms.entity.StudentEntity;
import cn.yrfk.arrangedorms.mapper.StudentEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * StudentService 服务层
 */
@Service
public class StudentService {
    @Autowired
    StudentEntityMapper studentEntityMapper;

    /*添加学生信息*/
    public void addStudent(StudentEntity student){
        studentEntityMapper.insert(student);
    }

    /*修改学生信息*/
    public void updateStudent(StudentEntity student){
        studentEntityMapper.insert(student);
    }

    /*删除学生信息*/
    public void deleteStudent(Integer sdNumber ){
        studentEntityMapper.deleteByPrimaryKey(sdNumber);
    }

    /*根据sdNumber来查询学生信息*/
    public StudentEntity gitStudentBySdNumber(Integer sdNumber ){
        return studentEntityMapper.selectByPrimaryKey(sdNumber);
    }
}
