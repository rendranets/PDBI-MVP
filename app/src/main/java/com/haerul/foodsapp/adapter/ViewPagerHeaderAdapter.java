/*-----------------------------------------------------------------------------
 - Developed by Haerul Muttaqin                                               -
 - Last modified 3/17/19 5:24 AM                                              -
 - Subscribe : https://www.youtube.com/haerulmuttaqin                         -
 - Copyright (c) 2019. All rights reserved                                    -
 -----------------------------------------------------------------------------*/
package com.haerul.foodsapp.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.haerul.foodsapp.R;
import com.haerul.foodsapp.model.RecentEntries;

import java.util.List;

public class ViewPagerHeaderAdapter extends PagerAdapter {

    private List<RecentEntries.Recent> recents;
    private Context context;
    private static ClickListener clickListener;

    public ViewPagerHeaderAdapter(List<RecentEntries.Recent> recents, Context context) {
        this.recents = recents;
        this.context = context;
    }

    public void setOnItemClickListener(ClickListener clickListener) {
        ViewPagerHeaderAdapter.clickListener = clickListener;

    }

    @Override
    public int getCount() {
        return recents.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view.equals(o);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View view = LayoutInflater.from(context).inflate(
                R.layout.item_view_pager_header,
                container,
                false
        );

//        ImageView mealThumb = view.findViewById(R.id.mealThumb);
        TextView recentName = view.findViewById(R.id.mealName);

//        String strMealThumb = meals.get(position).getStrMealThumb();
//        Picasso.get().load(strMealThumb).into(mealThumb);

        String title = recents.get(position).getTitle();
        recentName.setText(title);

        view.setOnClickListener(v -> clickListener.onClick(v, position));

        container.addView(view, 0);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View)object);
    }

    public interface ClickListener {
        void onClick(View v, int position);
    }
}
