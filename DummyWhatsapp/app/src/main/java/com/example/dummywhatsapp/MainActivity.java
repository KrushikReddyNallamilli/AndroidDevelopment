package com.example.dummywhatsapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    
    TabLayout tab;
    ViewPager vp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tab=findViewById(R.id.mytab);
        vp=findViewById(R.id.myviewPager);
        
        vp.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));
        tab.setupWithViewPager(vp);
        tab.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                Toast.makeText(MainActivity.this, "OnTabSelected"+tab.getText().toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                Toast.makeText(MainActivity.this, "OnTabUnSelected"+tab.getText().toString(), Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                Toast.makeText(MainActivity.this, "onTabReselected"+tab.getText().toString(), Toast.LENGTH_SHORT).show();

            }
        });

    }    

        //creating a new fragment class
        public class MyPagerAdapter extends FragmentPagerAdapter
        {
            String myTabTitles[]={"Chats","Status","Calls"};
            public MyPagerAdapter(@NonNull FragmentManager fm) {
                super(fm);
            }
            

            @NonNull
            @Override
            public Fragment getItem(int position) {
                if (position==0) {
                    return new ChatsFragment();
                }
                if (position==1){
                    return new StatusFragment();
                }
                if (position==2){
                    return new CallsFragment();
                }
                return null;
            }

            @Override
            public int getCount() {
                return myTabTitles.length;
            }
            

            @Nullable
            @Override
            public CharSequence getPageTitle(int position) {
                return myTabTitles[position];
            }
        }
    
}