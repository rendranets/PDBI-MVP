/*-----------------------------------------------------------------------------
 - Developed by Haerul Muttaqin                                               -
 - Last modified 3/17/19 5:24 AM                                              -
 - Subscribe : https://www.youtube.com/haerulmuttaqin                         -
 - Copyright (c) 2019. All rights reserved                                    -
 -----------------------------------------------------------------------------*/
package com.haerul.foodsapp.view.home;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.haerul.foodsapp.R;
import com.haerul.foodsapp.Utils;
import com.haerul.foodsapp.adapter.RecyclerViewHomeAdapter;
import com.haerul.foodsapp.adapter.ViewPagerHeaderAdapter;
import com.haerul.foodsapp.model.CultureElements;
import com.haerul.foodsapp.model.RecentEntries;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class  HomeActivity extends AppCompatActivity implements HomeView{

    @BindView(R.id.viewPagerHeader) ViewPager viewPagerRecent;
    @BindView(R.id.recyclerCategory) RecyclerView recyclerViewElement;


    HomePresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);

        presenter = new HomePresenter(this);
        presenter.getRecentEntries();
        presenter.getCultureElements();

    }

    @Override
    public void showLoading() {
        findViewById(R.id.shimmerMeal).setVisibility(View.VISIBLE);
        findViewById(R.id.shimmerCategory).setVisibility(View.VISIBLE);
    }

    @Override
    public void hideLoading() {
        findViewById(R.id.shimmerMeal).setVisibility(View.GONE);
        findViewById(R.id.shimmerCategory).setVisibility(View.GONE);
    }

    @Override
    public void setRecentEntry(List<RecentEntries.Recent> recent) {
        ViewPagerHeaderAdapter headerAdapter = new ViewPagerHeaderAdapter(recent, this);
        viewPagerRecent.setAdapter(headerAdapter);
        viewPagerRecent.setPadding(20 ,0 ,150 ,0 );
        headerAdapter.notifyDataSetChanged();
        headerAdapter.setOnItemClickListener((v, position) -> {
            Toast.makeText(this, recent.get(position).getTitle(), Toast.LENGTH_SHORT).show();
        });
    }

    @Override
    public void setCultureElement(List<CultureElements.Element> element) {
        RecyclerViewHomeAdapter homeAdapter = new RecyclerViewHomeAdapter(element, this);
        recyclerViewElement.setAdapter(homeAdapter);
        GridLayoutManager layoutManager = new GridLayoutManager(this,3 ,
                GridLayoutManager.VERTICAL, false);
        recyclerViewElement.setLayoutManager(layoutManager);
        recyclerViewElement.setNestedScrollingEnabled(true);
        homeAdapter.notifyDataSetChanged();
        homeAdapter.setOnItemClickListener((view, position) -> {
            Toast.makeText(this, element.get(position).get1(), Toast.LENGTH_SHORT).show();
        });
    }

    @Override
    public void onErrorLoading(String message) {
        Utils.showDialogMessage(this, "Title", message);

    }

    // TODO 36 Overriding the interface

}
