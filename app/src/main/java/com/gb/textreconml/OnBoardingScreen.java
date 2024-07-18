package com.gb.textreconml;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import com.hololo.tutorial.library.Step;
import com.hololo.tutorial.library.TutorialActivity;

public class OnBoardingScreen extends TutorialActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addFragment(new Step.Builder().setTitle("TEXTRECOGNIZER")
                .setContent("Aplicația folosește camera telefonului mobil pentru a extrage cu ușurință o propoziție, un fragment sau chiar un text întreg.")
                .setBackgroundColor(Color.parseColor("#00BFA6")) // int background color
                .setDrawable(R.drawable.onboard1) // int top drawable
                .setSummary("Continuă pentru mai multe informații")
                .build());

        addFragment(new Step.Builder().setTitle("Utilizarea aplicației")
                .setContent("Apăsați iconița \"camera\" pentru scanarea textului")
                .setBackgroundColor(Color.parseColor("#00BFA6")) // int background color
                .setDrawable(R.drawable.onboard2) // int top drawable
                .setSummary("Continuă pentru exemplu")
                .build());

        addFragment(new Step.Builder().setTitle("Exemplu")
                .setContent("Textul din sigla facultății de Automatica și Calculatoare din cadrul Universitatii Politehnica Timișoara a fost extras cu ajutorul aplicației TextRecognizer")
                .setBackgroundColor(Color.parseColor("#00BFA6")) // int background color
                .setDrawable(R.drawable.exemplu) // int top drawable
                .setSummary("Continua pentru utilizare")
                .build());


        }

    @Override
    public void finishTutorial() {
        // Your implementation
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
        finish();


    }

    @Override
    public void currentFragmentPosition(int position) {

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }
    }
