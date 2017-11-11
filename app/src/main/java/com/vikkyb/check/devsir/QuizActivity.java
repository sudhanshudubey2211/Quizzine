package com.vikkyb.check.devsir;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.vikkyb.check.devsir.quizfragments.question1;

public class QuizActivity extends AppCompatActivity
{
    DatabaseReference d3;
    FirebaseAuth mauth;
    String first_name,last_name,dateofjoin,imagetake;
    String current;
    TextView t1,t2;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        mauth= FirebaseAuth.getInstance();
        question1 fr=new question1();
        android.support.v4.app.FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_container,fr);
        transaction.commit();
//
//        if(mauth.getCurrentUser()==null)
//        {
//
//        }
//        else
//        {
//
//            d3.addValueEventListener(new ValueEventListener()
//            {
//                @Override
//                public void onDataChange(DataSnapshot dataSnapshot)
//                {
//                    first_name = (String) dataSnapshot.child("First").getValue();
//
//                    t1.setText(first_name);
//
//
//                }
//
//                @Override
//                public void onCancelled(DatabaseError databaseError)
//                {
//
//                }
//            });
//        }
    }
}
