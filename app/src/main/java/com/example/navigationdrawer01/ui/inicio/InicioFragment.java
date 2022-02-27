package com.example.navigationdrawer01.ui.inicio;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.navigationdrawer01.R;
import com.example.navigationdrawer01.databinding.FragmentInicioBinding;

public class InicioFragment extends Fragment {

    private FragmentInicioBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_inicio, container, false);

        TextView tvTitle = root.findViewById((R.id.tv_title));
        tvTitle.setText("Início");

        ImageView ivTitle = root.findViewById((R.id.iv_title));
        ivTitle.setImageResource(R.drawable.icon_lar);

        return root;
    }
}