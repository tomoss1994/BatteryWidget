package com.example.tomasz.batterywidget;

/**
 * Created by roman on 2015-08-22.
 */




import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class Fragment3 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        if (container == null) {
            return null;
        }

        return (LinearLayout) inflater.inflate(R.layout.fragment3_layout,
                container, false);
    }

}