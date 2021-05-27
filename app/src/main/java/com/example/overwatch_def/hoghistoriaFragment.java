package com.example.overwatch_def;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.overwatch_def.databinding.FragmentHoghistoriaBinding;
import com.example.overwatch_def.databinding.FragmentRoadhogBinding;
import com.thekhaeng.pushdownanim.PushDownAnim;


public class hoghistoriaFragment extends Fragment {
    NavController navController;
    private FragmentHoghistoriaBinding binding;
    private Dialog dialog;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return (binding = FragmentHoghistoriaBinding.inflate(inflater,container,false)).getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        navController = Navigation.findNavController(view);
        dialog = new Dialog(getActivity());
        PushDownAnim.setPushDownAnimTo(binding.buttonBack3).setScale(PushDownAnim.MODE_SCALE,0.89f)
                .setDurationPush(PushDownAnim.DEFAULT_PUSH_DURATION)
                .setDurationRelease(PushDownAnim.DEFAULT_PUSH_DURATION)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        navController.navigate(R.id.action_hoghistoriaFragment_to_roadhogFragment);
                    }
                });
    }
}