package com.example.madamkinza.assignment_2;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.google.gson.Gson;
import org.greenrobot.eventbus.EventBus;

public class DetailsGson {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details);
        Gson gs = new Gson();
        String trg = getIntent().getStringExtra("Contact");
        ContactDetailEvent contactDetailsEvent = new ContactDetailEvent(trg);
        EventBus.getDefault().post(contactDetailsEvent);
    }
}
