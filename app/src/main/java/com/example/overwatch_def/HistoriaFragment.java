package com.example.overwatch_def;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.overwatch_def.databinding.FragmentDPSBinding;
import com.example.overwatch_def.databinding.FragmentHealerBinding;
import com.example.overwatch_def.databinding.FragmentHistoriaBinding;
import com.thekhaeng.pushdownanim.PushDownAnim;

/**
 * A simple {@link Fragment} subclass.

 * create an instance of this fragment.
 */
public class HistoriaFragment extends Fragment {
    NavController navController;
    private @NonNull
    FragmentHistoriaBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return (binding = FragmentHistoriaBinding.inflate(inflater,container,false)).getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        navController = Navigation.findNavController(view);

        PushDownAnim.setPushDownAnimTo(binding.buttonBack3).setScale(PushDownAnim.MODE_SCALE,0.89f)
                .setDurationPush(PushDownAnim.DEFAULT_PUSH_DURATION)
                .setDurationRelease(PushDownAnim.DEFAULT_PUSH_DURATION)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        navController.navigate(R.id.action_historiaFragment_to_anaFragment);
                    }
                });




    }
}