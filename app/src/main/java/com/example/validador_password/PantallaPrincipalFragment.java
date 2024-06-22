package com.example.validador_password;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.validador_password.databinding.FragmentPantallaPrincipalBinding;
import com.example.validador_password.databinding.FragmentResultadoBinding;


public class PantallaPrincipalFragment extends Fragment {

    private FragmentPantallaPrincipalBinding binding;
    private View view;

    public PantallaPrincipalFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //validarTextView();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_pantalla_principal, container, false);
        view = binding.getRoot();
        return view;

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        /**
         * 6. Utilizar un ChangeListener para escuchar los cambios en la contraseña y activar el
         * botón cuando se cumplen las condiciones, pero cuando las condiciones no se
         * cumplen, el botón debe estar deshabilitado.
         * */
        binding.inputContrasena.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            /**
             * 5. Validación de la contraseña aplicando los 2 criterios:
             * a. Tiene más de 5 caracteres.
             * b. Tiene al menos una letra mayúscula.
             * */
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() >=5 && validarMayuscula(s.toString())) {
                    binding.btnContrasena.setEnabled(true);
                } else {
                    binding.btnContrasena.setEnabled(false);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        /**
         * 7. Utilizar onClickListener para reaccionar al click en el botón.
         * */
        binding.btnContrasena.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragmento = new ResultadoFragment();
                //getSupportFragmentManager().beginTransaction().replace(R.id.fragmentMain, fragmento).commit();
                getParentFragmentManager().beginTransaction().replace(R.id.fragmentMain, fragmento).commit();
            }
        });


    }


    public boolean validarMayuscula(String text) {
        for (char mayuscula : text.toCharArray()) {
            if (Character.isUpperCase(mayuscula)) {
                return true;
            }
        }
        return false;
    }
}