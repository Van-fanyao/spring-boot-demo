package com.demo.service.impl;


//import com.demo.service.BaseService;
//import com.github.pagehelper.PageHelper;
//import org.springframework.beans.factory.annotation.Autowired;
//
//
//import org.springframework.stereotype.Service;
//import tk.mybatis.mapper.common.BaseMapper;
//import tk.mybatis.mapper.entity.Example;
//
//import java.lang.reflect.ParameterizedType;
//import java.util.List;
//
///**
// * @Auther: fanyao
// * @Date: 2019/3/21 14:20
// * @Description:
// */
//@Service
//public class BaseServiceImpl<T> implements BaseService {
//
//
//    @Autowired
//    protected BaseMapper baseMapper;
//
//    private Class<?> clazz = null;
//
//    protected Class<?> getEntityClass() {
//        if (clazz == null) {
//            clazz = (Class<?>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
//        }
//        return clazz;
//    }
//    @Override
//    public List<Object> getAll() {
//        return baseMapper.selectAll();
//    }
//
//    @Override
//    public int insert(Object entity) {
//        return baseMapper.insert(entity);
//    }
//
//    @Override
//    public int insertSelective(Object entity) {
//        return baseMapper.insertSelective(entity);
//    }
//
//    @Override
//    public int updateByPrimaryKey(Object entity) {
//        return baseMapper.updateByPrimaryKey(entity);
//    }
//
//    @Override
//    public int updateByPrimaryKeySelective(Object entity) {
//        return baseMapper.updateByPrimaryKeySelective(entity);
//    }
//
//
//    @Override
//    public int deleteByPrimaryKey(Object primaryKey) {
//        return baseMapper.deleteByPrimaryKey(primaryKey);
//    }
//
//
//
//
//    @Override
//    public Object selectOne(Object entity) {
//        return null;
//    }
//
//
//    @Override
//    public Object selectByPrimaryKey(Object primaryKey) {
//        return baseMapper.selectByPrimaryKey(primaryKey);
//    }
//
//    @Override
//    public List<Object> selectPage(int pageNum, int pageSize) {
//        PageHelper.startPage(pageNum, pageSize);
//        return baseMapper.selectAll();
//    }
//
//
//
//
//
//
//}
