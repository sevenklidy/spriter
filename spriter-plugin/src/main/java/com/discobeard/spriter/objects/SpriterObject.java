package com.discobeard.spriter.objects;

public class SpriterObject {
	
	private int file;
	private int folder;
	private float x;
	private float y;
	private float pivotX;
	private float pivotY;
	private float scale_x;
	private float scale_y;
	private int zIndex;
	private float angle;
	private int spin;
	private float alpha;
	
	private Integer parent = null;
	
	public int getFile() {
		return file;
	}
	
	public void setFile(int file) {
		this.file = file;
	}
	public int getFolder() {
		return folder;
	}
	public void setFolder(int folder) {
		this.folder = folder;
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
	public float getPivotX() {
		return pivotX;
	}
	public void setPivotX(float pivotX) {
		this.pivotX = pivotX;
	}
	public float getPivotY() {
		return pivotY;
	}
	public void setPivotY(float pivotY) {
		this.pivotY = pivotY;
	}
	public int getzIndex() {
		return zIndex;
	}
	public void setzIndex(int zIndex) {
		this.zIndex = zIndex;
	}
	public float getAngle() {
		return angle;
	}
	public void setAngle(float angle) {
		this.angle = angle;
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

	public void setParent(Integer parentId) {
		this.parent = parentId;
	}

	public float getAlpha() {
		return alpha;
	}

	public void setAlpha(float alpha) {
		this.alpha = alpha;
	}

	public float getScale_x() {
		return scale_x;
	}

	public void setScale_x(float scale_x) {
		this.scale_x = scale_x;
	}

	public float getScale_y() {
		return scale_y;
	}

	public void setScale_y(float scale_y) {
		this.scale_y = scale_y;
	}	
	
}
