package com.yilami.base.impl;
import java.lang.reflect.ParameterizedType;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.yilami.util.PageView;


/**
 * 集合持久层的公用的增，删，改，查类 <T> 表示传入实体类
 * 
 * @author yilami 
 * @Email: qunlin1108@163.com
 * @Date:  2015-04-11
 * @version 0.1v
 * @param <T>
 */
public class BaseDaoImpl<T> extends SqlSessionDaoSupport {
	/**
	 * 
	 * 获取传过来的泛型类名字
	 * 
	 * @return
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public String getClassName() {
		// 在父类中得到子类声明的父类的泛型信息
		ParameterizedType pt = (ParameterizedType) this.getClass()
				.getGenericSuperclass();
		Class<T> clazz = (Class) pt.getActualTypeArguments()[0];
		// clazz.getSimpleName().toString().toLowerCase();
		// 这里是获取实体类的简单名称，再把类名转为小写
		return clazz.getSimpleName().toString().toLowerCase();
	}

	public void add(T t) {
		getSqlSession().insert(this.getClassName() + ".add", t);
	}

	public void delete(String id) {
		getSqlSession().delete(this.getClassName() + ".deleteById", id);
	}

	@SuppressWarnings("unchecked")
	public T getById(String id) {
		return (T) getSqlSession().selectOne(this.getClassName() + ".getById",
				id);
	}

	public void modify(T t) {
		getSqlSession().update(this.getClassName() + ".update", t);
	}

	public List<T> query(PageView pageView, T t) {
		Map<Object, Object> map = new HashMap<Object, Object>();
		map.put("paging", pageView);
		map.put("t", t);
		return getSqlSession().selectList(this.getClassName() + ".query", map);
	}

	public List<T> queryAll(T t) {
		return getSqlSession().selectList(this.getClassName() + ".queryAll", t);
	}
}
