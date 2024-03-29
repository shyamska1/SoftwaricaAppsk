package com.example.softwaricaappsk.FragmentStd;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.softwaricaappsk.Adapter.StudentAdapter;
import com.example.softwaricaappsk.MainActivity;
import com.example.softwaricaappsk.R;

/** A simple {@link Fragment} subclass.

 */

public class HomeFragment extends Fragment {
    RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                         Bundle SavedInstanceState) {

        View view =inflater.inflate(R.layout.frag_home_std,container, false);
        recyclerView = view.findViewById(R.id.recyclerview_id);

        StudentAdapter studentAdapter = new StudentAdapter(getContext(), MainActivity.students);
        recyclerView.setAdapter(studentAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        return view;

    }
}
