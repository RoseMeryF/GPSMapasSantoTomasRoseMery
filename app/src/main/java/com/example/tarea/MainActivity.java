package com.example.tarea;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.MediaController;
import android.widget.VideoView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback, GoogleMap.OnMapClickListener, GoogleMap.OnMapLongClickListener{

    GoogleMap gMap;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SupportMapFragment mFrag = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mFrag.getMapAsync(this);
        VideoView video = findViewById(R.id.video);
        String url = "https://drive.google.com/uc?export=download&id=15h-OQsLdoh9-Lv11TdWLtOSjWwYnjFfl";
        MediaController mController = new MediaController(this);
        video.setMediaController(mController);
        mController.setAnchorView(video);
        video.setVideoURI(Uri.parse(url));
        video.start();

    }
    @Override
    public void onMapReady(@NonNull GoogleMap goMap){
        gMap = goMap;
        this.gMap.setOnMapClickListener(this);
        this.gMap.setOnMapLongClickListener(this);

        LatLng CiudadArica = new LatLng(-18.478320108612348, -70.31387221338039);
        LatLng CiudadIquique = new LatLng(-20.23223394847825, -70.13885455809826);
        LatLng CiudadAntofagasta = new LatLng(-23.650298320710416, -70.40062925158895);
        LatLng CiudadLaSerena = new LatLng(-29.90203404926206, -71.24925897267794);
        LatLng CiudadVinaDelMar = new LatLng(-33.0172735401815, -71.56538215825886);
        LatLng CiudadSantiago = new LatLng(-33.44943597584032, -70.68758327564954);
        LatLng CiudadTalca = new LatLng(-35.42349059355265, -71.64596605821121);
        LatLng CiudadConcepcion = new LatLng(-36.81963138060923, -73.05992718013663);
        LatLng CiudadLosAngeles = new LatLng(-37.46308990767832, -72.35832717506213);
        LatLng CiudadTemuco = new LatLng(-38.74030845176631, -72.59688883133838);
        LatLng CiudadValdivia = new LatLng(-39.81533082028734, -73.24607219115967);

        LatLng CiudadOsorno = new LatLng(-40.57643935878803, -73.115935680749);

        LatLng CiudadPttoMontt = new LatLng(-41.46981215652005, -72.96871283744495);

        gMap.addMarker(new MarkerOptions().position(CiudadArica).title("Arica"));
        gMap.addMarker(new MarkerOptions().position(CiudadIquique).title("Iquique"));
        gMap.addMarker(new MarkerOptions().position(CiudadAntofagasta).title("Antofagasta"));
        gMap.addMarker(new MarkerOptions().position(CiudadLaSerena).title("La Serena"));
        gMap.addMarker(new MarkerOptions().position(CiudadVinaDelMar).title("Viña Del Mar"));
        gMap.addMarker(new MarkerOptions().position(CiudadSantiago).title("Santiago"));
        gMap.addMarker(new MarkerOptions().position(CiudadTalca).title("Talca"));
        gMap.addMarker(new MarkerOptions().position(CiudadConcepcion).title("Concepción"));
        gMap.addMarker(new MarkerOptions().position(CiudadLosAngeles).title("Los Angeles"));
        gMap.addMarker(new MarkerOptions().position(CiudadTemuco).title("Temuco"));
        gMap.addMarker(new MarkerOptions().position(CiudadValdivia).title("Valdivia"));
        gMap.addMarker(new MarkerOptions().position(CiudadOsorno).title("Osorno"));
        gMap.addMarker(new MarkerOptions().position(CiudadPttoMontt).title("Puerto Montt"));
    }
    @Override
    public void onMapClick(@NonNull LatLng latlang){
    }
    @Override
    public void onMapLongClick(@NonNull LatLng latlang){
    }
}