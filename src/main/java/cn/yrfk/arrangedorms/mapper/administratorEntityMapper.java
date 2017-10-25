package cn.yrfk.arrangedorms.mapper;

import cn.yrfk.arrangedorms.entity.administratorEntity;
import cn.yrfk.arrangedorms.entity.administratorEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface administratorEntityMapper {
    long countByExample(administratorEntityExample example);

    int deleteByExample(administratorEntityExample example);

    int deleteByPrimaryKey(Integer arNumber);

    int insert(administratorEntity record);

    int insertSelective(administratorEntity record);

    List<administratorEntity> selectByExample(administratorEntityExample example);

    administratorEntity selectByPrimaryKey(Integer arNumber);

    int updateByExampleSelective(@Param("record") administratorEntity record, @Param("example") administratorEntityExample example);

    int updateByExample(@Param("record") administratorEntity record, @Param("example") administratorEntityExample example);

    int updateByPrimaryKeySelective(administratorEntity record);

    int updateByPrimaryKey(administratorEntity record);
}