package cn.itechyou.blog.vo;

import cn.itechyou.blog.entity.Archives;

public class ArchivesVo extends Archives {
	private String categoryCnName;
	private String categoryEnName;

	public String getCategoryCnName() {
		return categoryCnName;
	}

	public void setCategoryCnName(String categoryCnName) {
		this.categoryCnName = categoryCnName;
	}

	public String getCategoryEnName() {
		return categoryEnName;
	}

	public void setCategoryEnName(String categoryEnName) {
		this.categoryEnName = categoryEnName;
	}

}
