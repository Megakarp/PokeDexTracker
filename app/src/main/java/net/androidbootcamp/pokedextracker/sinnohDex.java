package net.androidbootcamp.pokedextracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class sinnohDex extends AppCompatActivity {

    private static final String favoritedPokeNamesKey4 = "favoritedPokeNamesKey4";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sinnoh_dex);
        GridView sinnohGrid = (GridView)findViewById(R.id.sinnohGrid);
        final ImageAdapter sinnohAdapter = new ImageAdapter(this, pokes);
        sinnohGrid.setAdapter(sinnohAdapter);
        sinnohGrid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView parent, View view, int position, long id) {
                Poke poke = pokes[position];
                poke.toggleFavorite();
                // This tells the kanto to redraw itself
                // in turn calling your ImageAdapter's getView method again for each cell
                sinnohAdapter.notifyDataSetChanged();
            }
        });
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        // construct a list of pokemon you've caught
        final ArrayList<Integer> favoritedPokeNames4 = new ArrayList<>();
        for (Poke poke : pokes) {
            if (poke.getIsFavorite()) {
                favoritedPokeNames4.add(poke.getName());
            }
        }

        // save that list to outState for later
        outState.putIntegerArrayList(favoritedPokeNamesKey4, favoritedPokeNames4);
    }
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        // get our previously saved list of pokemon you've caught
        final ArrayList<Integer> favoritedPokeNames4 =
                savedInstanceState.getIntegerArrayList(favoritedPokeNamesKey4);

        // look at all of your books and figure out which are the favorites
        for (int pokeName : favoritedPokeNames4) {
            for (Poke poke : pokes) {
                if (poke.getName() == pokeName) {
                    poke.setIsFavorite(true);
                    break;
                }
            }
        }
    }

    private Poke[] pokes = {
            new Poke(R.string.poke387,R.drawable.pokemon387),
            new Poke(R.string.poke388,R.drawable.pokemon388),
            new Poke(R.string.poke389,R.drawable.pokemon389),
            new Poke(R.string.poke390,R.drawable.pokemon390),
            new Poke(R.string.poke391,R.drawable.pokemon391),
            new Poke(R.string.poke392,R.drawable.pokemon392),
            new Poke(R.string.poke393,R.drawable.pokemon393),
            new Poke(R.string.poke394,R.drawable.pokemon394),
            new Poke(R.string.poke395,R.drawable.pokemon395),
            new Poke(R.string.poke396,R.drawable.pokemon396),
            new Poke(R.string.poke397,R.drawable.pokemon397),
            new Poke(R.string.poke398,R.drawable.pokemon398),
            new Poke(R.string.poke399,R.drawable.pokemon399),
            new Poke(R.string.poke400,R.drawable.pokemon400),
            new Poke(R.string.poke401,R.drawable.pokemon401),
            new Poke(R.string.poke402,R.drawable.pokemon402),
            new Poke(R.string.poke403,R.drawable.pokemon403),
            new Poke(R.string.poke404,R.drawable.pokemon404),
            new Poke(R.string.poke405,R.drawable.pokemon405),
            new Poke(R.string.poke406,R.drawable.pokemon406),
            new Poke(R.string.poke407,R.drawable.pokemon407),
            new Poke(R.string.poke408,R.drawable.pokemon408),
            new Poke(R.string.poke409,R.drawable.pokemon409),
            new Poke(R.string.poke410,R.drawable.pokemon410),
            new Poke(R.string.poke411,R.drawable.pokemon411),
            new Poke(R.string.poke412,R.drawable.pokemon412),
            new Poke(R.string.poke413,R.drawable.pokemon413),
            new Poke(R.string.poke414,R.drawable.pokemon414),
            new Poke(R.string.poke415,R.drawable.pokemon415),
            new Poke(R.string.poke416,R.drawable.pokemon416),
            new Poke(R.string.poke417,R.drawable.pokemon417),
            new Poke(R.string.poke418,R.drawable.pokemon418),
            new Poke(R.string.poke419,R.drawable.pokemon419),
            new Poke(R.string.poke420,R.drawable.pokemon420),
            new Poke(R.string.poke421,R.drawable.pokemon421),
            new Poke(R.string.poke422,R.drawable.pokemon422),
            new Poke(R.string.poke423,R.drawable.pokemon423),
            new Poke(R.string.poke424,R.drawable.pokemon424),
            new Poke(R.string.poke425,R.drawable.pokemon425),
            new Poke(R.string.poke426,R.drawable.pokemon426),
            new Poke(R.string.poke427,R.drawable.pokemon427),
            new Poke(R.string.poke428,R.drawable.pokemon428),
            new Poke(R.string.poke429,R.drawable.pokemon429),
            new Poke(R.string.poke430,R.drawable.pokemon430),
            new Poke(R.string.poke431,R.drawable.pokemon431),
            new Poke(R.string.poke432,R.drawable.pokemon432),
            new Poke(R.string.poke433,R.drawable.pokemon433),
            new Poke(R.string.poke434,R.drawable.pokemon434),
            new Poke(R.string.poke435,R.drawable.pokemon435),
            new Poke(R.string.poke436,R.drawable.pokemon436),
            new Poke(R.string.poke437,R.drawable.pokemon437),
            new Poke(R.string.poke438,R.drawable.pokemon438),
            new Poke(R.string.poke439,R.drawable.pokemon439),
            new Poke(R.string.poke440,R.drawable.pokemon440),
            new Poke(R.string.poke441,R.drawable.pokemon441),
            new Poke(R.string.poke442,R.drawable.pokemon442),
            new Poke(R.string.poke443,R.drawable.pokemon443),
            new Poke(R.string.poke444,R.drawable.pokemon444),
            new Poke(R.string.poke445,R.drawable.pokemon445),
            new Poke(R.string.poke446,R.drawable.pokemon446),
            new Poke(R.string.poke447,R.drawable.pokemon447),
            new Poke(R.string.poke448,R.drawable.pokemon448),
            new Poke(R.string.poke449,R.drawable.pokemon449),
            new Poke(R.string.poke450,R.drawable.pokemon450),
            new Poke(R.string.poke451,R.drawable.pokemon451),
            new Poke(R.string.poke452,R.drawable.pokemon452),
            new Poke(R.string.poke453,R.drawable.pokemon453),
            new Poke(R.string.poke454,R.drawable.pokemon454),
            new Poke(R.string.poke455,R.drawable.pokemon455),
            new Poke(R.string.poke456,R.drawable.pokemon456),
            new Poke(R.string.poke457,R.drawable.pokemon457),
            new Poke(R.string.poke458,R.drawable.pokemon458),
            new Poke(R.string.poke459,R.drawable.pokemon459),
            new Poke(R.string.poke460,R.drawable.pokemon460),
            new Poke(R.string.poke461,R.drawable.pokemon461),
            new Poke(R.string.poke462,R.drawable.pokemon462),
            new Poke(R.string.poke463,R.drawable.pokemon463),
            new Poke(R.string.poke464,R.drawable.pokemon464),
            new Poke(R.string.poke465,R.drawable.pokemon465),
            new Poke(R.string.poke466,R.drawable.pokemon466),
            new Poke(R.string.poke467,R.drawable.pokemon467),
            new Poke(R.string.poke468,R.drawable.pokemon468),
            new Poke(R.string.poke469,R.drawable.pokemon469),
            new Poke(R.string.poke470,R.drawable.pokemon470),
            new Poke(R.string.poke471,R.drawable.pokemon471),
            new Poke(R.string.poke472,R.drawable.pokemon472),
            new Poke(R.string.poke473,R.drawable.pokemon473),
            new Poke(R.string.poke474,R.drawable.pokemon474),
            new Poke(R.string.poke475,R.drawable.pokemon475),
            new Poke(R.string.poke476,R.drawable.pokemon476),
            new Poke(R.string.poke477,R.drawable.pokemon477),
            new Poke(R.string.poke478,R.drawable.pokemon478),
            new Poke(R.string.poke479,R.drawable.pokemon479),
            new Poke(R.string.poke480,R.drawable.pokemon480),
            new Poke(R.string.poke481,R.drawable.pokemon481),
            new Poke(R.string.poke482,R.drawable.pokemon482),
            new Poke(R.string.poke483,R.drawable.pokemon483),
            new Poke(R.string.poke484,R.drawable.pokemon484),
            new Poke(R.string.poke485,R.drawable.pokemon485),
            new Poke(R.string.poke486,R.drawable.pokemon486),
            new Poke(R.string.poke487,R.drawable.pokemon487),
            new Poke(R.string.poke488,R.drawable.pokemon488),
            new Poke(R.string.poke489,R.drawable.pokemon489),
            new Poke(R.string.poke490,R.drawable.pokemon490),
            new Poke(R.string.poke491,R.drawable.pokemon491),
            new Poke(R.string.poke492,R.drawable.pokemon492),
            new Poke(R.string.poke493,R.drawable.pokemon493),
    };
}
