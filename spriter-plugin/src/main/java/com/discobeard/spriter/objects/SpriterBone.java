package com.discobeard.spriter.objects;

import java.util.List;

public class SpriterBone {
	
	private int id;
	private float x;
	private float y;
	private float angle;
	private float scaleX;
	private float scaleY;
	private List<Integer> childIds;
	private Integer parent = null;
	private int spin;
	
	public void addChildId(int childId){
		childIds.add(childId);
	}
	
	public List<Integer> getChildIds(){
		return childIds;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public float getX() {
		return x;
	}
	public void setX(float x) {
		this.x = x;
	}
	public float getY() {
		return y;
	}
	public void setY(float y) {
		this.y = y;
	}
	public float getAngle() {
		return angle;
	}
	public void setAngle(float angle) {
		this.angle = angle;
	}
	public float getScaleX() {
		return scaleX;
	}
	public void setScaleX(float scaleX) {
		this.scaleX = scaleX;
	}
	public float getScaleY() {
		return scaleY;
	}
	public void setScaleY(float scaleY) {
		this.scaleY = scaleY;
	}

	public int getSpin() {
		return spin;
	}

	public void setSpin(int spin) {
		this.spin = spin;
	}

	public Integer getParent() {
		return parent;
	}

	public void setParent(Integer parent) {
		this.parent = parent;
	}
	
	
}
