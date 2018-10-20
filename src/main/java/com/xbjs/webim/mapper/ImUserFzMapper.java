package com.xbjs.webim.mapper;

import com.xbjs.webim.pojo.ImUserFz;
import com.xbjs.webim.pojo.ImUserFzExample;
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
public interface ImUserFzMapper {
    /**
     * Count by example int.
     *
     * @param example the example
     * @return the int
     */
    int countByExample(ImUserFzExample example);

    /**
     * Delete by example int.
     *
     * @param example the example
     * @return the int
     */
    int deleteByExample(ImUserFzExample example);

    /**
     * Delete by primary key int.
     *
     * @param id the id
     * @return the int
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * Insert int.
     *
     * @param record the record
     * @return the int
     */
    int insert(ImUserFz record);

    /**
     * Insert selective int.
     *
     * @param record the record
     * @return the int
     */
    int insertSelective(ImUserFz record);

    /**
     * Select by example list.
     *
     * @param example the example
     * @return the list
     */
    List<ImUserFz> selectByExample(ImUserFzExample example);

    /**
     * Select by primary key im user fz.
     *
     * @param id the id
     * @return the im user fz
     */
    ImUserFz selectByPrimaryKey(Integer id);

    /**
     * Update by example selective int.
     *
     * @param record  the record
     * @param example the example
     * @return the int
     */
    int updateByExampleSelective(@Param("record") ImUserFz record, @Param("example") ImUserFzExample example);

    /**
     * Update by example int.
     *
     * @param record  the record
     * @param example the example
     * @return the int
     */
    int updateByExample(@Param("record") ImUserFz record, @Param("example") ImUserFzExample example);

    /**
     * Update by primary key selective int.
     *
     * @param record the record
     * @return the int
     */
    int updateByPrimaryKeySelective(ImUserFz record);

    /**
     * Update by primary key int.
     *
     * @param record the record
     * @return the int
     */
    int updateByPrimaryKey(ImUserFz record);
}