package com.example.javalab5;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FirstFragment extends Fragment {

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.e("FirstFragment", "onAttach");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("FirstFragment", "onCreate");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.e("FirstFragment", "onCreateView");
        // 填充 Layout 佈局，返回 View 對象
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.e("FirstFragment", "onViewCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.e("FirstFragment", "onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e("FirstFragment", "onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.e("FirstFragment", "onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.e("FirstFragment", "onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.e("FirstFragment", "onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e("FirstFragment", "onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.e("FirstFragment", "onDetach");
    }
}
