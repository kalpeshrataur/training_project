package com.example.dashbordreachrage;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    ActionBarDrawerToggle drawerToggle;

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if ( drawerToggle.onOptionsItemSelected(item))
        {
           /* switch (item.getItemId())
            {
                case R.id.home:
                {
                    Toast.makeText(MainActivity.this , "Home Selected" , Toast.LENGTH_SHORT).show();
                }
                break;
                case R.id.contact:
                {
                    Toast.makeText(MainActivity.this , "contact Selected" , Toast.LENGTH_SHORT).show();
                }  break;
                case R.id.gallery:
                {
                    Toast.makeText(MainActivity.this , "gallery Selected" , Toast.LENGTH_SHORT).show();
                }  break;
                case R.id.about:
                {
                    Toast.makeText(MainActivity.this , "About Selected" , Toast.LENGTH_SHORT).show();
                } break;
                case R.id.login:
                {
                    Toast.makeText(MainActivity.this , "Login Selected" , Toast.LENGTH_SHORT).show();
                }  break;
                case R.id.share:
                {
                    Toast.makeText(MainActivity.this , "Share Selected" , Toast.LENGTH_SHORT).show();
                } break;
                case R.id.rate_us:
                {
                    Toast.makeText(MainActivity.this , "rate_us Selected" , Toast.LENGTH_SHORT).show();
                }
            }*/
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         drawerLayout=findViewById(R.id.drawer_layout);
         navigationView=findViewById(R.id.nav_viwe);
        drawerToggle =new ActionBarDrawerToggle(MainActivity.this,drawerLayout,R.string.opne,R.string.close);
         drawerLayout.addDrawerListener(drawerToggle);
        drawerToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId())
                {
                    case R.id.home:
                    {
                        Toast.makeText(MainActivity.this , "Home Selected" , Toast.LENGTH_SHORT).show();
                    }
                    break;
                    case R.id.contact:
                    {
                        Toast.makeText(MainActivity.this , "contact Selected" , Toast.LENGTH_SHORT).show();
                    }  break;
                    case R.id.gallery:
                    {
                        Toast.makeText(MainActivity.this , "gallery Selected" , Toast.LENGTH_SHORT).show();
                    }  break;
                    case R.id.about:
                    {
                        Toast.makeText(MainActivity.this , "About Selected" , Toast.LENGTH_SHORT).show();
                    } break;
                    case R.id.login:
                    {
                        Toast.makeText(MainActivity.this , "Login Selected" , Toast.LENGTH_SHORT).show();
                    }  break;
                    case R.id.share:
                    {
                        Toast.makeText(MainActivity.this , "Share Selected" , Toast.LENGTH_SHORT).show();
                    } break;
                    case R.id.rate_us:
                    {
                        Toast.makeText(MainActivity.this , "rate_us Selected" , Toast.LENGTH_SHORT).show();
                    }
                }
                return true;
            }
        });

    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START))
        {
            drawerLayout.closeDrawer(GravityCompat.START);
        }
        else {
            super.onBackPressed();
        }
        super.onBackPressed();
    }
}