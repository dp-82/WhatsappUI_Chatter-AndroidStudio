package com.example.hi.chatter;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class Tab4Fragment extends Fragment {
    private static String TAG="Tab4Fragment";
    private Button btnTest;
    private ImageView mImage;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.tab4_layout,container,false);
        btnTest=view.findViewById(R.id.tab4_btn);
        btnTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Camera button pressed",Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }
}
