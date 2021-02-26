package com.example.mywallpaper;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<customItems> itemsList;
    RecyclerView recyclerView;
    RecyclerViewAdapter recyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        itemsList=new ArrayList<>();
        itemsList.add(new customItems("https://i.pinimg.com/564x/9e/ea/15/9eea157a7c9c6f339d1c46affa5538df.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/564x/e0/16/43/e016436c08692df4b85372df15237d87.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/736x/10/a9/a5/10a9a5d9bcfa32c039a4946c6dea4eb0.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/736x/4c/70/4f/4c704f7ea0386cce3626671f957941b4.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/ca/1a/b5/ca1ab5bc9931012ad7534a5e93490427.png"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/c0/77/67/c077671445b53c539ff84d39d4ea981f.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/736x/29/60/06/2960060e32bc9910beae1cfb8ee51228.jpg"));
        itemsList.add(new customItems("https://wallpaperaccess.com/full/2734570.jpg"));
        itemsList.add(new customItems("https://punjabipics.in/img-small/NaturePics/PP998801044.jpg"));
        itemsList.add(new customItems("https://cdn.hipwallpaper.com/i/46/87/PMOauN.jpg"));
        itemsList.add(new customItems("https://punjabipics.in/img-small/NaturePics/PP23365200.jpg"));
        itemsList.add(new customItems("https://www.wallpapermobi.com/storage/upload/user_id_424/thumbnail/pinterest-cute-backgrounds-2020-01-27-08-13-25.jpg"));
        itemsList.add(new customItems("https://wallpaperaccess.com/full/2578585.jpg"));
        itemsList.add(new customItems("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRgKn3bh2mbjkvqr3mfsF1LGvpPZ0_STpFVsQ&usqp=CAU"));
        itemsList.add(new customItems("https://wallpapercave.com/wp/wp3201521.jpg"));
        itemsList.add(new customItems("https://cdn.wallpapersafari.com/61/74/EUwWsF.jpg"));
        itemsList.add(new customItems("https://wallpaperaccess.com/full/3980982.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/ba/7d/40/ba7d407dc517b8edcb4f8a20226a2feb.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/b1/91/9e/b1919eaeb51ac7ea4cf6cfb54f72882e.png"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/d4/2c/5b/d42c5bdd1593c6663a4411ba90198953.png"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/16/0d/e2/160de24070e212fff0b381530214b98f.jpg"));
        itemsList.add(new customItems("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQkvkz_dpuD9QWJFOF79VRgqgglHOLE-WBjgA&usqp=CAU"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/10/5e/2d/105e2dc9cfa195f9d69da5e60bc30717.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/6c/75/45/6c7545fc7b4f3faf074276a89e1b37ad.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/06/b2/ff/06b2ffe5537ce7d034e682083f71d3ed.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/85/74/30/857430f35458a17d66c4b9163e17beec.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/cc/27/bb/cc27bb393021b66c57f249feab75c320.jpg"));








        recyclerViewAdapter=new RecyclerViewAdapter(itemsList,this);
        recyclerView.setAdapter(recyclerViewAdapter);
    }
}