package com.example.hi.chatter;

import android.support.annotation.ColorInt;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static String TAG = "MainActivity";
    private SectionPageAdapter mSectionPageAdapter;
    private ViewPager mViewPager;
    private TabLayout tabLayout;
    private Toolbar mToolbar;
    private AppBarLayout mAppBarLayout;
    private TabHost tabHost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate:Starting.");
        mSectionPageAdapter = new SectionPageAdapter(getSupportFragmentManager());
        mViewPager = findViewById(R.id.container);
        tabLayout = findViewById(R.id.tabs);
        mAppBarLayout=findViewById(R.id.appbar);
        mToolbar = findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);

        mAppBarLayout.setBackgroundColor(R.color.colorAccent);
        tabLayout.setBackgroundColor(R.color.colorAccent);
        mToolbar.setBackgroundColor(R.color.colorAccent);


        mSectionPageAdapter = new SectionPageAdapter(getSupportFragmentManager());
        mSectionPageAdapter.addFragment(new Tab4Fragment(), "");
        mSectionPageAdapter.addFragment(new Tab1Fragment(), "CHATS");
        mSectionPageAdapter.addFragment(new Tab2Fragment(), "STATUS");
        mSectionPageAdapter.addFragment(new Tab3Fragment(), "CALLS");
        mViewPager.setAdapter(mSectionPageAdapter);
        tabLayout.setupWithViewPager(mViewPager);
        tabLayout.getTabAt(0).setIcon(R.drawable.ic_camera);




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_search:
                Toast.makeText(this, "Search Item Clicked", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_settings:
                Toast.makeText(this, "Settings Item Clicked", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.new_Broadcast:
                Toast.makeText(this, "New Broadcast Item Clicked", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.new_group:
                Toast.makeText(this, "NewGroup Item Clicked", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.starred_msg:
                Toast.makeText(this, "Starred Messages Item Clicked", Toast.LENGTH_SHORT).show();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
