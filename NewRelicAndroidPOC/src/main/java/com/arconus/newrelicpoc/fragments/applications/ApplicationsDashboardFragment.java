package com.arconus.newrelicpoc.fragments.applications;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.arconus.newrelicpoc.R;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class ApplicationsDashboardFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.app_dashboard, null);

        TextView bigStat = (TextView) rootView.findViewById(R.id.dash_big_stat);
        bigStat.setText(getRandomBigStat());

        DecimalFormat decimalFormat = new DecimalFormat("#.##");

        TextView upperLeftStat = (TextView) rootView.findViewById(R.id.dash_small_upper_left_stat);
        upperLeftStat.setText(getRandomUpperLeftStat(decimalFormat));

        TextView upperRightStat = (TextView) rootView.findViewById(R.id.dash_small_upper_right_stat);
        upperRightStat.setText(getRandomUpperRightStat(decimalFormat));

        TextView lowerStat = (TextView) rootView.findViewById(R.id.dash_small_bottom_stat);
        lowerStat.setText(getRandomLowerStat());

        return rootView;
    }

    private String getRandomBigStat() {
        return randomNumber(500) + " ms";
    }

    private String getRandomUpperLeftStat(DecimalFormat decimalFormat) {
        return decimalFormat.format(Math.random());
    }

    private String getRandomUpperRightStat(DecimalFormat decimalFormat) {
        return decimalFormat.format(Math.random() * 50) + "%";
    }

    private String getRandomLowerStat() {
        NumberFormat nf = NumberFormat.getInstance();
        return nf.format(randomNumber(10000));
    }

    private int randomNumber(int maxRange) {
        return 1 + (int)(Math.random() * maxRange);
    }
}
