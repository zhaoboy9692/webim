package com.xbjs.webim.mapper;

import com.xbjs.webim.pojo.ImMsgbox;
import com.xbjs.webim.pojo.ImMsgboxExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ImMsgboxMapper {
    int countByExample(ImMsgboxExample example);

    int deleteByExample(ImMsgboxExample example);

    int deleteByPrimaryKey(Long boxId);

    int insert(ImMsgbox record);

    int insertSelective(ImMsgbox record);

    List<ImMsgbox> selectByExample(ImMsgboxExample example);

    ImMsgbox selectByPrimaryKey(Long boxId);

    int updateByExampleSelective(@Param("record") ImMsgbox record, @Param("example") ImMsgboxExample example);

    int updateByExample(@Param("record") ImMsgbox record, @Param("example") ImMsgboxExample example);

    int updateByPrimaryKeySelective(ImMsgbox record);

    int updateByPrimaryKey(ImMsgbox record);
}