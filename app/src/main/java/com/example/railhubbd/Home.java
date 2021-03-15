package com.example.railhubbd;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.Window;
import android.widget.ListView;

import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Home extends AppCompatActivity {
    private BottomNavigationView bottomNavigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        bottomNavigationView=findViewById(R.id.bottom_navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(bottomnavmethod);
        getSupportFragmentManager().beginTransaction().replace(R.id.frame,new HomeFragment()).commit();
    }
    private BottomNavigationView.OnNavigationItemSelectedListener bottomnavmethod =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment fragment = null;
                    switch (item.getItemId()){
                        case R.id.home:
                        fragment = new HomeFragment();
                        break;

                        case R.id.search:
                            fragment = new SearchFragment();
                            break;

                        case R.id.update:
                            fragment = new UpdateFragment();
                            break;
                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame,fragment).commit();
                    return true;
                }
            };

}
