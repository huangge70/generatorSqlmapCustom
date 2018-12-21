package com.mapper;

import com.pojo.Feel;
import com.pojo.FeelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FeelMapper {
    int countByExample(FeelExample example);

    int deleteByExample(FeelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Feel record);

    int insertSelective(Feel record);

    List<Feel> selectByExampleWithBLOBs(FeelExample example);

    List<Feel> selectByExample(FeelExample example);

    Feel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Feel record, @Param("example") FeelExample example);

    int updateByExampleWithBLOBs(@Param("record") Feel record, @Param("example") FeelExample example);

    int updateByExample(@Param("record") Feel record, @Param("example") FeelExample example);

    int updateByPrimaryKeySelective(Feel record);

    int updateByPrimaryKeyWithBLOBs(Feel record);

    int updateByPrimaryKey(Feel record);
}