package com.example.canwe;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.canwe.databinding.ActivityMapsBinding;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        double[][] myarray = new double[10][2];
        myarray[0][0] = 27.472834;myarray[0][1] = 94.911964;
        myarray[1][0] = 23.603950602050556;myarray[1][1] = 58.433691338670556;//23.603950602050556, 58.433691338670556
        myarray[2][0] = 23.597604231966326;myarray[2][1] = 58.427836690096115;//23.597604231966326, 58.427836690096115
        myarray[3][0] = 23.57999050415805;myarray[3][1] = 58.42285397766954;//23.57999050415805, 58.42285397766954
        myarray[4][0] = .587932199466948;myarray[4][1] = 58.39655141380432;//23.587932199466948, 58.39655141380432
        myarray[5][0] = 23.595244606365913;myarray[5][1] = 58.45384338796461;//23.595244606365913, 58.45384338796461
        myarray[6][0] = 23.595244606365913;myarray[6][1] = 58.45384338796461;//23.595244606365913, 58.45384338796461

        // Add a marker in om
        LatLng Oman = new LatLng(myarray[DEFAULT_KEYS_DIALER][0], myarray[DEFAULT_KEYS_DIALER][1]);
        mMap.addMarker(new MarkerOptions().position(Oman).title("Marker in Oman"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Oman));
    }
}