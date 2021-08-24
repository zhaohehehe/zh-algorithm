package com.olg;

public class VexNode {
	private ArcBox firstIn;// ����ڵ�ĵ�һ���뻡
	private ArcBox firstOut;// ����ڵ�ĵ�һ������
	private NodeInfo nodeInfo;// ������Ϣ

	public VexNode(ArcBox firstIn, ArcBox firstOut, NodeInfo nodeInfo) {
		super();
		this.firstIn = firstIn;
		this.firstOut = firstOut;
		this.nodeInfo = nodeInfo;
	}

	public ArcBox getFirstIn() {
		return firstIn;
	}

	public void setFirstIn(ArcBox firstIn) {
		this.firstIn = firstIn;
	}

	public ArcBox getFirstOut() {
		return firstOut;
	}

	public void setFirstOut(ArcBox firstOut) {
		this.firstOut = firstOut;
	}

	public NodeInfo getNodeInfo() {
		return nodeInfo;
	}

	public void setNodeInfo(NodeInfo nodeInfo) {
		this.nodeInfo = nodeInfo;
	}

}
