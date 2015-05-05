package edu.ncsu.mobile.traces;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by Tyrone on 4/9/2015.
 */
/*The adapter provides access to the items in your data set, creates views for items,
and replaces the content of some of the views with new data items when the original
item is no longer visible.
 */
public class RecyclerAdapter extends RecyclerView.Adapter<FeedListRowHolder> {
    private List<FeedItem> feedItemList;

    // Provide a suitable constructor (depends on the kind of dataset)
     public RecyclerAdapter(List<FeedItem> feedItemList) {
        //super(feedItemList);
        this.feedItemList = feedItemList;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public FeedListRowHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item, null);
        FeedListRowHolder mh = new FeedListRowHolder(v);

        return mh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(FeedListRowHolder feedListRowHolder, int i) {
        FeedItem feedItem = feedItemList.get(i);

        feedListRowHolder.title.setText(Html.fromHtml(feedItem.getTitle()));
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return (null != feedItemList ? feedItemList.size() : 0);
    }
}
