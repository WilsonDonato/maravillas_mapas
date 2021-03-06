package com.example.maravillasdelmundowilsonholguin;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.maravillasdelmundowilsonholguin.databinding.ActivityMapasmodernosBinding;

public class mapasmodernos extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapasmodernosBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapasmodernosBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Cristo Redentor
        LatLng cristo = new LatLng(-22.951988, -43.211012);
        mMap.addMarker(new MarkerOptions().position(cristo).title("Cristo redentor").snippet("Estatua de 38 metros de Cristo redentor con los brazos abiertos.")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.cristo)));

        // Machu Picchu
        LatLng machu = new LatLng(-13.162907, -72.545103);
        mMap.addMarker(new MarkerOptions().position(machu).title("Machu Picchu").snippet("La gran ciudadela Inca - Una maravilla del mundo")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.machu)));

        // Gran Muralla china
        LatLng china = new LatLng(40.4319077, 116.5703749);
        mMap.addMarker(new MarkerOptions().position(china).title("Gran Muralla china").snippet("Construida y reconstruida entre el siglo V a.C. y el siglo XVI")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.china)));

        // Petra, Jordania
        LatLng petra = new LatLng(30.326660, 35.444602);
        mMap.addMarker(new MarkerOptions().position(petra).title("Petra, Jordania").snippet("localidad de la gobernaci??n de Ma'an, en Jordania.")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.petra)));

        // Taj Mahal
        LatLng taj = new LatLng(27.173143, 78.042138);
        mMap.addMarker(new MarkerOptions().position(taj).title("Taj Mahal").snippet("Monumento funerario construido entre 1631 y 1654 en la ciudad de Agra.")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.taj)));

        // Coliseo de Roma
        LatLng roma = new LatLng(41.889663, 12.491464);
        mMap.addMarker(new MarkerOptions().position(roma).title("Coliseo de Romano").snippet("Un anfiteatro de la ??poca del Imperio romano, construido en el siglo I.")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.coliseo)));

        // Chichen Itz??
        LatLng chi = new LatLng(20.680255, -88.568381);
        mMap.addMarker(new MarkerOptions().position(chi).title("Chichen Itz?? - Mexico").snippet("Un complejo de ruinas mayas en la pen??nsula de Yucat??n de M??xico.")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.chichen)));

        // Torre Eiffel
        LatLng ein = new LatLng(48.858674, 2.293805);
        mMap.addMarker(new MarkerOptions().position(ein).title("Torre Eiffel").snippet("Llamada tour de 300 m??tres, es una estructura de hierro pudelado.")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.einfel)));

        // Torre de Pisa
        LatLng pisa = new LatLng(43.723105, 10.396849);
        mMap.addMarker(new MarkerOptions().position(pisa).title("Torre de Pisa").snippet("Torre de la catedral de Pisa, situada en la plaza del Duomo.")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.pisa)));

        // Kremlin rusia
        LatLng Kremlin = new LatLng(55.751060, 37.616261);
        mMap.addMarker(new MarkerOptions().position(Kremlin).title("Kremlin Rusia").snippet("un conjunto de edificios civiles y religiosos de Mosc??.")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.kremlin)));


    }
}

