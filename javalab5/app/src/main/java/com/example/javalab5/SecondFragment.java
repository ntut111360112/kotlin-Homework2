package com.example.javalab5;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SecondFragment extends Fragment {

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.e("SecondFragment", "onAttach");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("SecondFragment", "onCreate");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.e("SecondFragment", "onCreateView");
        // 填充 Layout 佈局，返回 View 對象
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.e("SecondFragment", "onViewCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.e("SecondFragment", "onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e("SecondFragment", "onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.e("SecondFragment", "onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.e("SecondFragment", "onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.e("SecondFragment", "onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e("SecondFragment", "onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.e("SecondFragment", "onDetach");
    }
}
