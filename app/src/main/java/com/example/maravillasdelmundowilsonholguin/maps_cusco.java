package com.example.maravillasdelmundowilsonholguin;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.maravillasdelmundowilsonholguin.databinding.ActivityMapsCuscoBinding;

public class maps_cusco extends FragmentActivity implements OnMapReadyCallback, GoogleMap.OnMarkerClickListener {

    private GoogleMap mMap;
    private Marker markerPrueba; //variable de tipo marker
    private ActivityMapsCuscoBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsCuscoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // marcador saqsaywaman
        LatLng saqsa = new LatLng(-13.507738, -71.982901);
        mMap.addMarker(new MarkerOptions().position(saqsa).title("Fortaleza de SaqsayWaman").snippet("Es una fortaleza ceremonial inca, del inca Pachacútec.")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.saqsa)));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(saqsa,10));

        // marcador piedra 12 angulos
        LatLng piedra = new LatLng(-13.516013, -71.976312);
        mMap.addMarker(new MarkerOptions().position(piedra).title("Piedra de los 12 angulos").snippet("Piedra de 12 angulos que forma parte de un gran palacio inca.")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.piedra)));
        //mMap.moveCamera(CameraUpdateFactory.newLatLng(piedra));

        // marcador plaza de armas
        LatLng plaza = new LatLng(-13.516719, -71.978788);
        mMap.addMarker(new MarkerOptions().position(plaza).title("Plaza de armas del Cusco").snippet("Existe desde mucho antes de su fundación española en 1534.")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.plaza)));
        //mMap.moveCamera(CameraUpdateFactory.newLatLng(plaza));

        // marcador moray
        LatLng moray = new LatLng(-13.330183, -72.196728);
        mMap.addMarker(new MarkerOptions().position(moray).title("Moray").snippet("Son varios andenes incas circulares y está situado a 3500 msnm.")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.moray)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(moray,9));

        // marcador puerta del sol
        LatLng sol = new LatLng(-13.170051, -72.534411);
        mMap.addMarker(new MarkerOptions().position(sol).title("Puerta del Sol").snippet("Se ve la salida del sol en la puerta de piedra inca")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.sol)));
        //mMap.moveCamera(CameraUpdateFactory.newLatLng(sol));

        // marcador machu picchu
        LatLng machu = new LatLng(-13.162907, -72.545103);
        mMap.addMarker(new MarkerOptions().position(machu).title("Machu Picchu").snippet("La gran ciudadela Inca - Una maravilla del mundo")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.machu)));
        //mMap.moveCamera(CameraUpdateFactory.newLatLng(machu));

        googleMap.setOnMarkerClickListener(this);

    }

    @Override
    public boolean onMarkerClick(@NonNull Marker marker) {
        String lat, lg;
        lat = Double.toString(marker.getPosition().latitude);
        lg = Double.toString(marker.getPosition().longitude);

        Toast.makeText(this, "Coordenadas : " +  lat + " , " + lg, Toast.LENGTH_SHORT).show();
        return false;
    }
}