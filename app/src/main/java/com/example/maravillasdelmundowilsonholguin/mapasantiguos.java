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
import com.example.maravillasdelmundowilsonholguin.databinding.ActivityMapasantiguosBinding;

public class mapasantiguos extends FragmentActivity implements OnMapReadyCallback, GoogleMap.OnMarkerClickListener {

    private GoogleMap mMap;
    private Marker markerPrueba; //variable de tipo marker
    private ActivityMapasantiguosBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapasantiguosBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Piramides de giza
        LatLng piramide = new LatLng(29.977171, 31.132341);
        mMap.addMarker(new MarkerOptions().position(piramide).title("Pirámides de Guiza").snippet("Legado egipcio emblematico e historico.")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.egipto)));

        // Jardines Colgantes de Babilonia
        LatLng babi = new LatLng(37.404276, -5.993542);
        mMap.addMarker(new MarkerOptions().position(babi).title("Jardines Colgantes de Babilonia").snippet("Construido en el siglo VI a.C, por Nabucodonosor II.")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.babilonia)));

        // Templo de Artemisa
        LatLng arte = new LatLng(37.949567, 27.363431);
        mMap.addMarker(new MarkerOptions().position(arte).title("Templo de Artemisa").snippet("En la ciudad de Éfeso, Turquía, dedicado a la diosa Artemisa, por los romanos.")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.artemisa)));

        // Estatua de Zeus en Olimpia
        LatLng zeus = new LatLng(37.969379, 23.733101);
        mMap.addMarker(new MarkerOptions().position(zeus).title("Templo de Zeus - Olimpia").snippet("También conocido como el Olimpeion, es un templo de Atenas.")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.zeus)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(zeus,5));

        // Mausoleo de Halicarnaso
        LatLng heli = new LatLng(37.037951, 27.423969);
        mMap.addMarker(new MarkerOptions().position(heli).title("Mausoleo de Halicarnaso").snippet("Monumento funerario construido entre el año 353 a.C. y el 350 a.C.")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.helicarnaso)));

        // Coloso de Rodas
        LatLng coloso = new LatLng(36.450996, 28.225785);
        mMap.addMarker(new MarkerOptions().position(coloso).title("Coloso de Rodas").snippet("Era una gran estatua del dios sol griego Helios.")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.coloso)));

        // Faro de Alejandría
        LatLng ale = new LatLng(31.213975, 29.884588);
        mMap.addMarker(new MarkerOptions().position(ale).title("Faro de Alejandría").snippet("Fue una torre construida en el siglo III a.C.")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.faro)));

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