/*-----------------------------------------------------------------------------
 - Developed by Haerul Muttaqin                                               -
 - Last modified 3/17/19 5:24 AM                                              -
 - Subscribe : https://www.youtube.com/haerulmuttaqin                         -
 - Copyright (c) 2019. All rights reserved                                    -
 -----------------------------------------------------------------------------*/
package com.haerul.foodsapp.view.home;

import com.haerul.foodsapp.model.CultureElements;
import com.haerul.foodsapp.model.RecentEntries;

import java.util.List;

public interface HomeView {

    void showLoading();
    void hideLoading();
    void setRecentEntry(List<RecentEntries.Recent> recent);
    void setCultureElement(List<CultureElements.Element> element);
    void onErrorLoading(String message);
}
