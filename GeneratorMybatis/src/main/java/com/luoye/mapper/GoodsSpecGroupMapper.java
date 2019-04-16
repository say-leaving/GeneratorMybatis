package com.luoye.mapper;

import com.luoye.model.GoodsSpecGroup;
import com.luoye.model.GoodsSpecGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsSpecGroupMapper {
    int countByExample(GoodsSpecGroupExample example);

    int deleteByExample(GoodsSpecGroupExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GoodsSpecGroup record);

    int insertSelective(GoodsSpecGroup record);

    List<GoodsSpecGroup> selectByExample(GoodsSpecGroupExample example);

    GoodsSpecGroup selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GoodsSpecGroup record, @Param("example") GoodsSpecGroupExample example);

    int updateByExample(@Param("record") GoodsSpecGroup record, @Param("example") GoodsSpecGroupExample example);

    int updateByPrimaryKeySelective(GoodsSpecGroup record);

    int updateByPrimaryKey(GoodsSpecGroup record);
}