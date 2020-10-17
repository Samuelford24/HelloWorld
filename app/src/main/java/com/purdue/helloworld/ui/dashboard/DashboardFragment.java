package com.purdue.helloworld.ui.dashboard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.purdue.helloworld.R;

public class DashboardFragment extends Fragment {

    private DashboardViewModel dashboardViewModel;
    private WebView webView;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_dashboard, container, false);

        webView = (WebView) getView().findViewById(R.id.webviewWidget);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://eacct-purdue-sp.transactcampus.com/purdueeaccounts/AccountSummary.aspx?menu=0");

        return root;
    }
}