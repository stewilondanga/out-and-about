package io.github.stewilondanga.outandabout;

import android.content.Context;
import android.widget.ArrayAdapter;

/**
 * Created by stewart on 6/9/18.
 */

public class OutAndAboutArrayAdapter extends ArrayAdapter {
    private Context mContext;
    private String[] mLocation;
    private String[] mEvent;

            public OutAndAboutArrayAdapter(Context mContext, int resource, String[]mLocation, String[]mEvent) {
                super(mContext, resource);
                this.mContext = mContext;
                this.mLocation = mLocation;
                this.mEvent = mEvent;
            }

            @Override
            public Object getItem(int position){
                String first = mLocation[position];
                String second = mEvent[position];
                return String.format("%s \nOngoing now: %s", first, second);
            }

            @Override
            public int getCount() {
                return mLocation.length;
            }

}
