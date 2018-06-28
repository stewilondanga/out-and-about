
package io.github.stewilondanga.outandabout.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Event {

    @SerializedName("created")
    @Expose
    private Integer created;
    @SerializedName("duration")
    @Expose
    private Integer duration;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("rsvp_limit")
    @Expose
    private Integer rsvpLimit;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("time")
    @Expose
    private Integer time;
    @SerializedName("local_date")
    @Expose
    private String localDate;
    @SerializedName("local_time")
    @Expose
    private String localTime;
    @SerializedName("updated")
    @Expose
    private Integer updated;
    @SerializedName("utc_offset")
    @Expose
    private Integer utcOffset;
    @SerializedName("waitlist_count")
    @Expose
    private Integer waitlistCount;
    @SerializedName("yes_rsvp_count")
    @Expose
    private Integer yesRsvpCount;
    @SerializedName("venue")
    @Expose
    private Venue venue;
    @SerializedName("group")
    @Expose
    private Group group;
    @SerializedName("link")
    @Expose
    private String link;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("how_to_find_us")
    @Expose
    private String howToFindUs;
    @SerializedName("visibility")
    @Expose
    private String visibility;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Event() {
    }

    /**
     * 
     * @param visibility
     * @param status
     * @param link
     * @param localDate
     * @param venue
     * @param id
     * @param duration
     * @param time
     * @param howToFindUs
     * @param rsvpLimit
     * @param created
     * @param updated
     * @param description
     * @param name
     * @param utcOffset
     * @param yesRsvpCount
     * @param localTime
     * @param waitlistCount
     * @param group
     */
    public Event(Integer created, Integer duration, String id, String name, Integer rsvpLimit, String status, Integer time, String localDate, String localTime, Integer updated, Integer utcOffset, Integer waitlistCount, Integer yesRsvpCount, Venue venue, Group group, String link, String description, String howToFindUs, String visibility) {
        super();
        this.created = created;
        this.duration = duration;
        this.id = id;
        this.name = name;
        this.rsvpLimit = rsvpLimit;
        this.status = status;
        this.time = time;
        this.localDate = localDate;
        this.localTime = localTime;
        this.updated = updated;
        this.utcOffset = utcOffset;
        this.waitlistCount = waitlistCount;
        this.yesRsvpCount = yesRsvpCount;
        this.venue = venue;
        this.group = group;
        this.link = link;
        this.description = description;
        this.howToFindUs = howToFindUs;
        this.visibility = visibility;
    }

    public Integer getCreated() {
        return created;
    }

    public void setCreated(Integer created) {
        this.created = created;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRsvpLimit() {
        return rsvpLimit;
    }

    public void setRsvpLimit(Integer rsvpLimit) {
        this.rsvpLimit = rsvpLimit;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public String getLocalDate() {
        return localDate;
    }

    public void setLocalDate(String localDate) {
        this.localDate = localDate;
    }

    public String getLocalTime() {
        return localTime;
    }

    public void setLocalTime(String localTime) {
        this.localTime = localTime;
    }

    public Integer getUpdated() {
        return updated;
    }

    public void setUpdated(Integer updated) {
        this.updated = updated;
    }

    public Integer getUtcOffset() {
        return utcOffset;
    }

    public void setUtcOffset(Integer utcOffset) {
        this.utcOffset = utcOffset;
    }

    public Integer getWaitlistCount() {
        return waitlistCount;
    }

    public void setWaitlistCount(Integer waitlistCount) {
        this.waitlistCount = waitlistCount;
    }

    public Integer getYesRsvpCount() {
        return yesRsvpCount;
    }

    public void setYesRsvpCount(Integer yesRsvpCount) {
        this.yesRsvpCount = yesRsvpCount;
    }

    public Venue getVenue() {
        return venue;
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getHowToFindUs() {
        return howToFindUs;
    }

    public void setHowToFindUs(String howToFindUs) {
        this.howToFindUs = howToFindUs;
    }

    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

}
