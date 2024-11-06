package com.example.javalab5;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

// ViewPagerAdapter 繼承 FragmentStateAdapter 類別
// 傳遞 FragmentManager 和 Lifecycle 物件
public class ViewPagerAdapter extends FragmentStateAdapter {

    public ViewPagerAdapter(@NonNull FragmentManager fm, @NonNull Lifecycle lifecycle) {
        super(fm, lifecycle);
    }

    // 回傳 Fragment 的數量
    @Override
    public int getItemCount() {
        return 3;
    }

    // 根據 position 位置回傳對應的 Fragment
    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new FirstFragment();  // 第一頁 Fragment
            case 1:
                return new SecondFragment(); // 第二頁 Fragment
            default:
                return new ThirdFragment();  // 第三頁 Fragment
        }
    }
}
