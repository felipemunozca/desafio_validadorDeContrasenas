package com.example.validador_password;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.validador_password.databinding.FragmentPantallaPrincipalBinding;
import com.example.validador_password.databinding.FragmentResultadoBinding;

public class ResultadoFragment extends Fragment {

    private FragmentResultadoBinding binding;
    private View view;

    public ResultadoFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        // return inflater.inflate(R.layout.fragment_resultado, container, false);
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_resultado, container, false);
        view = binding.getRoot();
        return view;
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        binding.flechaVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragmento = new PantallaPrincipalFragment();
                getParentFragmentManager().beginTransaction().replace(R.id.fragmentMain, fragmento).commit();
            }
        });

    }

}