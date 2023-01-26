package net.androidbootcamp.pokedextracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class kantoDex extends AppCompatActivity {
    private static final String favoritedPokeNamesKey = "favoritedPokeNamesKey";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kanto_dex);
        GridView kantoGrid = (GridView)findViewById(R.id.kantoGrid);
        final ImageAdapter kantoAdapter = new ImageAdapter(this, pokes);
        kantoGrid.setAdapter(kantoAdapter);
        kantoGrid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView parent, View view, int position, long id) {
                Poke poke = pokes[position];
                poke.toggleFavorite();
                // This tells the kanto to redraw itself
                // in turn calling your ImageAdapter's getView method again for each cell
                kantoAdapter.notifyDataSetChanged();
            }
        });

    }



    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        // construct a list of pokemon you've caught
        final ArrayList<Integer> favoritedPokeNames = new ArrayList<>();
        for (Poke poke : pokes) {
            if (poke.getIsFavorite()) {
                favoritedPokeNames.add(poke.getName());
            }
        }

        // save that list to outState for later
        outState.putIntegerArrayList(favoritedPokeNamesKey, favoritedPokeNames);
    }
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        // get our previously saved list of pokemon you've caught
        final ArrayList<Integer> favoritedPokeNames =
                savedInstanceState.getIntegerArrayList(favoritedPokeNamesKey);

        // look at all of your books and figure out which are the favorites
        for (int pokeName : favoritedPokeNames) {
            for (Poke poke : pokes) {
                if (poke.getName() == pokeName) {
                    poke.setIsFavorite(true);
                    break;
                }
            }
        }
    }

    private Poke[] pokes = {
            new Poke(R.string.poke1,R.drawable.pokemon1),
            new Poke(R.string.poke2,R.drawable.pokemon2),
            new Poke(R.string.poke3,R.drawable.pokemon3),
            new Poke(R.string.poke4,R.drawable.pokemon4),
            new Poke(R.string.poke5,R.drawable.pokemon5),
            new Poke(R.string.poke6,R.drawable.pokemon6),
            new Poke(R.string.poke7,R.drawable.pokemon7),
            new Poke(R.string.poke8,R.drawable.pokemon8),
            new Poke(R.string.poke9,R.drawable.pokemon9),
            new Poke(R.string.poke10,R.drawable.pokemon10),
            new Poke(R.string.poke11,R.drawable.pokemon11),
            new Poke(R.string.poke12,R.drawable.pokemon12),
            new Poke(R.string.poke13,R.drawable.pokemon13),
            new Poke(R.string.poke14,R.drawable.pokemon14),
            new Poke(R.string.poke15,R.drawable.pokemon15),
            new Poke(R.string.poke16,R.drawable.pokemon16),
            new Poke(R.string.poke17,R.drawable.pokemon17),
            new Poke(R.string.poke18,R.drawable.pokemon18),
            new Poke(R.string.poke19,R.drawable.pokemon19),
            new Poke(R.string.poke20,R.drawable.pokemon20),
            new Poke(R.string.poke21,R.drawable.pokemon21),
            new Poke(R.string.poke22,R.drawable.pokemon22),
            new Poke(R.string.poke23,R.drawable.pokemon23),
            new Poke(R.string.poke24,R.drawable.pokemon24),
            new Poke(R.string.poke25,R.drawable.pokemon25),
            new Poke(R.string.poke26,R.drawable.pokemon26),
            new Poke(R.string.poke27,R.drawable.pokemon27),
            new Poke(R.string.poke28,R.drawable.pokemon28),
            new Poke(R.string.poke29,R.drawable.pokemon29),
            new Poke(R.string.poke30,R.drawable.pokemon30),
            new Poke(R.string.poke31,R.drawable.pokemon31),
            new Poke(R.string.poke32,R.drawable.pokemon32),
            new Poke(R.string.poke33,R.drawable.pokemon33),
            new Poke(R.string.poke34,R.drawable.pokemon34),
            new Poke(R.string.poke35,R.drawable.pokemon35),
            new Poke(R.string.poke36,R.drawable.pokemon36),
            new Poke(R.string.poke37,R.drawable.pokemon37),
            new Poke(R.string.poke38,R.drawable.pokemon38),
            new Poke(R.string.poke39,R.drawable.pokemon39),
            new Poke(R.string.poke40,R.drawable.pokemon40),
            new Poke(R.string.poke41,R.drawable.pokemon41),
            new Poke(R.string.poke42,R.drawable.pokemon42),
            new Poke(R.string.poke43,R.drawable.pokemon43),
            new Poke(R.string.poke44,R.drawable.pokemon44),
            new Poke(R.string.poke45,R.drawable.pokemon45),
            new Poke(R.string.poke46,R.drawable.pokemon46),
            new Poke(R.string.poke47,R.drawable.pokemon47),
            new Poke(R.string.poke48,R.drawable.pokemon48),
            new Poke(R.string.poke49,R.drawable.pokemon49),
            new Poke(R.string.poke50,R.drawable.pokemon50),
            new Poke(R.string.poke51,R.drawable.pokemon51),
            new Poke(R.string.poke52,R.drawable.pokemon52),
            new Poke(R.string.poke53,R.drawable.pokemon53),
            new Poke(R.string.poke54,R.drawable.pokemon54),
            new Poke(R.string.poke55,R.drawable.pokemon55),
            new Poke(R.string.poke56,R.drawable.pokemon56),
            new Poke(R.string.poke57,R.drawable.pokemon57),
            new Poke(R.string.poke58,R.drawable.pokemon58),
            new Poke(R.string.poke59,R.drawable.pokemon59),
            new Poke(R.string.poke60,R.drawable.pokemon60),
            new Poke(R.string.poke61,R.drawable.pokemon61),
            new Poke(R.string.poke62,R.drawable.pokemon62),
            new Poke(R.string.poke63,R.drawable.pokemon63),
            new Poke(R.string.poke64,R.drawable.pokemon64),
            new Poke(R.string.poke65,R.drawable.pokemon65),
            new Poke(R.string.poke66,R.drawable.pokemon66),
            new Poke(R.string.poke67,R.drawable.pokemon67),
            new Poke(R.string.poke68,R.drawable.pokemon68),
            new Poke(R.string.poke69,R.drawable.pokemon69),
            new Poke(R.string.poke70,R.drawable.pokemon70),
            new Poke(R.string.poke71,R.drawable.pokemon71),
            new Poke(R.string.poke72,R.drawable.pokemon72),
            new Poke(R.string.poke73,R.drawable.pokemon73),
            new Poke(R.string.poke74,R.drawable.pokemon74),
            new Poke(R.string.poke75,R.drawable.pokemon75),
            new Poke(R.string.poke76,R.drawable.pokemon76),
            new Poke(R.string.poke77,R.drawable.pokemon77),
            new Poke(R.string.poke78,R.drawable.pokemon78),
            new Poke(R.string.poke79,R.drawable.pokemon79),
            new Poke(R.string.poke80,R.drawable.pokemon80),
            new Poke(R.string.poke81,R.drawable.pokemon81),
            new Poke(R.string.poke82,R.drawable.pokemon82),
            new Poke(R.string.poke83,R.drawable.pokemon83),
            new Poke(R.string.poke84,R.drawable.pokemon84),
            new Poke(R.string.poke85,R.drawable.pokemon85),
            new Poke(R.string.poke86,R.drawable.pokemon86),
            new Poke(R.string.poke87,R.drawable.pokemon87),
            new Poke(R.string.poke88,R.drawable.pokemon88),
            new Poke(R.string.poke89,R.drawable.pokemon89),
            new Poke(R.string.poke90,R.drawable.pokemon90),
            new Poke(R.string.poke91,R.drawable.pokemon91),
            new Poke(R.string.poke92,R.drawable.pokemon92),
            new Poke(R.string.poke93,R.drawable.pokemon93),
            new Poke(R.string.poke94,R.drawable.pokemon94),
            new Poke(R.string.poke95,R.drawable.pokemon95),
            new Poke(R.string.poke96,R.drawable.pokemon96),
            new Poke(R.string.poke97,R.drawable.pokemon97),
            new Poke(R.string.poke98,R.drawable.pokemon98),
            new Poke(R.string.poke99,R.drawable.pokemon99),
            new Poke(R.string.poke100,R.drawable.pokemon100),
            new Poke(R.string.poke101,R.drawable.pokemon101),
            new Poke(R.string.poke102,R.drawable.pokemon102),
            new Poke(R.string.poke103,R.drawable.pokemon103),
            new Poke(R.string.poke104,R.drawable.pokemon104),
            new Poke(R.string.poke105,R.drawable.pokemon105),
            new Poke(R.string.poke106,R.drawable.pokemon106),
            new Poke(R.string.poke107,R.drawable.pokemon107),
            new Poke(R.string.poke108,R.drawable.pokemon108),
            new Poke(R.string.poke109,R.drawable.pokemon109),
            new Poke(R.string.poke110,R.drawable.pokemon110),
            new Poke(R.string.poke111,R.drawable.pokemon111),
            new Poke(R.string.poke112,R.drawable.pokemon112),
            new Poke(R.string.poke113,R.drawable.pokemon113),
            new Poke(R.string.poke114,R.drawable.pokemon114),
            new Poke(R.string.poke115,R.drawable.pokemon115),
            new Poke(R.string.poke116,R.drawable.pokemon116),
            new Poke(R.string.poke117,R.drawable.pokemon117),
            new Poke(R.string.poke118,R.drawable.pokemon118),
            new Poke(R.string.poke119,R.drawable.pokemon119),
            new Poke(R.string.poke120,R.drawable.pokemon120),
            new Poke(R.string.poke121,R.drawable.pokemon121),
            new Poke(R.string.poke122,R.drawable.pokemon122),
            new Poke(R.string.poke123,R.drawable.pokemon123),
            new Poke(R.string.poke124,R.drawable.pokemon124),
            new Poke(R.string.poke125,R.drawable.pokemon125),
            new Poke(R.string.poke126,R.drawable.pokemon126),
            new Poke(R.string.poke127,R.drawable.pokemon127),
            new Poke(R.string.poke128,R.drawable.pokemon128),
            new Poke(R.string.poke129,R.drawable.pokemon129),
            new Poke(R.string.poke130,R.drawable.pokemon130),
            new Poke(R.string.poke131,R.drawable.pokemon131),
            new Poke(R.string.poke132,R.drawable.pokemon132),
            new Poke(R.string.poke133,R.drawable.pokemon133),
            new Poke(R.string.poke134,R.drawable.pokemon134),
            new Poke(R.string.poke135,R.drawable.pokemon135),
            new Poke(R.string.poke136,R.drawable.pokemon136),
            new Poke(R.string.poke137,R.drawable.pokemon137),
            new Poke(R.string.poke138,R.drawable.pokemon138),
            new Poke(R.string.poke139,R.drawable.pokemon139),
            new Poke(R.string.poke140,R.drawable.pokemon140),
            new Poke(R.string.poke141,R.drawable.pokemon141),
            new Poke(R.string.poke142,R.drawable.pokemon142),
            new Poke(R.string.poke143,R.drawable.pokemon143),
            new Poke(R.string.poke144,R.drawable.pokemon144),
            new Poke(R.string.poke145,R.drawable.pokemon145),
            new Poke(R.string.poke146,R.drawable.pokemon146),
            new Poke(R.string.poke147,R.drawable.pokemon147),
            new Poke(R.string.poke148,R.drawable.pokemon148),
            new Poke(R.string.poke149,R.drawable.pokemon149),
            new Poke(R.string.poke150,R.drawable.pokemon150),
            new Poke(R.string.poke151,R.drawable.pokemon151),
    };
}

