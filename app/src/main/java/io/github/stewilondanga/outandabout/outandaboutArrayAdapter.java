package io.github.stewilondanga.outandabout;

import android.content.Context;
import android.widget.ArrayAdapter;

/**
 * Created by stewart on 6/9/18.
 */

public class outandaboutArrayAdapter extends ArrayAdapter {
    private Context mContext;
    private String[] mLocation;
    private String[] mEvent;

            public outandaboutArrayAdapter(Context mContext, int resource, String[]mLocation, String[] mEvent) {
                super(mContext, resource);
                this.mContext = mContext;
                this.mLocation = mLocation;
            }

}
