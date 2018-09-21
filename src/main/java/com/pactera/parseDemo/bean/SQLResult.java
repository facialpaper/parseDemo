package com.pactera.parseDemo.bean;

import java.util.List;
import java.util.Set;

/**
 * 
 ************类说明**************
 * 类名：SQLResult
 * 建类时间：2018年9月20日 下午4:48:53
 * 类描述：sql解析的结果
 */
public class SQLResult {

	Set<String> outputTables;
	Set<String> inputTables;
	List<ColLine> colLineList;
	public Set<String> getOutputTables() {
		return outputTables;
	}
	public void setOutputTables(Set<String> outputTables) {
		this.outputTables = outputTables;
	}
	public Set<String> getInputTables() {
		return inputTables;
	}
	public void setInputTables(Set<String> inputTables) {
		this.inputTables = inputTables;
	}
	public List<ColLine> getColLineList() {
		return colLineList;
	}
	public void setColLineList(List<ColLine> colLineList) {
		this.colLineList = colLineList;
	}

}
