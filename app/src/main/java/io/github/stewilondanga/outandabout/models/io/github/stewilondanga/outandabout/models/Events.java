
package io.github.stewilondanga.outandabout.models;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Events implements Parcelable
{

    @SerializedName("city")
    @Expose
    private City city;
    public final static Parcelable.Creator<Events> CREATOR = new Creator<Events>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Events createFromParcel(Parcel in) {
            return new Events(in);
        }

        public Events[] newArray(int size) {
            return (new Events[size]);
        }

    }
    ;

    protected Events(Parcel in) {
        this.city = ((City) in.readValue((City.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Events() {
    }

    /**
     * 
     * @param city
     */
    public Events(City city) {
        super();
        this.city = city;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(city);
    }

    public int describeContents() {
        return  0;
    }

}
