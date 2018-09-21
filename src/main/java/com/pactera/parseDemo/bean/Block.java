package com.pactera.parseDemo.bean;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * 
 ************类说明**************
 * 类名：Block
 * 建类时间：2018年9月21日 下午2:21:13
 * 类描述：解析得sql块
 */
public class Block {

	private String condition; 
	private Set<String> colSet = new LinkedHashSet<String>();
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	public Set<String> getColSet() {
		return colSet;
	}
	public void setColSet(Set<String> colSet) {
		this.colSet = colSet;
	}
}
