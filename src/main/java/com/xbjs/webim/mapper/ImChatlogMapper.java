package com.xbjs.webim.mapper;

import com.xbjs.webim.pojo.ImChatlog;
import com.xbjs.webim.pojo.ImChatlogExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ImChatlogMapper {
    int countByExample(ImChatlogExample example);

    int deleteByExample(ImChatlogExample example);

    int deleteByPrimaryKey(Long chatlogid);

    int insert(ImChatlog record);

    int insertSelective(ImChatlog record);

    List<ImChatlog> selectByExample(ImChatlogExample example);

    ImChatlog selectByPrimaryKey(Long chatlogid);

    int updateByExampleSelective(@Param("record") ImChatlog record, @Param("example") ImChatlogExample example);

    int updateByExample(@Param("record") ImChatlog record, @Param("example") ImChatlogExample example);

    int updateByPrimaryKeySelective(ImChatlog record);

    int updateByPrimaryKey(ImChatlog record);
}