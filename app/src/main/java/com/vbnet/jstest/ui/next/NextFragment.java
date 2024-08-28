package com.vbnet.jstest.ui.next;
import com.vbnet.jstest.MainActivity;
import com.vbnet.jstest.R;
import com.vbnet.jstest.databinding.FragmentNextBinding;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;


public class NextFragment extends Fragment {
    private FragmentNextBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        FragmentNextBinding binding = FragmentNextBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        if (!((MainActivity) this.getContext()).notesExist){
            ((MainActivity)getActivity()).getNext();
            ((MainActivity)getActivity()).navController.navigate(R.id.navigation_question);
        }

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
