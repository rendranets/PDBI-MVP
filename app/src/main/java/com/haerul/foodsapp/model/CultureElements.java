/*-----------------------------------------------------------------------------
 - Developed by Haerul Muttaqin                                               -
 - Last modified 3/17/19 5:24 AM                                              -
 - Subscribe : https://www.youtube.com/haerulmuttaqin                         -
 - Copyright (c) 2019. All rights reserved                                    -
 -----------------------------------------------------------------------------*/
package com.haerul.foodsapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CultureElements {

    @SerializedName("data")
    @Expose
    private List<Element> data = null;

    public List<Element> getCultureElements() {
        return data;
    }

    public void setCultureElements(List<Element> data) {
        this.data = data;
    }

    public static class Element {

        @SerializedName("1")
        @Expose
        private String _1;
        @SerializedName("2")
        @Expose
        private String _2;
        @SerializedName("3")
        @Expose
        private String _3;
        @SerializedName("4")
        @Expose
        private String _4;
        @SerializedName("5")
        @Expose
        private String _5;
        @SerializedName("6")
        @Expose
        private String _6;
        @SerializedName("7")
        @Expose
        private String _7;
        @SerializedName("8")
        @Expose
        private String _8;
        @SerializedName("9")
        @Expose
        private String _9;
        @SerializedName("10")
        @Expose
        private String _10;
        @SerializedName("11")
        @Expose
        private String _11;
        @SerializedName("12")
        @Expose
        private String _12;
        @SerializedName("13")
        @Expose
        private String _13;
        @SerializedName("14")
        @Expose
        private String _14;
        @SerializedName("15")
        @Expose
        private String _15;

        public String get1() {
            return _1;
        }

        public void set1(String _1) {
            this._1 = _1;
        }

        public String get2() {
            return _2;
        }

        public void set2(String _2) {
            this._2 = _2;
        }

        public String get3() {
            return _3;
        }

        public void set3(String _3) {
            this._3 = _3;
        }

        public String get4() {
            return _4;
        }

        public void set4(String _4) {
            this._4 = _4;
        }

        public String get5() {
            return _5;
        }

        public void set5(String _5) {
            this._5 = _5;
        }

        public String get6() {
            return _6;
        }

        public void set6(String _6) {
            this._6 = _6;
        }

        public String get7() {
            return _7;
        }

        public void set7(String _7) {
            this._7 = _7;
        }

        public String get8() {
            return _8;
        }

        public void set8(String _8) {
            this._8 = _8;
        }

        public String get9() {
            return _9;
        }

        public void set9(String _9) {
            this._9 = _9;
        }

        public String get10() {
            return _10;
        }

        public void set10(String _10) {
            this._10 = _10;
        }

        public String get11() {
            return _11;
        }

        public void set11(String _11) {
            this._11 = _11;
        }

        public String get12() {
            return _12;
        }

        public void set12(String _12) {
            this._12 = _12;
        }

        public String get13() {
            return _13;
        }

        public void set13(String _13) {
            this._13 = _13;
        }

        public String get14() {
            return _14;
        }

        public void set14(String _14) {
            this._14 = _14;
        }

        public String get15() {
            return _15;
        }

        public void set15(String _15) {
            this._15 = _15;
        }
    }

}