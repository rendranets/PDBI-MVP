/*-----------------------------------------------------------------------------
 - Developed by Haerul Muttaqin                                               -
 - Last modified 3/17/19 5:24 AM                                              -
 - Subscribe : https://www.youtube.com/haerulmuttaqin                         -
 - Copyright (c) 2019. All rights reserved                                    -
 -----------------------------------------------------------------------------*/
package com.haerul.foodsapp.view.home;

import android.support.annotation.NonNull;

import com.haerul.foodsapp.Utils;
import com.haerul.foodsapp.model.CultureElements;
import com.haerul.foodsapp.model.RecentEntries;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

class HomePresenter {

    private HomeView view;

    public HomePresenter(HomeView view) {
        this.view = view;
    }

    void getRecentEntries() {
        view.showLoading();
        Call<RecentEntries> recentEntriesCall = Utils.getApi().getRecentEntry();
        recentEntriesCall.enqueue(new Callback<RecentEntries>() {

            @Override
            public void onResponse(@NonNull Call<RecentEntries> call, @NonNull Response<RecentEntries> response) {
                view.hideLoading();
                //  Non-empty results check & Non-empty results check
                if (response.isSuccessful() && response.body() != null) {
                    view.setRecentEntry(response.body().getRecentEntries());
                }
                else {
                    view.onErrorLoading(response.message());
                }
            }

            @Override
            public void onFailure(@NonNull Call<RecentEntries> call, @NonNull Throwable t) {
                view.hideLoading();
                view.onErrorLoading(t.getLocalizedMessage());

            }
        });
    }


    void getCultureElements() {
        view.showLoading();
        Call<CultureElements> cultureElementsCall = Utils.getApi().getCultureElements();

        cultureElementsCall.enqueue(new Callback<CultureElements>() {
            @Override
            public void onResponse(@NonNull Call<CultureElements> call,
                                   @NonNull Response<CultureElements> response) {
                view.hideLoading();
                if (response.isSuccessful() && response.body() != null) {
                    view.setCultureElement(response.body().getCultureElements());
                }
                else {
                    view.onErrorLoading(response.message());
                }
            }

            @Override
            public void onFailure(Call<CultureElements> call, Throwable t) {
                view.hideLoading();
                view.onErrorLoading(t.getLocalizedMessage());
            }
        });
    }
}
