package com.ust.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Recommendation {
	
	@Id
	private ObjectId _id;
	private String userId;
	private String dataId;
	private Object data;
	
	public Recommendation() {
		super();
	}
	
	public Recommendation(ObjectId _id, String userId, String dataId, Object data) {
		super();
		this._id = _id;
		this.userId = userId;
		this.dataId = dataId;
		this.data = data;
	}
	
	public ObjectId get_id() {
		return _id;
	}
	public void set_id(ObjectId _id) {
		this._id = _id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getDataId() {
		return dataId;
	}
	public void setDataId(String dataId) {
		this.dataId = dataId;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	
	
	

}
