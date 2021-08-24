package com.olg;

public class ArcBox {
	private int fromIndex;// ��βλ������
	private int toIndex;// ��ͷλ������
	private ArcBox fromLink;// ��ͷ��ͬ������
	private ArcBox toLink;// ��β��ͬ������
	private ArcInfo arcInfo;//// ������Ϣ

	public ArcBox() {
		super();
	}

	public ArcBox(int fromIndex, int toIndex, ArcBox fromLink, ArcBox toLink, ArcInfo arcInfo) {
		super();
		this.fromIndex = fromIndex;
		this.toIndex = toIndex;
		this.fromLink = fromLink;
		this.toLink = toLink;
		this.arcInfo = arcInfo;
	}

	public int getFromIndex() {
		return fromIndex;
	}

	public void setFromIndex(int fromIndex) {
		this.fromIndex = fromIndex;
	}

	public int getToIndex() {
		return toIndex;
	}

	public void setToIndex(int toIndex) {
		this.toIndex = toIndex;
	}

	public ArcBox getFromLink() {
		return fromLink;
	}

	public void setFromLink(ArcBox fromLink) {
		this.fromLink = fromLink;
	}

	public ArcBox getToLink() {
		return toLink;
	}

	public void setToLink(ArcBox toLink) {
		this.toLink = toLink;
	}

	public ArcInfo getArcInfo() {
		return arcInfo;
	}

	public void setArcInfo(ArcInfo arcInfo) {
		this.arcInfo = arcInfo;
	}

}
