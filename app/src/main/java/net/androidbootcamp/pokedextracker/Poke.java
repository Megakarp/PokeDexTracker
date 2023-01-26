package net.androidbootcamp.pokedextracker;

public class Poke {
    private final int name;
    private final int imageResource;
    private boolean isFavorite = false;
    public Poke(int name, int imageResource) {

        this.name = name;
        this.imageResource = imageResource;
    }

    public int getName() {
        return name;
    }

    public int getImageResource() {
        return imageResource;
    }

    public boolean getIsFavorite() {
        return isFavorite;
    }
    public void setIsFavorite(boolean isFavorite) {
        this.isFavorite = isFavorite;
    }

    public void toggleFavorite() {
        isFavorite = !isFavorite;
    }

}
