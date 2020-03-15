package com.sgcc.uap.zys.domain;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import javax.persistence.Transient;

/**
 * ZDzzYs的POJO类
 *
 * @author Administrator 
 * @date 2018-04-13 11:23:53
 */
@Entity
@Table(name = "z_dzz_ys")
public class ZDzzYs implements Serializable {

    /** 
     * serialVersionUID
     */
	private static final long serialVersionUID = -7768637914227571159L;

    /** 
     * id
     */
	@Id
	@GeneratedValue(generator = "idGenerator")
	@GenericGenerator(name = "idGenerator", strategy = "uuid")
    @Column(name = "ID", nullable = false, length = 32)
    private String id ;
    
    /** 
     * jzkm
     */
    @Column(name = "JZKM", nullable = true, length = 100)
    private String jzkm ;
    
    /** 
     * tbzzbs
     */
    @Column(name = "TBZZBS", nullable = true, length = 100)
    private String tbzzbs ;
    
    /** 
     * bxtykm
     */
    @Column(name = "BXTYKM", nullable = true, length = 100)
    private String bxtykm ;
    
    /** 
     * gys
     */
    @Column(name = "GYS", nullable = true, length = 100)
    private String gys ;
    
    /** 
     * sl
     */
    @Column(name = "SL", nullable = true, length = 100)
    private String sl ;
    
    /** 
     * sx
     */
    @Column(name = "SX", nullable = true, length = 100)
    private String sx ;
    
    /** 
     * cbzx
     */
    @Column(name = "CBZX", nullable = true, length = 100)
    private String cbzx ;
    
    /** 
     * nbdd
     */
    @Column(name = "NBDD", nullable = true, length = 100)
    private String nbdd ;
    
    /** 
     * lrzx
     */
    @Column(name = "LRZX", nullable = true, length = 100)
    private String lrzx ;
    
    /** 
     * wbs
     */
    @Column(name = "WBS", nullable = true, length = 100)
    private String wbs ;
    
    /** 
     * yydm
     */
    @Column(name = "YYDM", nullable = true, length = 100)
    private String yydm ;
    
    /** 
     * wb
     */
    @Column(name = "WB", nullable = true, length = 100)
    private String wb ;
    
    /** 
     * xjysx
     */
    @Column(name = "XJYSX", nullable = true, length = 100)
    private String xjysx ;
    
	/**虚拟主键*/
	@Transient
	private String mxVirtualId;
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
	public String getMxVirtualId() {
        return this.mxVirtualId;
    }
    
    public void setMxVirtualId(String mxVirtualId) {
        this.mxVirtualId = mxVirtualId;
    } 
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object obj) {
        if (this == obj)
			return true;
		
        if (obj == null || !(obj instanceof ZDzzYs))
	        return false; 
	        
		if (getClass() != obj.getClass())
			return false;
		
		ZDzzYs other = (ZDzzYs) obj;
		
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		if (jzkm == null) {
			if (other.jzkm != null) {
				return false;
			}
		} else if (!jzkm.equals(other.jzkm)) {
			return false;
		}
		if (tbzzbs == null) {
			if (other.tbzzbs != null) {
				return false;
			}
		} else if (!tbzzbs.equals(other.tbzzbs)) {
			return false;
		}
		if (bxtykm == null) {
			if (other.bxtykm != null) {
				return false;
			}
		} else if (!bxtykm.equals(other.bxtykm)) {
			return false;
		}
		if (gys == null) {
			if (other.gys != null) {
				return false;
			}
		} else if (!gys.equals(other.gys)) {
			return false;
		}
		if (sl == null) {
			if (other.sl != null) {
				return false;
			}
		} else if (!sl.equals(other.sl)) {
			return false;
		}
		if (sx == null) {
			if (other.sx != null) {
				return false;
			}
		} else if (!sx.equals(other.sx)) {
			return false;
		}
		if (cbzx == null) {
			if (other.cbzx != null) {
				return false;
			}
		} else if (!cbzx.equals(other.cbzx)) {
			return false;
		}
		if (nbdd == null) {
			if (other.nbdd != null) {
				return false;
			}
		} else if (!nbdd.equals(other.nbdd)) {
			return false;
		}
		if (lrzx == null) {
			if (other.lrzx != null) {
				return false;
			}
		} else if (!lrzx.equals(other.lrzx)) {
			return false;
		}
		if (wbs == null) {
			if (other.wbs != null) {
				return false;
			}
		} else if (!wbs.equals(other.wbs)) {
			return false;
		}
		if (yydm == null) {
			if (other.yydm != null) {
				return false;
			}
		} else if (!yydm.equals(other.yydm)) {
			return false;
		}
		if (wb == null) {
			if (other.wb != null) {
				return false;
			}
		} else if (!wb.equals(other.wb)) {
			return false;
		}
		if (xjysx == null) {
			if (other.xjysx != null) {
				return false;
			}
		} else if (!xjysx.equals(other.xjysx)) {
			return false;
		}
		return true;
	}
    
    /**
     * toString方法
     * @return String
     */
	public String toString(){
		return "ZDzzYs ["
			+ ", id=" + id
			+ ", jzkm=" + jzkm
			+ ", tbzzbs=" + tbzzbs
			+ ", bxtykm=" + bxtykm
			+ ", gys=" + gys
			+ ", sl=" + sl
			+ ", sx=" + sx
			+ ", cbzx=" + cbzx
			+ ", nbdd=" + nbdd
			+ ", lrzx=" + lrzx
			+ ", wbs=" + wbs
			+ ", yydm=" + yydm
			+ ", wb=" + wb
			+ ", xjysx=" + xjysx;
	}
   
    
    /**
     * hashcode方法
     * @return int
     * 
     */
    @Override
    public int hashCode(){
		return super.hashCode();
	}
}