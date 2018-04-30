package com.example.android.seixaltourguide.ui;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.ListFragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ImageView;

import com.example.android.seixaltourguide.R;
import com.example.android.seixaltourguide.model.Place;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout drawer;
    private ImageView actionBarImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        NavigationView navigationView = findViewById(R.id.nav_view);
        drawer = findViewById(R.id.drawer_layout);
        actionBarImage = findViewById(R.id.action_bar_image);

        setSupportActionBar(toolbar);

        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);

        drawer.addDrawerListener(toggle);
        toggle.syncState();
    }

    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

        PlacesListFragment placesListFragment = (PlacesListFragment) getSupportFragmentManager().findFragmentById(R.id.places_list_fragment);
        int id = item.getItemId();

        if (id == R.id.nav_attractions) {
            actionBarImage.setImageResource(R.drawable.header_attractions);
            placesListFragment.changeDataSet(Place.PLACE_TYPE_ATTRACTION);
        } else if (id == R.id.nav_events) {
            actionBarImage.setImageResource(R.drawable.header_events);
        } else if (id == R.id.nav_public_places) {
            actionBarImage.setImageResource(R.drawable.header_public_places);
        } else if (id == R.id.nav_restaurants) {
            actionBarImage.setImageResource(R.drawable.header_restaurants);
        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
