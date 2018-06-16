package io.github.stewilondanga.outandabout.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.github.stewilondanga.outandabout.R;

/**
 * Created by stewart on 6/17/18.
 */

public class OutAndAboutListAdapter extends RecyclerView.Adapter<OutAndAboutListAdapter.OutAndAboutViewHolder> {
        private List<events> mEvents = new ArrayList<>();
        private Context mContext;

        public OutAndAboutListAdapter(Context context, List<events>) {
            mContext = context;
            mEvents = events;
        }

        @Override
        public OutAndAboutListAdapter.OutAndAboutViewHolder onCreateViewHolder(ViewGroup parent, int viewType ) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.event, parent, false);
            return viewHolder;
        }

        @Override
        public void onBindViewHolder(OutAndAboutListAdapter.OutAndAboutViewHolder holder, int position) {
            holder.bindevents(mEvents.get(position));
        }

        @Override
        public int getItemCount() {
            return mEvents.size();
        }

        public class OutAndAboutViewHolder extends RecyclerView.ViewHolder {
            @BindView(R.id.itemImageView) ImageView mOutAndAboutImageView;
            @BindView(R.id.itemNameTextView) TextView mOutAndAboutTextView;
            @BindView(R.id.categoryTextView)TextView mCategoryTextView;
            @BindView(R.id.ratingTextView)TextView mRatingTextView;
            private Context mContext;

            public OutAndAboutViewHolder(View itemView) {
                super(itemView);
                ButterKnife.bind(this, itemView);
                mContext = itemView.getContext();
            }

            public void bindevents(events events) {
                mOutAndAboutTextView.setText(events.getName());
                mCategoryTextView.setText(events.getCategories().get(0).getTitle());
                mRatingTextView.setText("Rating: " + events.getRating() + "/5");
            }
        }
}
