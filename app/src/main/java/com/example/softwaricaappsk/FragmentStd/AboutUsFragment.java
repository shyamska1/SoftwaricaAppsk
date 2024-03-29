package com.example.softwaricaappsk.FragmentStd;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.softwaricaappsk.R;

public class AboutUsFragment extends Fragment {
    private WebView web;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.about_us, container, false);

        web = view.findViewById(R.id.WV_Website);
        web.loadUrl("https://softwarica.edu.np/");
        web.setWebViewClient(new WebViewClient());
        return view;
    }
}
