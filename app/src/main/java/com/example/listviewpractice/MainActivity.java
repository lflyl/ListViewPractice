package com.example.listviewpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private String id[] = new String[]{
            "20161707",
            "20161713",
            "20171591",
            "20171592",
            "20171616",
            "20171627",
            "20171641",
            "20171649",
            "20171650",
            "20171653",
            "20171654",
            "20171655",
            "20171656",
            "20171659",
            "20171664",
            "20171666",
            "20171667",
            "20171668",
            "20171669",
            "20171670",
            "20171679",
            "20171688",
            "20171697",
            "20171705",
            "20171707",
            "20171714",
            "20171717",
            "20171731",
            "20171742",
            "20175064",
            "20175980",
            "20175990",
    };

    private List<ImageAndText> listItem = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addItem();

        ListItemAdapter adapter = new ListItemAdapter(MainActivity.this, R.layout.listitemlayout, listItem);

        ListView listview = (ListView)findViewById(R.id.list_item);

        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ImageAndText iat = listItem.get(position);
            }
        });
    }

    public void addItem() {
        ImageAndText iat1 = new ImageAndText(id[0], R.drawable.emoji_kids_01);
        listItem.add(iat1);
        ImageAndText iat2 = new ImageAndText(id[1], R.drawable.emoji_kids_02);
        listItem.add(iat2);
        ImageAndText iat3 = new ImageAndText(id[2], R.drawable.emoji_kids_03);
        listItem.add(iat3);
        ImageAndText iat4 = new ImageAndText(id[3], R.drawable.emoji_kids_04);
        listItem.add(iat4);
        ImageAndText iat5 = new ImageAndText(id[4], R.drawable.emoji_kids_05);
        listItem.add(iat5);
        ImageAndText iat6 = new ImageAndText(id[5], R.drawable.emoji_kids_06);
        listItem.add(iat6);
        ImageAndText iat7 = new ImageAndText(id[6], R.drawable.emoji_kids_07);
        listItem.add(iat7);
        ImageAndText iat8 = new ImageAndText(id[7], R.drawable.emoji_kids_08);
        listItem.add(iat8);
        ImageAndText iat9 = new ImageAndText(id[8], R.drawable.emoji_kids_09);
        listItem.add(iat9);
        ImageAndText iat10 = new ImageAndText(id[9], R.drawable.emoji_kids_10);
        listItem.add(iat10);
        ImageAndText iat11 = new ImageAndText(id[10], R.drawable.emoji_kids_11);
        listItem.add(iat11);
        ImageAndText iat12 = new ImageAndText(id[11], R.drawable.emoji_kids_12);
        listItem.add(iat12);
        ImageAndText iat13 = new ImageAndText(id[12], R.drawable.emoji_kids_13);
        listItem.add(iat13);
        ImageAndText iat14 = new ImageAndText(id[13], R.drawable.emoji_kids_14);
        listItem.add(iat14);
        ImageAndText iat15 = new ImageAndText(id[14], R.drawable.emoji_kids_15);
        listItem.add(iat15);
        ImageAndText iat16 = new ImageAndText(id[15], R.drawable.emoji_kids_16);
        listItem.add(iat16);
        ImageAndText iat17 = new ImageAndText(id[16], R.drawable.emoji_kids_17);
        listItem.add(iat17);
        ImageAndText iat18 = new ImageAndText(id[17], R.drawable.emoji_kids_18);
        listItem.add(iat18);
        ImageAndText iat19 = new ImageAndText(id[18], R.drawable.emoji_kids_19);
        listItem.add(iat19);
        ImageAndText iat20 = new ImageAndText(id[19], R.drawable.emoji_kids_20);
        listItem.add(iat20);
        ImageAndText iat21 = new ImageAndText(id[20], R.drawable.emoji_kids_21);
        listItem.add(iat21);
        ImageAndText iat22 = new ImageAndText(id[21], R.drawable.emoji_kids_22);
        listItem.add(iat22);
        ImageAndText iat23 = new ImageAndText(id[22], R.drawable.emoji_kids_23);
        listItem.add(iat23);
        ImageAndText iat24 = new ImageAndText(id[23], R.drawable.emoji_kids_24);
        listItem.add(iat24);
        ImageAndText iat25 = new ImageAndText(id[24], R.drawable.emoji_kids_25);
        listItem.add(iat25);
        ImageAndText iat26 = new ImageAndText(id[25], R.drawable.emoji_kids_26);
        listItem.add(iat26);
        ImageAndText iat27 = new ImageAndText(id[26], R.drawable.emoji_kids_27);
        listItem.add(iat27);
        ImageAndText iat28 = new ImageAndText(id[27], R.drawable.emoji_kids_28);
        listItem.add(iat28);
        ImageAndText iat29 = new ImageAndText(id[28], R.drawable.emoji_kids_29);
        listItem.add(iat29);
        ImageAndText iat30 = new ImageAndText(id[29], R.drawable.emoji_kids_30);
        listItem.add(iat30);
        ImageAndText iat31 = new ImageAndText(id[30], R.drawable.emoji_kids_31);
        listItem.add(iat31);
        ImageAndText iat32 = new ImageAndText(id[31], R.drawable.emoji_kids_32);
        listItem.add(iat32);

    }

}
