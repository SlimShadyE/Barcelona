package com.example.aseel.myfinalapp;

import android.widget.Button;

public class ClubClass {
    private Button back;
    private Button definition;
    private Button trophies;
    private Button top3Comp;
    private Button top3Players;

    public ClubClass(Button back, Button definition, Button trophies, Button top3Comp, Button top3Players) {
        this.back = back;
        this.definition = definition;
        this.trophies = trophies;
        this.top3Comp = top3Comp;
        this.top3Players = top3Players;
    }

    public Button getBack() {
        return back;
    }

    public void setBack(Button back) {
        this.back = back;
    }

    public Button getDefinition() {
        return definition;
    }

    public void setDefinition(Button definition) {
        this.definition = definition;
    }

    public Button getTrophies() {
        return trophies;
    }

    public void setTrophies(Button trophies) {
        this.trophies = trophies;
    }

    public Button getTop3Comp() {
        return top3Comp;
    }

    public void setTop3Comp(Button top3Comp) {
        this.top3Comp = top3Comp;
    }

    public Button getTop3Players() {
        return top3Players;
    }

    public void setTop3Players(Button top3Players) {
        this.top3Players = top3Players;
    }
}
