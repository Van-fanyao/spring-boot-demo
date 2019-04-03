package com.demo.service;

import com.github.pagehelper.PageInfo;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

public interface BaseService<T, ID>     {
    List<T> getAll();

    int insert(T entity);

    /**
     * 添加非空值，null不会被保存，使用数据库默认值
     *
     * @param entity
     * @return
     */
    int insertSelective(T entity);

    int updateByPrimaryKey(T entity);

    int updateByPrimaryKeySelective(T entity);

    int deleteByPrimaryKey(T primaryKey);

   // int deleteByPrimaryKeys(List<Object> primarykeys);


    /**
     * 根据实体中的属性进行查询，只能有一个返回值，有多个结果是抛出异常，查询条件使用等号
     *
     * @param entity
     * @return
     */
    T selectOne(T entity);

    T selectByPrimaryKey(Object primaryKey);

    /**
     * 单表分页查询
     * <p>
     * <pre>
     * selectPage(0,0) return all
     * </pre>
     *
     * @param pageNum
     * @param pageSize
     * @return
     */
    List<T> selectPage(int pageNum, int pageSize);






}
