package cn.yrfk.arrangedorms.mapper;

import cn.yrfk.arrangedorms.entity.AdministratorEntity;
import cn.yrfk.arrangedorms.entity.AdministratorEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdministratorEntityMapper {
    long countByExample(AdministratorEntityExample example);

    int deleteByExample(AdministratorEntityExample example);

    int deleteByPrimaryKey(Integer arNumber);

    int insert(AdministratorEntity record);

    int insertSelective(AdministratorEntity record);

    List<AdministratorEntity> selectByExample(AdministratorEntityExample example);

    AdministratorEntity selectByPrimaryKey(Integer arNumber);

    int updateByExampleSelective(@Param("record") AdministratorEntity record, @Param("example") AdministratorEntityExample example);

    int updateByExample(@Param("record") AdministratorEntity record, @Param("example") AdministratorEntityExample example);

    int updateByPrimaryKeySelective(AdministratorEntity record);

    int updateByPrimaryKey(AdministratorEntity record);
}