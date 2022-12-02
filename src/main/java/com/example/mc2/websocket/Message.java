package com.example.mc2.websocket;

import java.util.Date;

public class Message {
	private Long id;
	private Long sessionId;
	private Date mc1Timestamp;
	private Date mc2Timestamp;
	private Date mc3Timestamp;
	private Date endTimestamp;

	public Message(Long id, Long sessionId, Date mc1Timestamp, Date mc2Timestamp, Date mc3Timestamp, Date endTimestamp) {
		this.id = id;
		this.sessionId = sessionId;
		this.mc1Timestamp = mc1Timestamp;
		this.mc2Timestamp = mc2Timestamp;
		this.mc3Timestamp = mc3Timestamp;
		this.endTimestamp = endTimestamp;
	}

	public Message() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getSessionId() {
		return sessionId;
	}

	public void setSessionId(Long sessionId) {
		this.sessionId = sessionId;
	}

	public Date getMc1Timestamp() {
		return mc1Timestamp;
	}

	public void setMc1Timestamp(Date mc1Timestamp) {
		this.mc1Timestamp = mc1Timestamp;
	}

	public Date getMc2Timestamp() {
		return mc2Timestamp;
	}

	public void setMc2Timestamp(Date mc2Timestamp) {
		this.mc2Timestamp = mc2Timestamp;
	}

	public Date getMc3Timestamp() {
		return mc3Timestamp;
	}

	public void setMc3Timestamp(Date mc3Timestamp) {
		this.mc3Timestamp = mc3Timestamp;
	}

	public Date getEndTimestamp() {
		return endTimestamp;
	}

	public void setEndTimestamp(Date endTimestamp) {
		this.endTimestamp = endTimestamp;
	}

	@Override
	public String toString() {
		return "McMessage{" + "id=" + id + ", sessionId=" + sessionId + ", mc1Timestamp=" + mc1Timestamp + ", mc2Timestamp=" + mc2Timestamp + ", mc3Timestamp=" + mc3Timestamp + ", endTimestamp=" + endTimestamp + '}';
	}
}
