
package io.github.stewilondanga.outandabout.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Group {

    @SerializedName("created")
    @Expose
    private Integer created;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("join_mode")
    @Expose
    private String joinMode;
    @SerializedName("lat")
    @Expose
    private Double lat;
    @SerializedName("lon")
    @Expose
    private Double lon;
    @SerializedName("urlname")
    @Expose
    private String urlname;
    @SerializedName("who")
    @Expose
    private String who;
    @SerializedName("localized_location")
    @Expose
    private String localizedLocation;
    @SerializedName("region")
    @Expose
    private String region;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Group() {
    }

    /**
     * 
     * @param region
     * @param id
     * @param lon
     * @param created
     * @param localizedLocation
     * @param name
     * @param joinMode
     * @param urlname
     * @param lat
     * @param who
     */
    public Group(Integer created, String name, Integer id, String joinMode, Double lat, Double lon, String urlname, String who, String localizedLocation, String region) {
        super();
        this.created = created;
        this.name = name;
        this.id = id;
        this.joinMode = joinMode;
        this.lat = lat;
        this.lon = lon;
        this.urlname = urlname;
        this.who = who;
        this.localizedLocation = localizedLocation;
        this.region = region;
    }

    public Integer getCreated() {
        return created;
    }

    public void setCreated(Integer created) {
        this.created = created;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJoinMode() {
        return joinMode;
    }

    public void setJoinMode(String joinMode) {
        this.joinMode = joinMode;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public String getUrlname() {
        return urlname;
    }

    public void setUrlname(String urlname) {
        this.urlname = urlname;
    }

    public String getWho() {
        return who;
    }

    public void setWho(String who) {
        this.who = who;
    }

    public String getLocalizedLocation() {
        return localizedLocation;
    }

    public void setLocalizedLocation(String localizedLocation) {
        this.localizedLocation = localizedLocation;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

}
