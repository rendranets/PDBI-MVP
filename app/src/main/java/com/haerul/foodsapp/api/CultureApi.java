/*-----------------------------------------------------------------------------
 - Developed by Haerul Muttaqin                                               -
 - Last modified 3/17/19 5:24 AM                                              -
 - Subscribe : https://www.youtube.com/haerulmuttaqin                         -
 - Copyright (c) 2019. All rights reserved                                    -
 -----------------------------------------------------------------------------*/
package com.haerul.foodsapp.api;

import com.haerul.foodsapp.model.CultureElements;
import com.haerul.foodsapp.model.RecentEntries;

import retrofit2.Call;
import retrofit2.http.GET;

public interface CultureApi {

    @GET("recent/[10]/?app_api=658a6175c9b16498af6d99a018de17bd8fcdb8b9&entry_type=1")
    Call<RecentEntries> getRecentEntry();

    @GET("element/?app_api=658a6175c9b16498af6d99a018de17bd8fcdb8b9")
    Call<CultureElements> getCultureElements();
}
