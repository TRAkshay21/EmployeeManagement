package com.employee.model;

public class Video {
	private int videoId;
	private String videoUrl;
	private String title;
	private int durationInSeconds;
	private int durationInMinutes;
	
	public Video() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Video(int videoId, String videoUrl, String title, int durationInSeconds, int durationInMinutes) {
		super();
		this.videoId = videoId;
		this.videoUrl = videoUrl;
		this.title = title;
		this.durationInSeconds = durationInSeconds;
		this.durationInMinutes = durationInMinutes;
	}

	public int getVideoId() {
		return videoId;
	}

	public void setVideoId(int videoId) {
		this.videoId = videoId;
	}

	public String getVideoUrl() {
		return videoUrl;
	}

	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getDurationInSeconds() {
		return durationInSeconds;
	}

	public void setDurationInSeconds(int durationInSeconds) {
		this.durationInSeconds = durationInSeconds;
	}

	public int getDurationInMinutes() {
		return durationInMinutes;
	}

	public void setDurationInMinutes(int durationInMinutes) {
		this.durationInMinutes = durationInMinutes;
	}

	@Override
	public String toString() {
		return "Video [videoId=" + videoId + ", videoUrl=" + videoUrl + ", title=" + title + ", durationInSeconds="
				+ durationInSeconds + ", durationInMinutes=" + durationInMinutes + "]";
	}
}
