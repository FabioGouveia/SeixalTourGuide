package com.example.android.seixaltourguide.place;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.android.seixaltourguide.R;
import com.example.android.seixaltourguide.model.Place;

import java.util.List;

public class PlaceListAdapter extends ArrayAdapter<Place> {

    private List<Place> places;

    public PlaceListAdapter(Context context, List<Place> places){
        super(context, 0, places);
        this.places = places;
    }

    public void changeDataSet(List<Place> places){
        this.places = places;
        this.notifyDataSetChanged();
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_list_places, parent, false);
        }

        Place place = places.get(position);

        if(place != null){
            ((TextView) convertView.findViewById(R.id.place_list_text_view)).setText(place.getAddress());
        }

        return convertView;
    }
}
