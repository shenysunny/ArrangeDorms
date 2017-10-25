package cn.yrfk.arrangedorms.mapper;

import cn.yrfk.arrangedorms.entity.StudentEntity;
import cn.yrfk.arrangedorms.entity.StudentEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudentEntityMapper {
    long countByExample(StudentEntityExample example);

    int deleteByExample(StudentEntityExample example);

    int deleteByPrimaryKey(Integer sdNumber);

    int insert(StudentEntity record);

    int insertSelective(StudentEntity record);

    List<StudentEntity> selectByExample(StudentEntityExample example);

    StudentEntity selectByPrimaryKey(Integer sdNumber);

    int updateByExampleSelective(@Param("record") StudentEntity record, @Param("example") StudentEntityExample example);

    int updateByExample(@Param("record") StudentEntity record, @Param("example") StudentEntityExample example);

    int updateByPrimaryKeySelective(StudentEntity record);

    int updateByPrimaryKey(StudentEntity record);
}