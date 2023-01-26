package net.androidbootcamp.pokedextracker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class JohtoAdapter extends BaseAdapter {
    private final Context mContext;
    private final Poke[] pokes;

    public JohtoAdapter(Context context, Poke[] pokes) {
        this.mContext = context;
        this.pokes = pokes;
    }

    @Override
    public int getCount() {
        return pokes.length;
    }

    @Override
    public long getItemId(int position){
        return 0;
    }

    @Override
    public Object getItem(int position){
        return null;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // 1
        final Poke poke = pokes[position];

        // 2
        if (convertView == null) {
            final LayoutInflater layoutInflater = LayoutInflater.from(mContext);
            convertView = layoutInflater.inflate(R.layout.linearlayout_poke, null);
        }

        // 3
        final ImageView imageView = (ImageView)convertView.findViewById(R.id.imageview_cover_art);
        final TextView nameTextView = (TextView)convertView.findViewById(R.id.textview_poke_name);
        final ImageView imageViewFavorite = (ImageView)convertView.findViewById(R.id.imageview_favorite);

        // 4
        imageView.setImageResource(poke.getImageResource());
        nameTextView.setText(mContext.getString(poke.getName()));
        imageViewFavorite.setImageResource(
                poke.getIsFavorite() ? R.drawable.star_enabled : R.drawable.star_disabled);

        return convertView;
    }
}
