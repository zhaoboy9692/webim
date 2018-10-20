package com.xbjs.webim.mapper;

import com.xbjs.webim.pojo.ImMyFz;
import com.xbjs.webim.pojo.ImMyFzExample;
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
public interface ImMyFzMapper {
    /**
     * Count by example int.
     *
     * @param example the example
     * @return the int
     */
    int countByExample(ImMyFzExample example);

    /**
     * Delete by example int.
     *
     * @param example the example
     * @return the int
     */
    int deleteByExample(ImMyFzExample example);

    /**
     * Delete by primary key int.
     *
     * @param fzId the fz id
     * @return the int
     */
    int deleteByPrimaryKey(Long fzId);

    /**
     * Insert int.
     *
     * @param record the record
     * @return the int
     */
    int insert(ImMyFz record);

    /**
     * Insert selective int.
     *
     * @param record the record
     * @return the int
     */
    int insertSelective(ImMyFz record);

    /**
     * Select by example list.
     *
     * @param example the example
     * @return the list
     */
    List<ImMyFz> selectByExample(ImMyFzExample example);

    /**
     * Select by primary key im my fz.
     *
     * @param fzId the fz id
     * @return the im my fz
     */
    ImMyFz selectByPrimaryKey(Long fzId);

    /**
     * Update by example selective int.
     *
     * @param record  the record
     * @param example the example
     * @return the int
     */
    int updateByExampleSelective(@Param("record") ImMyFz record, @Param("example") ImMyFzExample example);

    /**
     * Update by example int.
     *
     * @param record  the record
     * @param example the example
     * @return the int
     */
    int updateByExample(@Param("record") ImMyFz record, @Param("example") ImMyFzExample example);

    /**
     * Update by primary key selective int.
     *
     * @param record the record
     * @return the int
     */
    int updateByPrimaryKeySelective(ImMyFz record);

    /**
     * Update by primary key int.
     *
     * @param record the record
     * @return the int
     */
    int updateByPrimaryKey(ImMyFz record);
}