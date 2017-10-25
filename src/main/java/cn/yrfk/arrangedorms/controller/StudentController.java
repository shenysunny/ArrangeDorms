package cn.yrfk.arrangedorms.controller;

import cn.yrfk.arrangedorms.entity.MsgEntity;
import cn.yrfk.arrangedorms.entity.StudentEntity;
import cn.yrfk.arrangedorms.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
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
    @RequestMapping(value = "/student",method = RequestMethod.POST)
    public MsgEntity addStudent(StudentEntity student){
        studentService.addStudent(student);
        return MsgEntity.success();
    }

    /*修改学生信息*/
    @RequestMapping(value = "/student/{sdNumber}",method = RequestMethod.PUT)
    public MsgEntity updateStudent(StudentEntity student){
        studentService.updateStudent(student);
        return MsgEntity.success();
    }

    /*删除学生信息*/
    @RequestMapping(value = "/student/{sdNumber}",method = RequestMethod.DELETE)
    public MsgEntity deleteStudent(@PathVariable("sdNumber") Integer sdNumber) {
        System.out.println("deleteStudent");
        return MsgEntity.success();
    }

    /*根据sdNumber来查询学生信息*/
    @RequestMapping(value = "/student/{sdNumber}",method = RequestMethod.GET)
    public MsgEntity gitStudentBySdNumber(@PathVariable("sdNumber") Integer sdNumber ){
        System.out.println("gitStudentBySdNumber");
        return MsgEntity.success();
    }
}
