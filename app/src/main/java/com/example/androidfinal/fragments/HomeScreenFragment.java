package com.example.androidfinal.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.androidfinal.R;
import com.example.androidfinal.adapters.SliderAdapter;
import com.example.androidfinal.models.SliderData;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;


public class HomeScreenFragment extends Fragment {
    // Urls of our images.
    String url1 = "https://cdn.hoanghamobile.com/i/home/Uploads/2022/10/11/vivo-v25-series-1200x382.jpg";
    String url2 = "https://cdn.hoanghamobile.com/i/home/Uploads/2022/10/21/iphone-14-1200x382.jpg";
    String url3 = "https://cdn.hoanghamobile.com/i/home/Uploads/2022/10/04/tai-nghe-bwoo-1200x382.jpg";
    String url4 = "https://cdn.hoanghamobile.com/i/home/Uploads/2022/10/06/laptop-gaming-gigabyte-1200x382.jpg";
    String url5 = "https://cdn.hoanghamobile.com/i/home/Uploads/2022/10/19/web-hotsale-samsung-galaxy-a-series-01.jpg";
    String url6 = "https://cdn.hoanghamobile.com/i/home/Uploads/2022/10/13/xiaomi-12t-series-1200x382.jpg";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home_screen, container, false);
        SliderView(view);
        return view;
    }

    private void SliderView(View view){
        ArrayList<SliderData> sliderDataArrayList = new ArrayList<>();

        // initializing the slider view.
        SliderView sliderView = view.findViewById(R.id.slider);

        // adding the urls inside array list
        // Change Code Here ⛔⛔⛔⛔⛔⛔⛔⛔⛔⛔⛔⛔⛔⛔⛔⛔⛔⛔⛔
        sliderDataArrayList.add(new SliderData(url1));
        sliderDataArrayList.add(new SliderData(url2));
        sliderDataArrayList.add(new SliderData(url3));
        sliderDataArrayList.add(new SliderData(url4));
        sliderDataArrayList.add(new SliderData(url5));
        sliderDataArrayList.add(new SliderData(url6));
        // passing this array list inside our adapter class.
        SliderAdapter adapter = new SliderAdapter(getActivity(), sliderDataArrayList);

        // below method is used to set auto cycle direction in left to
        // right direction you can change according to requirement.
        sliderView.setAutoCycleDirection(SliderView.LAYOUT_DIRECTION_LTR);

        // below method is used to
        // setadapter to sliderview.
        sliderView.setSliderAdapter(adapter);

        // below method is use to set
        // scroll time in seconds.
        sliderView.setScrollTimeInSec(3);

        // to set it scrollable automatically
        // we use below method.
        sliderView.setAutoCycle(true);

        // to start autocycle below method is used.
        sliderView.startAutoCycle();
    }
}