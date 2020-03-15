package com.sgcc.uap.zys.vo;

import com.sgcc.uap.zys.domain.ZDzzYs;


public class ZDzzYsTransfer {

	public static ZDzzYs toPO(ZDzzYsVO vo) {
		ZDzzYs zDzzYs = new ZDzzYs();
		if(vo != null){
			zDzzYs.setId(vo.getId());
			zDzzYs.setJzkm(vo.getJzkm());
			zDzzYs.setTbzzbs(vo.getTbzzbs());
			zDzzYs.setBxtykm(vo.getBxtykm());
			zDzzYs.setGys(vo.getGys());
			zDzzYs.setSl(vo.getSl());
			zDzzYs.setSx(vo.getSx());
			zDzzYs.setCbzx(vo.getCbzx());
			zDzzYs.setNbdd(vo.getNbdd());
			zDzzYs.setLrzx(vo.getLrzx());
			zDzzYs.setWbs(vo.getWbs());
			zDzzYs.setYydm(vo.getYydm());
			zDzzYs.setWb(vo.getWb());
			zDzzYs.setXjysx(vo.getXjysx());
        }
		return zDzzYs;
	}

	public static ZDzzYsVO toVO(ZDzzYs po) {
		ZDzzYsVO vo = new ZDzzYsVO();
		vo.setId(po.getId());
		vo.setJzkm(po.getJzkm());
		vo.setTbzzbs(po.getTbzzbs());
		vo.setBxtykm(po.getBxtykm());
		vo.setGys(po.getGys());
		vo.setSl(po.getSl());
		vo.setSx(po.getSx());
		vo.setCbzx(po.getCbzx());
		vo.setNbdd(po.getNbdd());
		vo.setLrzx(po.getLrzx());
		vo.setWbs(po.getWbs());
		vo.setYydm(po.getYydm());
		vo.setWb(po.getWb());
		vo.setXjysx(po.getXjysx());
		return vo;
	}
}
