package cn.yrfk.arrangedorms.controller;

import cn.yrfk.arrangedorms.entity.MsgEntity;
import cn.yrfk.arrangedorms.entity.StudentEntity;
import cn.yrfk.arrangedorms.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * StudentService 控制层
 */
@RestController
@RequestMapping("studentController")
public class StudentController {

    @Autowired
    StudentService studentService;

    /*添加学生信息*/
    @RequestMapping(value = "student",method = RequestMethod.POST)
    public MsgEntity addStudent(StudentEntity student){
        studentService.addStudent(student);
        return MsgEntity.success();
    }


}
