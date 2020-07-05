package com.example.fragmentdinamico;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    FragmentBlue fragmentBlue;
    FragmentGreen fragmentGreen;
    FragmentRed fragmentRed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        casteo();
        //Para que aparezca el fragment rojo por defecto al inicio de la aplicacion
        getSupportFragmentManager().beginTransaction().add(R.id.ContenedorFragments,fragmentRed).commit();
    }
    public void casteo(){
        fragmentBlue =  new FragmentBlue();
        fragmentGreen =  new FragmentGreen();
        fragmentRed = new FragmentRed();
    }

    public void onClick(View v) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        switch (v.getId()){
            case R.id.btnBlue:
                //reemplazamos el fragment
                transaction.replace(R.id.ContenedorFragments,fragmentBlue);
                break;
            case R.id.btnGreen:
                //reemplazamos el fragment
                transaction.replace(R.id.ContenedorFragments,fragmentGreen);
                break;
            case R.id.btnRed:
                //reemplazamos el fragment
                transaction.replace(R.id.ContenedorFragments,fragmentRed);
                break;
        }
        transaction.commit();
    }
}