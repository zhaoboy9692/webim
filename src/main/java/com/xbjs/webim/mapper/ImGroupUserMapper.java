package com.xbjs.webim.mapper;

import com.xbjs.webim.pojo.ImGroupUser;
import com.xbjs.webim.pojo.ImGroupUserExample;

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
public interface ImGroupUserMapper {
    /**
     * Count by example int.
     *
     * @param example the example
     * @return the int
     */
    int countByExample(ImGroupUserExample example);

    /**
     * Delete by example int.
     *
     * @param example the example
     * @return the int
     */
    int deleteByExample(ImGroupUserExample example);

    /**
     * Delete by primary key int.
     *
     * @param groupUserId the group user id
     * @return the int
     */
    int deleteByPrimaryKey(Long groupUserId);

    /**
     * Insert int.
     *
     * @param record the record
     * @return the int
     */
    int insert(ImGroupUser record);

    /**
     * Insert selective int.
     *
     * @param record the record
     * @return the int
     */
    int insertSelective(ImGroupUser record);

    /**
     * Select by example list.
     *
     * @param example the example
     * @return the list
     */
    List<ImGroupUser> selectByExample(ImGroupUserExample example);

    /**
     * Select by primary key im group user.
     *
     * @param groupUserId the group user id
     * @return the im group user
     */
    ImGroupUser selectByPrimaryKey(Long groupUserId);

    /**
     * Update by example selective int.
     *
     * @param record  the record
     * @param example the example
     * @return the int
     */
    int updateByExampleSelective(@Param("record") ImGroupUser record, @Param("example") ImGroupUserExample example);

    /**
     * Update by example int.
     *
     * @param record  the record
     * @param example the example
     * @return the int
     */
    int updateByExample(@Param("record") ImGroupUser record, @Param("example") ImGroupUserExample example);

    /**
     * Update by primary key selective int.
     *
     * @param record the record
     * @return the int
     */
    int updateByPrimaryKeySelective(ImGroupUser record);

    /**
     * Update by primary key int.
     *
     * @param record the record
     * @return the int
     */
    int updateByPrimaryKey(ImGroupUser record);
}