package com.example.jetpacknavigation;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jetpacknavigation.databinding.FragmentABinding;
import com.example.jetpacknavigation.databinding.FragmentBBinding;


public class FragmentB extends Fragment {
    private FragmentBBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentBBinding.inflate(inflater);
        binding.textFB.setText(String.valueOf(
                getArguments() != null ? getArguments().getInt("value") : 0
        ));
        binding.fabB.setOnClickListener(v -> {
            NavDirections act = FragmentBDirections.actionFragmentBToFragmentA();
            Navigation.findNavController(requireView()).navigate(act);
        });



        return binding.getRoot();


    }
}