package ltd.newbee.mall.newbeemall.dao;

import java.util.List;
import java.util.Map;

import ltd.newbee.mall.newbeemall.entity.GoodsReview;

public interface GoodsReviewMapper {
	List<GoodsReview>findGoodsReviewByGoodsId(int rating,long start,long number,long goodsId);
	
	List<GoodsReview> checkGoodsReview(long goodsId, long userId);
	
	int insertGoodsReview(Map<String,Object> review);
	
	long findMaxReviewId();
	
	List<GoodsReview> countReviewsAndAverageRating(long goodsId);
	
	int countReviewsByRating(long goodsId, int rating);
}