package com.xbjs.webim.mapper;

import com.xbjs.webim.pojo.ImMyFriend;
import com.xbjs.webim.pojo.ImMyFriendExample;
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
public interface ImMyFriendMapper {
    /**
     * Count by example int.
     *
     * @param example the example
     * @return the int
     */
    int countByExample(ImMyFriendExample example);

    /**
     * Delete by example int.
     *
     * @param example the example
     * @return the int
     */
    int deleteByExample(ImMyFriendExample example);

    /**
     * Delete by primary key int.
     *
     * @param myFriendId the my friend id
     * @return the int
     */
    int deleteByPrimaryKey(Long myFriendId);

    /**
     * Insert int.
     *
     * @param record the record
     * @return the int
     */
    int insert(ImMyFriend record);

    /**
     * Insert selective int.
     *
     * @param record the record
     * @return the int
     */
    int insertSelective(ImMyFriend record);

    /**
     * Select by example list.
     *
     * @param example the example
     * @return the list
     */
    List<ImMyFriend> selectByExample(ImMyFriendExample example);

    /**
     * Select by primary key im my friend.
     *
     * @param myFriendId the my friend id
     * @return the im my friend
     */
    ImMyFriend selectByPrimaryKey(Long myFriendId);

    /**
     * Update by example selective int.
     *
     * @param record  the record
     * @param example the example
     * @return the int
     */
    int updateByExampleSelective(@Param("record") ImMyFriend record, @Param("example") ImMyFriendExample example);

    /**
     * Update by example int.
     *
     * @param record  the record
     * @param example the example
     * @return the int
     */
    int updateByExample(@Param("record") ImMyFriend record, @Param("example") ImMyFriendExample example);

    /**
     * Update by primary key selective int.
     *
     * @param record the record
     * @return the int
     */
    int updateByPrimaryKeySelective(ImMyFriend record);

    /**
     * Update by primary key int.
     *
     * @param record the record
     * @return the int
     */
    int updateByPrimaryKey(ImMyFriend record);
}