package work.smaragdine.warapp.data;

import java.util.ArrayList;

import work.smaragdine.warapp.R;
import work.smaragdine.warapp.models.Item;

public class Horse {

    public ArrayList<Item> getHorseList() {
        ArrayList<Item> horseList = new ArrayList<>();
        horseList.add(new Item("Sergeant Reckless", R.drawable.sergeant_reckless,1));
        horseList.add(new Item("Comanche",R.drawable.comanche,1));
        horseList.add(new Item("Cincinnati",R.drawable.cincinnati,1));
        return horseList;
    }

}
