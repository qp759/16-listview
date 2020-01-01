package com.example.a16;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv;
    private ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.tv);
        lv = findViewById(R.id.lv);

        ArrayAdapter<CharSequence> arrAdapRegion
                = ArrayAdapter.createFromResource(getApplication(),
                R.array.list,
                android.R.layout.simple_list_item_1);
        lv.setAdapter(arrAdapRegion);
        lv.setOnItemClickListener(listViewRegionOnItemClick);
    }

    private AdapterView.OnItemClickListener listViewRegionOnItemClick
            = new AdapterView.OnItemClickListener() {

        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            String s = getString(R.string.selected);
            tv.setText(s + ((TextView) view).getText());
        }
    };
}
