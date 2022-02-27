package com.example.navigationdrawer01.ui.quemsou;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.navigationdrawer01.R;

public class QuemsouFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_quemsou, container, false);

        TextView tvTitle = root.findViewById((R.id.tv_title));
        tvTitle.setText("Quem Sou");

        ImageView ivTitle = root.findViewById((R.id.iv_title));
        ivTitle.setImageResource(R.drawable.icon_do_utilizador);

        return root;
    }
}