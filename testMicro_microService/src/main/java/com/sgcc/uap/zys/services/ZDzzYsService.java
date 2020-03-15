package com.sgcc.uap.zys.services;

import com.sgcc.uap.rest.utils.CrudUtils;
import com.sgcc.uap.rest.support.QueryResultObject;
import org.springframework.beans.factory.annotation.Autowired;
import com.sgcc.uap.rest.support.QueryFilter;
import javax.persistence.criteria.Predicate;
import com.sgcc.uap.rest.utils.RestUtils;
import com.sgcc.uap.zys.repositories.ZDzzYsRepository;
import org.springframework.data.domain.Page;
import java.util.Map;
import com.sgcc.uap.zys.domain.ZDzzYs;
import com.sgcc.uap.rest.support.RequestCondition;
import org.springframework.data.jpa.domain.Specification;
import com.sgcc.uap.rest.support.IDRequestObject;
import javax.persistence.criteria.Root;
import org.springframework.data.domain.PageRequest;
import java.util.List;
import java.util.ArrayList;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import org.springframework.stereotype.Service;
import javax.persistence.criteria.Path;

import com.sgcc.uap.utils.string.StringUtil;
/**
 * <b>概述</b>：<br>
 * TODO
 * <p>
 * <b>功能</b>：<br>
 * TODO
 *
 * @author Administrator
 * @date 2018-04-13 11:23:53
 * @since 1.0
 */
@Service
public class ZDzzYsService implements IZDzzYsService{
	@Autowired
	private ZDzzYsRepository zDzzYsRepository;
	
	
	@Override
	public QueryResultObject getZDzzYsById(String id) {
		ZDzzYs zDzzYs = zDzzYsRepository.findOne(id);
		return RestUtils.wrappQueryResult(zDzzYs);
	}
	@Override
	public void remove(IDRequestObject idObject) {
		String[] ids = idObject.getIds();
		for (String id : ids){
			zDzzYsRepository.delete(id);
		}
	}
	@Override
	public ZDzzYs saveZDzzYs(Map map) throws Exception{
		ZDzzYs zDzzYs = new ZDzzYs();
		if (map.containsKey("id")) {
			String id = (String) map.get("id");
			zDzzYs = zDzzYsRepository.findOne(id);
			CrudUtils.mapToObject(map, zDzzYs,  "id");
		}else{
			CrudUtils.transMap2Bean(map, zDzzYs);
		}
		return zDzzYsRepository.save(zDzzYs);
	}
	/** 
	 * 根据查询条件 查询
	 * @param queryCondition
	 * @return
	 */
	@Override
	public QueryResultObject query(RequestCondition queryCondition) {
		Object o = queryCondition.getFilter();
		if(o != null && o instanceof List){
			List<Map<String, Object>> filter = (List<Map<String, Object>>)o;
			if(!filter.isEmpty()){
				for (Map<String, Object> map : filter) {
					List<Map<String, Object>> filter1 = (List<Map<String, Object>>) map.get("criterions");
					if(filter1 != null && !filter1.isEmpty()){
						return querySingle(queryCondition);
					}
				}
			}
		} 
		return queryCommon(queryCondition);
	}
	/**
	 * 字符串类型模糊查询示例：
	 * Predicate predicate = cb.like(root.get("employeeName"), "%" + 三 + "%");  查询名字中含有“三”的员工
	 * 
	 * 数字类型or时间类型示例:
	 * Predicate predicate = cb.equal(root.get("age"), 26); 查询年龄为26的员工
	 * Predicate predicate = cb.ge(root.get("age"), 26);	 查询年龄大于26的员工  同理大于等于为gt
     * Predicate predicate = cb.le(root.get("age"), 26);	 查询年龄小于26的员工  同理小于等于为lt
     * Predicate predicate = cb.between(root.get("age"), 26, 30);查询年龄在26与30之间的员工
	 * 若查询条件为时间类型，需用DateTimeConverter类的toDate方法将条件转换为对应的日期类型，然后进行查询
	 * 例如：Date date = (Date) DateTimeConverter.toDate(Date.class, queryFilter.getValue()); Predicate predicate = cb.equal(namePath, date);
	 * 主从表单页查询方法
	 * @param queryCondition
	 * @return
	 */
	private QueryResultObject querySingle(RequestCondition queryCondition) {
		List<QueryFilter> qList = getFilterList(queryCondition);
		Specification<ZDzzYs> specification = new Specification<ZDzzYs>() {
			@Override
			public Predicate toPredicate(Root<ZDzzYs> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				List<Predicate> preList = new ArrayList<Predicate>();
				if(qList != null && !qList.isEmpty()){
					for(QueryFilter queryFilter : qList){
					Path<String> namePath = root.get(queryFilter.getFieldName());
					Predicate predicate = cb.equal(namePath, queryFilter.getValue());
					preList.add(predicate);
					}
					query.where(preList.toArray(new Predicate[preList.size()]));
				}
				preList.clear();
				return null;
			}
		};
		PageRequest request = this.buildPageRequest(queryCondition);
		Page<ZDzzYs> zDzzYs = zDzzYsRepository.findAll(specification,request);
		List<ZDzzYs> result = new ArrayList<ZDzzYs>();
		long count = 0;
		if(null != qList && !qList.isEmpty()){
			result = zDzzYs.getContent();
			count = zDzzYs.getTotalElements();
		}
		return RestUtils.wrappQueryResult(result, count);
	}
	/**
	 * 字符串类型模糊查询示例：
	 * Predicate predicate = cb.like(root.get("employeeName"), "%" + 三 + "%");  查询名字中含有“三”的员工
	 * 
	 * 数字类型or时间类型示例:
	 * Predicate predicate = cb.equal(root.get("age"), 26); 查询年龄为26的员工
	 * Predicate predicate = cb.ge(root.get("age"), 26);	 查询年龄大于26的员工  同理大于等于为gt
     * Predicate predicate = cb.le(root.get("age"), 26);	 查询年龄小于26的员工  同理小于等于为lt
     * Predicate predicate = cb.between(root.get("age"), 26, 30);查询年龄在26与30之间的员工
	 * 若查询条件为时间类型，需用DateTimeConverter类的toDate方法将条件转换为对应的日期类型，然后进行查询
	 * 例如：Date date = (Date) DateTimeConverter.toDate(Date.class, queryFilter.getValue()); Predicate predicate = cb.equal(namePath, date); 
	 * 查询方法
	 * @param queryCondition
	 * @param qList
	 * @return
	 */
	private QueryResultObject queryCommon(RequestCondition queryCondition) {
		List<QueryFilter> qList = queryCondition.getQueryFilter(); 
		Specification<ZDzzYs> specification = new Specification<ZDzzYs>() {
			@Override
			public Predicate toPredicate(Root<ZDzzYs> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				List<Predicate> preList = new ArrayList<Predicate>();
				if(qList != null && !qList.isEmpty()){
					for(QueryFilter queryFilter : qList){
						Path<String> namePath = root.get(queryFilter.getFieldName());
						Predicate predicate = cb.equal(namePath, queryFilter.getValue());
						preList.add(predicate);
					}
					query.where(preList.toArray(new Predicate[preList.size()]));
				}
				preList.clear();
				return null;
			}
		};
		PageRequest request = this.buildPageRequest(queryCondition);
		Page<ZDzzYs> zDzzYs = zDzzYsRepository.findAll(specification,request);
		List<ZDzzYs> result = new ArrayList<ZDzzYs>();
		long count = 0;
		result = zDzzYs.getContent();
		count = zDzzYs.getTotalElements();
		return RestUtils.wrappQueryResult(result, count);
	}
	
	/**
	 * 获取条件列表
	 * @param queryCondition
	 * @return
	 */
	private List<QueryFilter> getFilterList(RequestCondition queryCondition) {
		List<QueryFilter> qList = new ArrayList<QueryFilter>();
		List<Map<String, Object>> filter = (List<Map<String, Object>>) queryCondition.getFilter();
		if(filter != null && !filter.isEmpty()){
			for (Map<String, Object> map : filter) {
				QueryFilter queryFilter = new QueryFilter();
				 List<Map<String, Object>> filter1 = (List<Map<String, Object>>) map.get("criterions");
				 Map<String, Object> map2 = filter1.get(0);
				 queryFilter.setFieldName(map2.get("fieldName").toString());
				 queryFilter.setValue(map2.get("value"));
				 qList.add(queryFilter);
			}
		}
		return qList;
	}
	/**
	 * 构建PageRequest
	 * @param queryCondition
	 * @return 页面请求对象
	 */
	private PageRequest buildPageRequest(RequestCondition queryCondition) {
		int pageIndex = 1, pageSize = 1;
		if (queryCondition.getPageIndex() != null && queryCondition.getPageSize() != null) {
			pageIndex = queryCondition.getPageIndex();
			pageSize = queryCondition.getPageSize();
		}
		return new PageRequest(pageIndex - 1, pageSize, null);
	}


}
