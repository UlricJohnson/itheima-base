package com.itheima.test1;

public class CountSubStr {
	private String content;// 子串内容
	private int times;// 出现次数
	private final int DEFAULT_APPEAR_TIMES = 1;// 默认出现次数为1

	public CountSubStr() {
		// TODO Auto-generated constructor stub
	}

	public CountSubStr(String content) {
		this.content = content;
		this.times = DEFAULT_APPEAR_TIMES;
	}

	// getters & setters
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getTimes() {
		return times;
	}

	public void setTimes(int times) {
		this.times = times;
	}

}
