
package io.github.stewilondanga.outandabout.models;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class City implements Parcelable
{

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("lat")
    @Expose
    private Double lat;
    @SerializedName("lon")
    @Expose
    private Double lon;
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("zip")
    @Expose
    private String zip;
    @SerializedName("member_count")
    @Expose
    private Integer memberCount;
    public final static Parcelable.Creator<City> CREATOR = new Creator<City>() {


        @SuppressWarnings({
            "unchecked"
        })
        public City createFromParcel(Parcel in) {
            return new City(in);
        }

        public City[] newArray(int size) {
            return (new City[size]);
        }

    }
    ;

    protected City(Parcel in) {
        this.id = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.city = ((String) in.readValue((String.class.getClassLoader())));
        this.lat = ((Double) in.readValue((Double.class.getClassLoader())));
        this.lon = ((Double) in.readValue((Double.class.getClassLoader())));
        this.state = ((String) in.readValue((String.class.getClassLoader())));
        this.country = ((String) in.readValue((String.class.getClassLoader())));
        this.zip = ((String) in.readValue((String.class.getClassLoader())));
        this.memberCount = ((Integer) in.readValue((Integer.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public City() {
    }

    /**
     * 
     * @param id
     * @param zip
     * @param lon
     * @param state
     * @param memberCount
     * @param lat
     * @param country
     * @param city
     */
    public City(Integer id, String city, Double lat, Double lon, String state, String country, String zip, Integer memberCount) {
        super();
        this.id = id;
        this.city = city;
        this.lat = lat;
        this.lon = lon;
        this.state = state;
        this.country = country;
        this.zip = zip;
        this.memberCount = memberCount;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public Integer getMemberCount() {
        return memberCount;
    }

    public void setMemberCount(Integer memberCount) {
        this.memberCount = memberCount;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(id);
        dest.writeValue(city);
        dest.writeValue(lat);
        dest.writeValue(lon);
        dest.writeValue(state);
        dest.writeValue(country);
        dest.writeValue(zip);
        dest.writeValue(memberCount);
    }

    public int describeContents() {
        return  0;
    }

}
