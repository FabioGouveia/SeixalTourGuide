package com.example.android.seixaltourguide.ui;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ListFragment;

import com.example.android.seixaltourguide.model.Attraction;
import com.example.android.seixaltourguide.model.Place;
import com.example.android.seixaltourguide.place.PlaceListAdapter;

import java.util.ArrayList;
import java.util.List;

public class PlacesListFragment extends ListFragment {

    private List<Place> testArray;
    private PlaceListAdapter placesListAdapter;

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        Context context = getContext();

        if(context != null) {

            testArray = new ArrayList<>();
            testArray.add(new Attraction("test-1", "address 1"));
            testArray.add(new Attraction("test-2", "address 2"));
            testArray.add(new Attraction("test-3", "address 3"));

            placesListAdapter = new PlaceListAdapter(context, testArray);

            setListAdapter(placesListAdapter);
        }
    }

    public void changeDataSet(int dataType){
        switch(dataType){
            case Place.PLACE_TYPE_ATTRACTION:
                List<Place> attractions = new ArrayList<>();
                attractions.add(new Attraction("test-1-changed", "address 1 changed"));
                attractions.add(new Attraction("test-2-changed", "address 2 changed"));
                attractions.add(new Attraction("test-3-changed", "address 3 changed"));
                attractions.add(new Attraction("test-4-changed", "address 4 changed"));
                attractions.add(new Attraction("test-5-changed", "address 5 changed"));

                    placesListAdapter.changeDataSet(attractions);
                break;
            case Place.PLACE_TYPE_EVENT:

                break;
            case Place.PLACE_TYPE_PUBLIC_PLACE:

                break;
            case Place.PLACE_TYPE_RESTAURANTE:

                break;
        }
    }
}
