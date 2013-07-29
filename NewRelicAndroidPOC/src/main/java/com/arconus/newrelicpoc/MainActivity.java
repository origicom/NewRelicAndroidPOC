package com.arconus.newrelicpoc;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;

import com.arconus.newrelicpoc.adapters.NavDrawerDataOrb;
import com.arconus.newrelicpoc.adapters.NavDrawerListAdapter;
import com.arconus.newrelicpoc.fragments.ApplicationsPagerAdapter;
import com.arconus.newrelicpoc.fragments.KeyTransactionsPagerAdapter;
import com.arconus.newrelicpoc.fragments.MobileAppPagerAdapter;
import com.arconus.newrelicpoc.fragments.ServersPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends FragmentActivity {

    public static final int APPLICATIONS_NAV_DRAWER_INDEX = 0;
    public static final int SERVERS_NAV_DRAWER_INDEX = 1;
    public static final int KEY_TRANSACTIONS_NAV_DRAWER_INDEX = 2;
    public static final int MOBILE_APPS_NAV_DRAWER_INDEX = 3;
    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link android.support.v4.app.FragmentPagerAdapter} derivative, which
     * will keep every loaded fragment in memory. If this becomes too memory
     * intensive, it may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    PagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    ViewPager mViewPager;
    DrawerLayout mDrawerLayout;
    ActionBarDrawerToggle mDrawerToggle;
    ListView mDrawerList;
    private String mTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Create the adapter that will return a fragment for each of the three
        // primary sections of the app.
        mSectionsPagerAdapter = new ApplicationsPagerAdapter(getSupportFragmentManager(), "Applications ");

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.content_frame);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawerList = (ListView) findViewById(R.id.left_drawer);

        // Set the adapter for the list view
        mDrawerList.setAdapter(createNavDrawerAdapter());
        // Set the list's click listener
        mDrawerList.setOnItemClickListener(new DrawerItemClickListener());

        mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout,
                R.drawable.ic_drawer, R.string.drawer_open, R.string.drawer_close) {

            /** Called when a drawer has settled in a completely closed state. */
            public void onDrawerClosed(View view) {
                getActionBar().setTitle(mTitle);
                invalidateOptionsMenu(); // creates call to onPrepareOptionsMenu()
            }

            /** Called when a drawer has settled in a completely open state. */
            public void onDrawerOpened(View drawerView) {
                getActionBar().setTitle("Drawer title");
                invalidateOptionsMenu(); // creates call to onPrepareOptionsMenu()
            }
        };

        // Set the drawer toggle as the DrawerListener
        mDrawerLayout.setDrawerListener(mDrawerToggle);

        getActionBar().setDisplayHomeAsUpEnabled(true);
        getActionBar().setHomeButtonEnabled(true);
    }

    private BaseAdapter createNavDrawerAdapter() {
        List<NavDrawerDataOrb> list = new ArrayList<NavDrawerDataOrb>();
        list.add(new NavDrawerDataOrb(R.drawable.ic_applications, "Applications", 43, 1, 1));
        list.add(new NavDrawerDataOrb(R.drawable.ic_server, "Servers", 98, 5, 0));
        list.add(new NavDrawerDataOrb(R.drawable.ic_keytransactions, "Key Transactions", 19, 4, 0));
        list.add(new NavDrawerDataOrb(R.drawable.ic_mobile, "Mobile Applications", 1, 0, 0));
        list.add(new NavDrawerDataOrb(R.drawable.ic_alert, "Alerts", 2));

        return new NavDrawerListAdapter(this, R.layout.nav_drawer_list_item, list);
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        // Sync the toggle state after onRestoreInstanceState has occurred.
        mDrawerToggle.syncState();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        mDrawerToggle.onConfigurationChanged(newConfig);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Pass the event to ActionBarDrawerToggle, if it returns
        // true, then it has handled the app icon touch event
        if (mDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }
        // Handle your other action bar items...

        return super.onOptionsItemSelected(item);
    }

    /* Called whenever we call invalidateOptionsMenu() */
    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        // If the nav drawer is open, hide action items related to the content view
        //boolean drawerOpen = mDrawerLayout.isDrawerOpen(mDrawerList);
        //menu.findItem(R.id.action_websearch).setVisible(!drawerOpen);
        return super.onPrepareOptionsMenu(menu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    private class DrawerItemClickListener implements ListView.OnItemClickListener {
        @Override
        public void onItemClick(AdapterView parent, View view, int position, long id) {
            switch(position) {
                case APPLICATIONS_NAV_DRAWER_INDEX:
                    mSectionsPagerAdapter = new ApplicationsPagerAdapter(getSupportFragmentManager(), "Applications ");
                    break;

                case SERVERS_NAV_DRAWER_INDEX:
                    mSectionsPagerAdapter = new ServersPagerAdapter(getSupportFragmentManager(), "Servers ");
                    break;

                case KEY_TRANSACTIONS_NAV_DRAWER_INDEX:
                    mSectionsPagerAdapter = new KeyTransactionsPagerAdapter(getSupportFragmentManager(), "Key Transactions ");
                    break;

                case MOBILE_APPS_NAV_DRAWER_INDEX:
                    mSectionsPagerAdapter = new MobileAppPagerAdapter(getSupportFragmentManager(), "Mobile Apps ");

                default:
                    break;
            }

            mViewPager.setAdapter(mSectionsPagerAdapter);
            mDrawerList.setItemChecked(position, true);
            mDrawerLayout.closeDrawer(mDrawerList);
        }
    }
}
