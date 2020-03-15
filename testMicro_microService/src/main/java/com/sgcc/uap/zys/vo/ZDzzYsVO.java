package com.sgcc.uap.zys.vo;

import java.io.Serializable;


import com.sgcc.uap.rest.annotation.attribute.AttributeType;
import com.sgcc.uap.rest.annotation.attribute.EditorType;
import com.sgcc.uap.rest.annotation.attribute.ViewAttribute;
import com.sgcc.uap.rest.support.ParentVO;
/**
 * ZDzzYs的VO类
 *
 * @author Administrator 
 * @date 2018-04-13 11:23:53
 */
public class ZDzzYsVO extends ParentVO implements Serializable{

	private static final long serialVersionUID = 1L;
	
    /** 
     * 属性id
     */  
    @ViewAttribute(name ="id",caption="id", editor=EditorType.TextEditor,nullable =false,readOnly=false, type=AttributeType.STRING)
    private String id;    
    /** 
     * 属性jzkm
     */  
    @ViewAttribute(name ="jzkm",caption="jzkm", editor=EditorType.TextEditor,nullable =true,readOnly=false, type=AttributeType.STRING)
    private String jzkm;    
    /** 
     * 属性tbzzbs
     */  
    @ViewAttribute(name ="tbzzbs",caption="tbzzbs", editor=EditorType.TextEditor,nullable =true,readOnly=false, type=AttributeType.STRING)
    private String tbzzbs;    
    /** 
     * 属性bxtykm
     */  
    @ViewAttribute(name ="bxtykm",caption="bxtykm", editor=EditorType.TextEditor,nullable =true,readOnly=false, type=AttributeType.STRING)
    private String bxtykm;    
    /** 
     * 属性gys
     */  
    @ViewAttribute(name ="gys",caption="gys", editor=EditorType.TextEditor,nullable =true,readOnly=false, type=AttributeType.STRING)
    private String gys;    
    /** 
     * 属性sl
     */  
    @ViewAttribute(name ="sl",caption="sl", editor=EditorType.TextEditor,nullable =true,readOnly=false, type=AttributeType.STRING)
    private String sl;    
    /** 
     * 属性sx
     */  
    @ViewAttribute(name ="sx",caption="sx", editor=EditorType.TextEditor,nullable =true,readOnly=false, type=AttributeType.STRING)
    private String sx;    
    /** 
     * 属性cbzx
     */  
    @ViewAttribute(name ="cbzx",caption="cbzx", editor=EditorType.TextEditor,nullable =true,readOnly=false, type=AttributeType.STRING)
    private String cbzx;    
    /** 
     * 属性nbdd
     */  
    @ViewAttribute(name ="nbdd",caption="nbdd", editor=EditorType.TextEditor,nullable =true,readOnly=false, type=AttributeType.STRING)
    private String nbdd;    
    /** 
     * 属性lrzx
     */  
    @ViewAttribute(name ="lrzx",caption="lrzx", editor=EditorType.TextEditor,nullable =true,readOnly=false, type=AttributeType.STRING)
    private String lrzx;    
    /** 
     * 属性wbs
     */  
    @ViewAttribute(name ="wbs",caption="wbs", editor=EditorType.TextEditor,nullable =true,readOnly=false, type=AttributeType.STRING)
    private String wbs;    
    /** 
     * 属性yydm
     */  
    @ViewAttribute(name ="yydm",caption="yydm", editor=EditorType.TextEditor,nullable =true,readOnly=false, type=AttributeType.STRING)
    private String yydm;    
    /** 
     * 属性wb
     */  
    @ViewAttribute(name ="wb",caption="wb", editor=EditorType.TextEditor,nullable =true,readOnly=false, type=AttributeType.STRING)
    private String wb;    
    /** 
     * 属性xjysx
     */  
    @ViewAttribute(name ="xjysx",caption="xjysx", editor=EditorType.TextEditor,nullable =true,readOnly=false, type=AttributeType.STRING)
    private String xjysx;    
    /**
     * ZDzzYsVO构造函数
     */
    public ZDzzYsVO() {
        super();
    } 
   
	 /**
     * ZDzzYsVO完整的构造函数
     */  
    public ZDzzYsVO(String id){
        this.id = id;
    }
    /**
     * id的get方法
     * @return id
     */
    public String getId(){
        return id;
    }
    /**
     * id的set方法
     * @param id
     */
    public void setId(String id){
        if(id != null && id.trim().length() == 0){
        	this.id = null;
        }else{
        	this.id = id;
        }
	} 
    /**
     * jzkm的get方法
     * @return jzkm
     */
    public String getJzkm(){
        return jzkm;
    }
    /**
     * jzkm的set方法
     * @param jzkm
     */
    public void setJzkm(String jzkm){
		this.jzkm = jzkm;
	} 
    /**
     * tbzzbs的get方法
     * @return tbzzbs
     */
    public String getTbzzbs(){
        return tbzzbs;
    }
    /**
     * tbzzbs的set方法
     * @param tbzzbs
     */
    public void setTbzzbs(String tbzzbs){
		this.tbzzbs = tbzzbs;
	} 
    /**
     * bxtykm的get方法
     * @return bxtykm
     */
    public String getBxtykm(){
        return bxtykm;
    }
    /**
     * bxtykm的set方法
     * @param bxtykm
     */
    public void setBxtykm(String bxtykm){
		this.bxtykm = bxtykm;
	} 
    /**
     * gys的get方法
     * @return gys
     */
    public String getGys(){
        return gys;
    }
    /**
     * gys的set方法
     * @param gys
     */
    public void setGys(String gys){
		this.gys = gys;
	} 
    /**
     * sl的get方法
     * @return sl
     */
    public String getSl(){
        return sl;
    }
    /**
     * sl的set方法
     * @param sl
     */
    public void setSl(String sl){
		this.sl = sl;
	} 
    /**
     * sx的get方法
     * @return sx
     */
    public String getSx(){
        return sx;
    }
    /**
     * sx的set方法
     * @param sx
     */
    public void setSx(String sx){
		this.sx = sx;
	} 
    /**
     * cbzx的get方法
     * @return cbzx
     */
    public String getCbzx(){
        return cbzx;
    }
    /**
     * cbzx的set方法
     * @param cbzx
     */
    public void setCbzx(String cbzx){
		this.cbzx = cbzx;
	} 
    /**
     * nbdd的get方法
     * @return nbdd
     */
    public String getNbdd(){
        return nbdd;
    }
    /**
     * nbdd的set方法
     * @param nbdd
     */
    public void setNbdd(String nbdd){
		this.nbdd = nbdd;
	} 
    /**
     * lrzx的get方法
     * @return lrzx
     */
    public String getLrzx(){
        return lrzx;
    }
    /**
     * lrzx的set方法
     * @param lrzx
     */
    public void setLrzx(String lrzx){
		this.lrzx = lrzx;
	} 
    /**
     * wbs的get方法
     * @return wbs
     */
    public String getWbs(){
        return wbs;
    }
    /**
     * wbs的set方法
     * @param wbs
     */
    public void setWbs(String wbs){
		this.wbs = wbs;
	} 
    /**
     * yydm的get方法
     * @return yydm
     */
    public String getYydm(){
        return yydm;
    }
    /**
     * yydm的set方法
     * @param yydm
     */
    public void setYydm(String yydm){
		this.yydm = yydm;
	} 
    /**
     * wb的get方法
     * @return wb
     */
    public String getWb(){
        return wb;
    }
    /**
     * wb的set方法
     * @param wb
     */
    public void setWb(String wb){
		this.wb = wb;
	} 
    /**
     * xjysx的get方法
     * @return xjysx
     */
    public String getXjysx(){
        return xjysx;
    }
    /**
     * xjysx的set方法
     * @param xjysx
     */
    public void setXjysx(String xjysx){
		this.xjysx = xjysx;
	} 

    /**
     * toString方法
     * @return String
     */
	public String toString(){

		  return new StringBuffer()
	  			.append("ID"+":"+getId())
				.append("JZKM"+":"+getJzkm())
				.append("TBZZBS"+":"+getTbzzbs())
				.append("BXTYKM"+":"+getBxtykm())
				.append("GYS"+":"+getGys())
				.append("SL"+":"+getSl())
				.append("SX"+":"+getSx())
				.append("CBZX"+":"+getCbzx())
				.append("NBDD"+":"+getNbdd())
				.append("LRZX"+":"+getLrzx())
				.append("WBS"+":"+getWbs())
				.append("YYDM"+":"+getYydm())
				.append("WB"+":"+getWb())
				.append("XJYSX"+":"+getXjysx())
		        .toString(); 
			
    } 
   


}
