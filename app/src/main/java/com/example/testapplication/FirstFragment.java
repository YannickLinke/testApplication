package com.example.testapplication;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.testapplication.databinding.FragmentFirstBinding;

public class FirstFragment extends Fragment {

    private FragmentFirstBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentFirstBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.buttonFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.playSoundEffect(android.view.SoundEffectConstants.CLICK);
                TextView penis = (TextView) getActivity().findViewById(R.id.textview_first);

                if (Color.parseColor("#00c3ff") == penis.getCurrentTextColor()) {
                    penis.setTextColor(Color.parseColor("#ff0006"));
                }
                else if (Color.parseColor("#ff0006") == penis.getCurrentTextColor()) {
                    penis.setTextColor(Color.parseColor("#00c3ff"));
                }
                else penis.setTextColor(Color.parseColor("#ff0006"));
                float penisSize = penis.getTextSize();
                penis.setTextSize(TypedValue.COMPLEX_UNIT_PX, penisSize + 5);
                penis.setText(Float.toString(penis.getTextSize()));

               // NavHostFragment.findNavController(FirstFragment.this
                //        .navigate(R.id.action_FirstFragment_to_SecondFragment);
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}