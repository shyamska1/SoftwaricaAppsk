package com.example.softwaricaappsk;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.example.softwaricaappsk.FragmentStd.AboutUsFragment;
import com.example.softwaricaappsk.FragmentStd.AddStdFragment;
import com.example.softwaricaappsk.FragmentStd.HomeFragment;
import com.example.softwaricaappsk.Model.Student;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigation;
    FrameLayout main_layout;
    public static List<Student> students = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigation = findViewById(R.id.bottom_navigation);

        main_layout = findViewById(R.id.main_layout);

        students.add(new Student("Shyam Adhikari", 24, "male", "Kathmandu", R.drawable.ic_person_black_24dp));
        students.add(new Student("Reyon Thapa", 25, "Male", "Malta", R.drawable.ic_person_black_24dp));
        students.add(new Student("Sabina Dotel", 23, "Female", "Baniyetar", R.drawable.ic_person_black_24dp));
        students.add(new Student("Ram Prasad", 22, "Male", "Bhaktapur", R.drawable.ic_person_black_24dp));

        bottomNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                Fragment fragment = null;
                switch (menuItem.getItemId()) {
                    case R.id.Nav_Home:
                        fragment = new HomeFragment();
                        break;
                    case R.id.Nav_AboutUs:
                        fragment = new AboutUsFragment();
                        break;
                    case R.id.Nav_AddStudent:
                        fragment = new AddStdFragment();
                        break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.main_layout,
                        fragment).commit();
                return true;

            }
        });
    }
     }



