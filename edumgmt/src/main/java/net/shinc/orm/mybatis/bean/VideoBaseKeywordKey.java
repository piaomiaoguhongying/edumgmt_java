package net.shinc.orm.mybatis.bean;

/** 
 * @ClassName VideoBaseKeywordKey 
 * @Description 视频中的关键字
 * @author wangzhiying 
 * @date 2015年7月31日 下午7:55:11  
 */
public class VideoBaseKeywordKey {
    private Integer videoBaseId;

    private Integer keywordId;

	public Integer getVideoBaseId() {
		return videoBaseId;
	}

	public void setVideoBaseId(Integer videoBaseId) {
		this.videoBaseId = videoBaseId;
	}

	public Integer getKeywordId() {
		return keywordId;
	}

	public void setKeywordId(Integer keywordId) {
		this.keywordId = keywordId;
	}

}