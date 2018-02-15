package dev.amoeba.moexplorer.model;

import java.util.List;

import dev.amoeba.moexplorer.fragment.RootsFragment.*;

/**
 * Created by HaKr on 07/08/16.
 */

public class GroupInfo {
    public String label;
    public List<Item> itemList;

    public GroupInfo(String text, List<Item> list){
        label = text;
        itemList = list;
    }
}
