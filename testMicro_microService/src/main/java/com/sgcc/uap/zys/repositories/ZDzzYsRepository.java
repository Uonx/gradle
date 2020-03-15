package com.sgcc.uap.zys.repositories;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.JpaRepository;
import com.sgcc.uap.zys.domain.ZDzzYs;


/**
 * <b>概述</b>：<br>
 *	TODO
 * <p>
 * <b>功能</b>：<br>
 *	TODO
 *	
 * @author Administrator
 * @date 2018-04-13 11:23:53
 * @since 1.0
 */
public interface ZDzzYsRepository extends JpaRepository<ZDzzYs,String>,JpaSpecificationExecutor<ZDzzYs> {

	
}
