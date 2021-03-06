package io.github.stewilondanga.outandabout.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.github.stewilondanga.outandabout.R;
import io.github.stewilondanga.outandabout.models.Group;
import io.github.stewilondanga.outandabout.models.Event;

/**
 * Created by stewart on 6/17/18.
 */

public class OutAndAboutListAdapter extends RecyclerView.Adapter<OutAndAboutListAdapter.EventViewHolder> {
    private List<Event> mEvents = new ArrayList<>();
    private Context mContext;

    public OutAndAboutListAdapter(Context context, ArrayList<Event> events){
        mContext = context;
        mEvents = events;
    }

    @Override
    public OutAndAboutListAdapter.EventViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.event_list_item, parent, false);
        EventViewHolder viewHolder = new EventViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(OutAndAboutListAdapter.EventViewHolder holder, int position) {
        holder.bindEvents(mEvents.get(position));
    }

    @Override
    public int getItemCount() {
        return mEvents.size();
    }


    public class EventViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.itemImageView) ImageView mOutAndAboutImageView;
        @BindView(R.id.categoryTextView) TextView mCategoryTextView;
        private Context mContext;

            public EventViewHolder(View itemView) {
                super(itemView);
                ButterKnife.bind(this, itemView);
                mContext = itemView.getContext();
            }

            public void bindEvents(Event event) {
                mCategoryTextView.setText(event.getLocalDate());
            }
    }
}

