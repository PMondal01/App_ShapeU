package com.example.shape_u;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.MenuItem;

public class SuccessStory extends AppCompatActivity {

    private ViewPager price_viewPager;
    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        price_viewPager= findViewById(R.id.viewpager_price);

        FragmentManager fragmentManager=getSupportFragmentManager();
        CustomAdapter adapter=new CustomAdapter(fragmentManager);
        price_viewPager.setAdapter(adapter);


    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if(item.getItemId()==android.R.id.home)
        {
            this.finish();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    class CustomAdapter extends FragmentStatePagerAdapter {


        public CustomAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {

            Fragment fragment=null;

            if(position==0)
            {
                fragment=new SuccessOneFragment();
            }else if(position==1)
            {
                fragment=new SuccessTwoFragment();
            }else if(position==2)
            {
                fragment=new SuccessThreeFragment() ;
            }
            return fragment;
        }

        @Override
        public int getCount() {
            return 3;
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {


            if(position==0)
            {
                return "Success Story";
            }else if(position==1)
            {
                return "Success Story";
            }else if(position==2)
            {
                return "Success Story";
            }
            return null;

        }
    }
}
