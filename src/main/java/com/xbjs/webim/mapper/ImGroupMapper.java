package com.xbjs.webim.mapper;

import com.xbjs.webim.pojo.ImGroup;
import com.xbjs.webim.pojo.ImGroupExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: xincheng.zhao
 * @date: 2018/9/4
 * @description:
 */
@Mapper
public interface ImGroupMapper {
    /**
     * Count by example int.
     *
     * @param example the example
     * @return the int
     */
    int countByExample(ImGroupExample example);

    /**
     * Delete by example int.
     *
     * @param example the example
     * @return the int
     */
    int deleteByExample(ImGroupExample example);

    /**
     * Delete by primary key int.
     *
     * @param groupId the group id
     * @return the int
     */
    int deleteByPrimaryKey(Long groupId);

    /**
     * Insert int.
     *
     * @param record the record
     * @return the int
     */
    int insert(ImGroup record);

    /**
     * Insert selective int.
     *
     * @param record the record
     * @return the int
     */
    int insertSelective(ImGroup record);

    /**
     * Select by example list.
     *
     * @param example the example
     * @return the list
     */
    List<ImGroup> selectByExample(ImGroupExample example);

    /**
     * Select by primary key im group.
     *
     * @param groupId the group id
     * @return the im group
     */
    ImGroup selectByPrimaryKey(Long groupId);

    /**
     * Update by example selective int.
     *
     * @param record  the record
     * @param example the example
     * @return the int
     */
    int updateByExampleSelective(@Param("record") ImGroup record, @Param("example") ImGroupExample example);

    /**
     * Update by example int.
     *
     * @param record  the record
     * @param example the example
     * @return the int
     */
    int updateByExample(@Param("record") ImGroup record, @Param("example") ImGroupExample example);

    /**
     * Update by primary key selective int.
     *
     * @param record the record
     * @return the int
     */
    int updateByPrimaryKeySelective(ImGroup record);

    /**
     * Update by primary key int.
     *
     * @param record the record
     * @return the int
     */
    int updateByPrimaryKey(ImGroup record);
}