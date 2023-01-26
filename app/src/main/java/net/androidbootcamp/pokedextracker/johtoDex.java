package net.androidbootcamp.pokedextracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class johtoDex extends AppCompatActivity {
    private static final String favoritedPokeNamesKey2 = "favoritedPokeNamesKey2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_johto_dex);
        GridView johtoGrid = (GridView)findViewById(R.id.johtoGrid);
        final ImageAdapter johtoAdapter = new ImageAdapter(this, pokes);
        johtoGrid.setAdapter(johtoAdapter);

        johtoGrid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView parent, View view, int position, long id) {
                Poke poke = pokes[position];
                poke.toggleFavorite();

                // This tells the kanto to redraw itself
                // in turn calling your ImageAdapter's getView method again for each cell
                johtoAdapter.notifyDataSetChanged();
            }
        });

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        // construct a list of pokemon you've caught
        final ArrayList<Integer> favoritedPokeNames2 = new ArrayList<>();
        for (Poke poke : pokes) {
            if (poke.getIsFavorite()) {
                favoritedPokeNames2.add(poke.getName());
            }
        }

        // save that list to outState for later
        outState.putIntegerArrayList(favoritedPokeNamesKey2, favoritedPokeNames2);
    }
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        // get our previously saved list of pokemon you've caught
        final ArrayList<Integer> favoritedPokeNames2 =
                savedInstanceState.getIntegerArrayList(favoritedPokeNamesKey2);

        // look at all of your books and figure out which are the favorites
        for (int pokeName : favoritedPokeNames2) {
            for (Poke poke : pokes) {
                if (poke.getName() == pokeName) {
                    poke.setIsFavorite(true);
                    break;
                }
            }
        }
    }

    private Poke[] pokes = {
            new Poke(R.string.poke152,R.drawable.pokemon152),
            new Poke(R.string.poke153,R.drawable.pokemon153),
            new Poke(R.string.poke154,R.drawable.pokemon154),
            new Poke(R.string.poke155,R.drawable.pokemon155),
            new Poke(R.string.poke156,R.drawable.pokemon156),
            new Poke(R.string.poke157,R.drawable.pokemon157),
            new Poke(R.string.poke158,R.drawable.pokemon158),
            new Poke(R.string.poke159,R.drawable.pokemon159),
            new Poke(R.string.poke160,R.drawable.pokemon160),
            new Poke(R.string.poke161,R.drawable.pokemon161),
            new Poke(R.string.poke162,R.drawable.pokemon162),
            new Poke(R.string.poke163,R.drawable.pokemon163),
            new Poke(R.string.poke164,R.drawable.pokemon164),
            new Poke(R.string.poke165,R.drawable.pokemon165),
            new Poke(R.string.poke166,R.drawable.pokemon166),
            new Poke(R.string.poke167,R.drawable.pokemon167),
            new Poke(R.string.poke168,R.drawable.pokemon168),
            new Poke(R.string.poke169,R.drawable.pokemon169),
            new Poke(R.string.poke170,R.drawable.pokemon170),
            new Poke(R.string.poke171,R.drawable.pokemon171),
            new Poke(R.string.poke172,R.drawable.pokemon172),
            new Poke(R.string.poke173,R.drawable.pokemon173),
            new Poke(R.string.poke174,R.drawable.pokemon174),
            new Poke(R.string.poke175,R.drawable.pokemon175),
            new Poke(R.string.poke176,R.drawable.pokemon176),
            new Poke(R.string.poke177,R.drawable.pokemon177),
            new Poke(R.string.poke178,R.drawable.pokemon178),
            new Poke(R.string.poke179,R.drawable.pokemon179),
            new Poke(R.string.poke180,R.drawable.pokemon180),
            new Poke(R.string.poke181,R.drawable.pokemon181),
            new Poke(R.string.poke182,R.drawable.pokemon182),
            new Poke(R.string.poke183,R.drawable.pokemon183),
            new Poke(R.string.poke184,R.drawable.pokemon184),
            new Poke(R.string.poke185,R.drawable.pokemon185),
            new Poke(R.string.poke186,R.drawable.pokemon186),
            new Poke(R.string.poke187,R.drawable.pokemon187),
            new Poke(R.string.poke188,R.drawable.pokemon188),
            new Poke(R.string.poke189,R.drawable.pokemon189),
            new Poke(R.string.poke190,R.drawable.pokemon190),
            new Poke(R.string.poke191,R.drawable.pokemon191),
            new Poke(R.string.poke192,R.drawable.pokemon192),
            new Poke(R.string.poke193,R.drawable.pokemon193),
            new Poke(R.string.poke194,R.drawable.pokemon194),
            new Poke(R.string.poke195,R.drawable.pokemon195),
            new Poke(R.string.poke196,R.drawable.pokemon196),
            new Poke(R.string.poke197,R.drawable.pokemon197),
            new Poke(R.string.poke198,R.drawable.pokemon198),
            new Poke(R.string.poke199,R.drawable.pokemon199),
            new Poke(R.string.poke200,R.drawable.pokemon200),
            new Poke(R.string.poke201,R.drawable.pokemon201),
            new Poke(R.string.poke202,R.drawable.pokemon202),
            new Poke(R.string.poke203,R.drawable.pokemon203),
            new Poke(R.string.poke204,R.drawable.pokemon204),
            new Poke(R.string.poke205,R.drawable.pokemon205),
            new Poke(R.string.poke206,R.drawable.pokemon206),
            new Poke(R.string.poke207,R.drawable.pokemon207),
            new Poke(R.string.poke208,R.drawable.pokemon208),
            new Poke(R.string.poke209,R.drawable.pokemon209),
            new Poke(R.string.poke210,R.drawable.pokemon210),
            new Poke(R.string.poke211,R.drawable.pokemon211),
            new Poke(R.string.poke212,R.drawable.pokemon212),
            new Poke(R.string.poke213,R.drawable.pokemon213),
            new Poke(R.string.poke214,R.drawable.pokemon214),
            new Poke(R.string.poke215,R.drawable.pokemon215),
            new Poke(R.string.poke216,R.drawable.pokemon216),
            new Poke(R.string.poke217,R.drawable.pokemon217),
            new Poke(R.string.poke218,R.drawable.pokemon218),
            new Poke(R.string.poke219,R.drawable.pokemon219),
            new Poke(R.string.poke220,R.drawable.pokemon220),
            new Poke(R.string.poke221,R.drawable.pokemon221),
            new Poke(R.string.poke222,R.drawable.pokemon222),
            new Poke(R.string.poke223,R.drawable.pokemon223),
            new Poke(R.string.poke224,R.drawable.pokemon224),
            new Poke(R.string.poke225,R.drawable.pokemon225),
            new Poke(R.string.poke226,R.drawable.pokemon226),
            new Poke(R.string.poke227,R.drawable.pokemon227),
            new Poke(R.string.poke228,R.drawable.pokemon228),
            new Poke(R.string.poke229,R.drawable.pokemon229),
            new Poke(R.string.poke230,R.drawable.pokemon230),
            new Poke(R.string.poke231,R.drawable.pokemon231),
            new Poke(R.string.poke232,R.drawable.pokemon232),
            new Poke(R.string.poke233,R.drawable.pokemon233),
            new Poke(R.string.poke234,R.drawable.pokemon234),
            new Poke(R.string.poke235,R.drawable.pokemon235),
            new Poke(R.string.poke236,R.drawable.pokemon236),
            new Poke(R.string.poke237,R.drawable.pokemon237),
            new Poke(R.string.poke238,R.drawable.pokemon238),
            new Poke(R.string.poke239,R.drawable.pokemon239),
            new Poke(R.string.poke240,R.drawable.pokemon240),
            new Poke(R.string.poke241,R.drawable.pokemon241),
            new Poke(R.string.poke242,R.drawable.pokemon242),
            new Poke(R.string.poke243,R.drawable.pokemon243),
            new Poke(R.string.poke244,R.drawable.pokemon244),
            new Poke(R.string.poke245,R.drawable.pokemon245),
            new Poke(R.string.poke246,R.drawable.pokemon246),
            new Poke(R.string.poke247,R.drawable.pokemon247),
            new Poke(R.string.poke248,R.drawable.pokemon248),
            new Poke(R.string.poke249,R.drawable.pokemon249),
            new Poke(R.string.poke250,R.drawable.pokemon250),
            new Poke(R.string.poke251,R.drawable.pokemon251),
    };
}
