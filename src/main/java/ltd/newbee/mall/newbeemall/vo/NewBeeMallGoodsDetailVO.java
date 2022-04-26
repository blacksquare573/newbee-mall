	/**
	 * 严肃声明：
	 * 开源版本请务必保留此注释头信息，若删除我方将保留所有法律责任追究！
	 * 本系统已申请软件著作权，受国家版权局知识产权以及国家计算机软件著作权保护！
	 * 可正常分享和学习源码，不得用于违法犯罪活动，违者必究！
	 * Copyright (c) 2019-2020 十三 all rights reserved.
	 * 版权所有，侵权必究！
	 */
	package ltd.newbee.mall.newbeemall.vo;

	import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

	/**
	 * 商品详情页VO
	 */
	public class NewBeeMallGoodsDetailVO implements Serializable {

	    private Long goodsId;

	    private String goodsName;

	    private String goodsIntro;

	    private String goodsCoverImg;

	    private String[] goodsCarouselList;

	    private Integer sellingPrice;

	    private Integer originalPrice;

	    private String goodsDetailContent;
	    
	    private Integer stockNum;
		
		private String tag;
		
		private Byte goodsSellStatus;
		
		private Integer createUser;
		
		@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
		private Date createTime;

		private Integer updateUser;

		@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
		private Date updateTime;

	    public Long getGoodsId() {
	        return goodsId;
	    }

	    public void setGoodsId(Long goodsId) {
	        this.goodsId = goodsId;
	    }

	    public String getGoodsName() {
	        return goodsName;
	    }

	    public void setGoodsName(String goodsName) {
	        this.goodsName = goodsName;
	    }

	    public String getGoodsIntro() {
	        return goodsIntro;
	    }

	    public void setGoodsIntro(String goodsIntro) {
	        this.goodsIntro = goodsIntro;
	    }

	    public String getGoodsCoverImg() {
	        return goodsCoverImg;
	    }

	    public void setGoodsCoverImg(String goodsCoverImg) {
	        this.goodsCoverImg = goodsCoverImg;
	    }

	    public Integer getSellingPrice() {
	        return sellingPrice;
	    }

	    public void setSellingPrice(Integer sellingPrice) {
	        this.sellingPrice = sellingPrice;
	    }

	    public Integer getOriginalPrice() {
	        return originalPrice;
	    }

	    public void setOriginalPrice(Integer originalPrice) {
	        this.originalPrice = originalPrice;
	    }

	    public String getGoodsDetailContent() {
	        return goodsDetailContent;
	    }

	    public void setGoodsDetailContent(String goodsDetailContent) {
	        this.goodsDetailContent = goodsDetailContent;
	    }

	    public String[] getGoodsCarouselList() {
	        return goodsCarouselList;
	    }

	    public void setGoodsCarouselList(String[] goodsCarouselList) {
	        this.goodsCarouselList = goodsCarouselList;
	    }

	    public Integer getStockNum() {
			return stockNum;
		}

		public void setStockNum(Integer stockNum) {
			this.stockNum = stockNum;
		}

		public String getTag() {
			return tag;
		}

		public void setTag(String tag) {
			this.tag = tag;
		}

		public Byte getGoodsSellStatus() {
			return goodsSellStatus;
		}

		public void setGoodsSellStatus(Byte goodsSellStatus) {
			this.goodsSellStatus = goodsSellStatus;
		}

		public Integer getCreateUser() {
			return createUser;
		}

		public void setCreateUser(Integer createUser) {
			this.createUser = createUser;
		}

		public Date getCreateTime() {
			return createTime;
		}

		public void setCreateTime(Date createTime) {
			this.createTime = createTime;
		}

		public Integer getUpdateUser() {
			return updateUser;
		}

		public void setUpdateUser(Integer updateUser) {
			this.updateUser = updateUser;
		}

		public Date getUpdateTime() {
			return updateTime;
		}

		public void setUpdateTime(Date updateTime) {
			this.updateTime = updateTime;
		}
}
