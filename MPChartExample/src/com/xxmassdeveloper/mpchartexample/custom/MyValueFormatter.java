package com.xxmassdeveloper.mpchartexample.custom;

import com.github.mikephil.charting.legacy.data.Entry;
import com.github.mikephil.charting.legacy.formatter.ValueFormatter;
import com.github.mikephil.charting.legacy.utils.ViewPortHandler;

import java.text.DecimalFormat;

public class MyValueFormatter implements ValueFormatter {

    private DecimalFormat mFormat;
    
    public MyValueFormatter() {
        mFormat = new DecimalFormat("###,###,###,##0.0");
    }

    @Override
    public String getFormattedValue(float value, Entry entry, int dataSetIndex, ViewPortHandler viewPortHandler) {
        return mFormat.format(value) + " $";
    }
}
