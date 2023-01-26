package net.androidbootcamp.pokedextracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class hoennDex extends AppCompatActivity {
    private static final String favoritedPokeNamesKey3 = "favoritedPokeNamesKey";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoenn_dex);
        GridView hoennGrid = (GridView)findViewById(R.id.hoennGrid);
        final ImageAdapter hoennAdapter = new ImageAdapter(this, pokes);
        hoennGrid.setAdapter(hoennAdapter);
        hoennGrid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView parent, View view, int position, long id) {
                Poke poke = pokes[position];
                poke.toggleFavorite();
                // This tells the kanto to redraw itself
                // in turn calling your ImageAdapter's getView method again for each cell
                hoennAdapter.notifyDataSetChanged();
            }
        });
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        // construct a list of pokemon you've caught
        final ArrayList<Integer> favoritedPokeNames3 = new ArrayList<>();
        for (Poke poke : pokes) {
            if (poke.getIsFavorite()) {
                favoritedPokeNames3.add(poke.getName());
            }
        }

        // save that list to outState for later
        outState.putIntegerArrayList(favoritedPokeNamesKey3, favoritedPokeNames3);
    }
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        // get our previously saved list of pokemon you've caught
        final ArrayList<Integer> favoritedPokeNames3 =
                savedInstanceState.getIntegerArrayList(favoritedPokeNamesKey3);

        // look at all of your books and figure out which are the favorites
        for (int pokeName : favoritedPokeNames3) {
            for (Poke poke : pokes) {
                if (poke.getName() == pokeName) {
                    poke.setIsFavorite(true);
                    break;
                }
            }
        }
    }

    private Poke[] pokes = {
            new Poke(R.string.poke252,R.drawable.pokemon252),
            new Poke(R.string.poke253,R.drawable.pokemon253),
            new Poke(R.string.poke254,R.drawable.pokemon254),
            new Poke(R.string.poke255,R.drawable.pokemon255),
            new Poke(R.string.poke256,R.drawable.pokemon256),
            new Poke(R.string.poke257,R.drawable.pokemon257),
            new Poke(R.string.poke258,R.drawable.pokemon258),
            new Poke(R.string.poke259,R.drawable.pokemon259),
            new Poke(R.string.poke260,R.drawable.pokemon260),
            new Poke(R.string.poke261,R.drawable.pokemon261),
            new Poke(R.string.poke262,R.drawable.pokemon262),
            new Poke(R.string.poke263,R.drawable.pokemon263),
            new Poke(R.string.poke264,R.drawable.pokemon264),
            new Poke(R.string.poke265,R.drawable.pokemon265),
            new Poke(R.string.poke266,R.drawable.pokemon266),
            new Poke(R.string.poke267,R.drawable.pokemon267),
            new Poke(R.string.poke268,R.drawable.pokemon268),
            new Poke(R.string.poke269,R.drawable.pokemon269),
            new Poke(R.string.poke270,R.drawable.pokemon270),
            new Poke(R.string.poke271,R.drawable.pokemon271),
            new Poke(R.string.poke272,R.drawable.pokemon272),
            new Poke(R.string.poke273,R.drawable.pokemon273),
            new Poke(R.string.poke274,R.drawable.pokemon274),
            new Poke(R.string.poke275,R.drawable.pokemon275),
            new Poke(R.string.poke276,R.drawable.pokemon276),
            new Poke(R.string.poke277,R.drawable.pokemon277),
            new Poke(R.string.poke278,R.drawable.pokemon278),
            new Poke(R.string.poke279,R.drawable.pokemon279),
            new Poke(R.string.poke280,R.drawable.pokemon280),
            new Poke(R.string.poke281,R.drawable.pokemon281),
            new Poke(R.string.poke282,R.drawable.pokemon282),
            new Poke(R.string.poke283,R.drawable.pokemon283),
            new Poke(R.string.poke284,R.drawable.pokemon284),
            new Poke(R.string.poke285,R.drawable.pokemon285),
            new Poke(R.string.poke286,R.drawable.pokemon286),
            new Poke(R.string.poke287,R.drawable.pokemon287),
            new Poke(R.string.poke288,R.drawable.pokemon288),
            new Poke(R.string.poke289,R.drawable.pokemon289),
            new Poke(R.string.poke290,R.drawable.pokemon290),
            new Poke(R.string.poke291,R.drawable.pokemon291),
            new Poke(R.string.poke292,R.drawable.pokemon292),
            new Poke(R.string.poke293,R.drawable.pokemon293),
            new Poke(R.string.poke294,R.drawable.pokemon294),
            new Poke(R.string.poke295,R.drawable.pokemon295),
            new Poke(R.string.poke296,R.drawable.pokemon296),
            new Poke(R.string.poke297,R.drawable.pokemon297),
            new Poke(R.string.poke298,R.drawable.pokemon298),
            new Poke(R.string.poke299,R.drawable.pokemon299),
            new Poke(R.string.poke300,R.drawable.pokemon300),
            new Poke(R.string.poke301,R.drawable.pokemon301),
            new Poke(R.string.poke302,R.drawable.pokemon302),
            new Poke(R.string.poke303,R.drawable.pokemon303),
            new Poke(R.string.poke304,R.drawable.pokemon304),
            new Poke(R.string.poke305,R.drawable.pokemon305),
            new Poke(R.string.poke306,R.drawable.pokemon306),
            new Poke(R.string.poke307,R.drawable.pokemon307),
            new Poke(R.string.poke308,R.drawable.pokemon308),
            new Poke(R.string.poke309,R.drawable.pokemon309),
            new Poke(R.string.poke310,R.drawable.pokemon310),
            new Poke(R.string.poke311,R.drawable.pokemon311),
            new Poke(R.string.poke312,R.drawable.pokemon312),
            new Poke(R.string.poke313,R.drawable.pokemon313),
            new Poke(R.string.poke314,R.drawable.pokemon314),
            new Poke(R.string.poke315,R.drawable.pokemon315),
            new Poke(R.string.poke316,R.drawable.pokemon316),
            new Poke(R.string.poke317,R.drawable.pokemon317),
            new Poke(R.string.poke318,R.drawable.pokemon318),
            new Poke(R.string.poke319,R.drawable.pokemon319),
            new Poke(R.string.poke320,R.drawable.pokemon320),
            new Poke(R.string.poke321,R.drawable.pokemon321),
            new Poke(R.string.poke322,R.drawable.pokemon322),
            new Poke(R.string.poke323,R.drawable.pokemon323),
            new Poke(R.string.poke324,R.drawable.pokemon324),
            new Poke(R.string.poke325,R.drawable.pokemon325),
            new Poke(R.string.poke326,R.drawable.pokemon326),
            new Poke(R.string.poke327,R.drawable.pokemon327),
            new Poke(R.string.poke328,R.drawable.pokemon328),
            new Poke(R.string.poke329,R.drawable.pokemon329),
            new Poke(R.string.poke330,R.drawable.pokemon330),
            new Poke(R.string.poke331,R.drawable.pokemon331),
            new Poke(R.string.poke332,R.drawable.pokemon332),
            new Poke(R.string.poke333,R.drawable.pokemon333),
            new Poke(R.string.poke334,R.drawable.pokemon334),
            new Poke(R.string.poke335,R.drawable.pokemon335),
            new Poke(R.string.poke336,R.drawable.pokemon336),
            new Poke(R.string.poke337,R.drawable.pokemon337),
            new Poke(R.string.poke338,R.drawable.pokemon338),
            new Poke(R.string.poke339,R.drawable.pokemon339),
            new Poke(R.string.poke340,R.drawable.pokemon340),
            new Poke(R.string.poke341,R.drawable.pokemon341),
            new Poke(R.string.poke342,R.drawable.pokemon342),
            new Poke(R.string.poke343,R.drawable.pokemon343),
            new Poke(R.string.poke344,R.drawable.pokemon344),
            new Poke(R.string.poke345,R.drawable.pokemon345),
            new Poke(R.string.poke346,R.drawable.pokemon346),
            new Poke(R.string.poke347,R.drawable.pokemon347),
            new Poke(R.string.poke348,R.drawable.pokemon348),
            new Poke(R.string.poke349,R.drawable.pokemon349),
            new Poke(R.string.poke350,R.drawable.pokemon350),
            new Poke(R.string.poke351,R.drawable.pokemon351),
            new Poke(R.string.poke352,R.drawable.pokemon352),
            new Poke(R.string.poke353,R.drawable.pokemon353),
            new Poke(R.string.poke354,R.drawable.pokemon354),
            new Poke(R.string.poke355,R.drawable.pokemon355),
            new Poke(R.string.poke356,R.drawable.pokemon356),
            new Poke(R.string.poke357,R.drawable.pokemon357),
            new Poke(R.string.poke358,R.drawable.pokemon358),
            new Poke(R.string.poke359,R.drawable.pokemon359),
            new Poke(R.string.poke360,R.drawable.pokemon360),
            new Poke(R.string.poke361,R.drawable.pokemon361),
            new Poke(R.string.poke362,R.drawable.pokemon362),
            new Poke(R.string.poke363,R.drawable.pokemon363),
            new Poke(R.string.poke364,R.drawable.pokemon364),
            new Poke(R.string.poke365,R.drawable.pokemon365),
            new Poke(R.string.poke366,R.drawable.pokemon366),
            new Poke(R.string.poke367,R.drawable.pokemon367),
            new Poke(R.string.poke368,R.drawable.pokemon368),
            new Poke(R.string.poke369,R.drawable.pokemon369),
            new Poke(R.string.poke370,R.drawable.pokemon370),
            new Poke(R.string.poke371,R.drawable.pokemon371),
            new Poke(R.string.poke372,R.drawable.pokemon372),
            new Poke(R.string.poke373,R.drawable.pokemon373),
            new Poke(R.string.poke374,R.drawable.pokemon374),
            new Poke(R.string.poke375,R.drawable.pokemon375),
            new Poke(R.string.poke376,R.drawable.pokemon376),
            new Poke(R.string.poke377,R.drawable.pokemon377),
            new Poke(R.string.poke378,R.drawable.pokemon378),
            new Poke(R.string.poke379,R.drawable.pokemon379),
            new Poke(R.string.poke380,R.drawable.pokemon380),
            new Poke(R.string.poke381,R.drawable.pokemon381),
            new Poke(R.string.poke382,R.drawable.pokemon382),
            new Poke(R.string.poke383,R.drawable.pokemon383),
            new Poke(R.string.poke384,R.drawable.pokemon384),
            new Poke(R.string.poke385,R.drawable.pokemon385),
            new Poke(R.string.poke386,R.drawable.pokemon386),
    };
}
