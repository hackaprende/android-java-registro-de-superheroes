package com.hackaprende.registrodesuperheroes;

import android.os.Parcel;
import android.os.Parcelable;

public class Superhero implements Parcelable {
    private String name;
    private String alterEgo;
    private String bio;
    private float power;

    public Superhero(String name, String alterEgo, String bio, float power) {
        this.name = name;
        this.alterEgo = alterEgo;
        this.bio = bio;
        this.power = power;
    }

    protected Superhero(Parcel in) {
        name = in.readString();
        alterEgo = in.readString();
        bio = in.readString();
        power = in.readFloat();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(alterEgo);
        dest.writeString(bio);
        dest.writeFloat(power);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Superhero> CREATOR = new Creator<Superhero>() {
        @Override
        public Superhero createFromParcel(Parcel in) {
            return new Superhero(in);
        }

        @Override
        public Superhero[] newArray(int size) {
            return new Superhero[size];
        }
    };

    public String getName() {
        return name;
    }

    public String getAlterEgo() {
        return alterEgo;
    }

    public String getBio() {
        return bio;
    }

    public float getPower() {
        return power;
    }
}
