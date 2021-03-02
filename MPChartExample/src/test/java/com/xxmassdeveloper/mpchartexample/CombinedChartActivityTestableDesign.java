package com.xxmassdeveloper.mpchartexample;

import android.util.Log;

import static org.junit.Assert.assertEquals;

import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BubbleData;
import com.github.mikephil.charting.data.CandleData;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.ScatterData;

import org.junit.Test;

public class CombinedChartActivityTestableDesign {

    @Test
    public void CombinedChartPrivateMethodsTest() {
        final CombinedChartActivity a = new CombinedChartActivity();

        LineData l = a.generateLineData();
        assertEquals(1, l.getDataSetCount());
        assertEquals(12, l.getEntryCount());

        BarData b = a.generateBarData();
        assertEquals(2, b.getDataSetCount());
        assertEquals(24, b.getEntryCount());

        ScatterData s = a.generateScatterData();
        assertEquals(1, s.getDataSetCount());
        assertEquals(24, s.getEntryCount());

        CandleData c = a.generateCandleData();
        assertEquals(1, c.getDataSetCount());
        assertEquals(6, c.getEntryCount());

        BubbleData bu = a.generateBubbleData();
        assertEquals(1, bu.getDataSetCount());
        assertEquals(12, bu.getEntryCount());
    }
}
