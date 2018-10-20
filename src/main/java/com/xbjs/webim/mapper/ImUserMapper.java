package com.xbjs.webim.mapper;

import com.xbjs.webim.pojo.ImUser;
import com.xbjs.webim.pojo.ImUserExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: xincheng.zhao
 * @date: 2018 /9/4
 * @description:
 */
@Mapper
public interface ImUserMapper {
    /**
     * Count by example int.
     *
     * @param example the example
     * @return the int
     */
    int countByExample(ImUserExample example);

    /**
     * Delete by example int.
     *
     * @param example the example
     * @return the int
     */
    int deleteByExample(ImUserExample example);

    /**
     * Delete by primary key int.
     *
     * @param id the id
     * @return the int
     */
    int deleteByPrimaryKey(Long id);

    /**
     * Insert int.
     *
     * @param record the record
     * @return the int
     */
    int insert(ImUser record);

    /**
     * Insert selective int.
     *
     * @param record the record
     * @return the int
     */
    int insertSelective(ImUser record);

    /**
     * Select by example list.
     *
     * @param example the example
     * @return the list
     */
    List<ImUser> selectByExample(ImUserExample example);

    /**
     * Select by primary key im user.
     *
     * @param id the id
     * @return the im user
     */
    ImUser selectByPrimaryKey(Long id);

    /**
     * Update by example selective int.
     *
     * @param record  the record
     * @param example the example
     * @return the int
     */
    int updateByExampleSelective(@Param("record") ImUser record, @Param("example") ImUserExample example);

    /**
     * Update by example int.
     *
     * @param record  the record
     * @param example the example
     * @return the int
     */
    int updateByExample(@Param("record") ImUser record, @Param("example") ImUserExample example);

    /**
     * Update by primary key selective int.
     *
     * @param record the record
     * @return the int
     */
    int updateByPrimaryKeySelective(ImUser record);

    /**
     * Update by primary key int.
     *
     * @param record the record
     * @return the int
     */
    int updateByPrimaryKey(ImUser record);

    /**
     * Update status by user id.
     *
     * @param userId the user id
     * @param status the status
     */
    void updateStatusByUserId(Long userId, String status);
}