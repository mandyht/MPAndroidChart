package com.github.mikephil.charting.test;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.MediumTest;
import androidx.test.rule.ActivityTestRule;

import com.github.mikephil.charting.charts.CombinedChart;
import com.xxmassdeveloper.mpchartexample.CombinedChartActivity;
import com.xxmassdeveloper.mpchartexample.R;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
@MediumTest
public class CombinedChartActivityTestableDesignAJU4 {
    @Rule
    public ActivityTestRule<CombinedChartActivity> rule = new ActivityTestRule<>(CombinedChartActivity.class);

    @Test
    public void CombinedChartActivityStubTest() {
        CombinedChartActivity activity = rule.getActivity();
        CombinedChart c = activity.findViewById(R.id.chart1);

        c.setData(null);
    }
}
