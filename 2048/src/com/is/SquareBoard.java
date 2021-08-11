package com.is;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SquareBoard extends Board{

    int size;

    public SquareBoard(int size){
        this.weigh = this.height = size*size;
    }

    @Override
    void fillBoard(List<Integer> list) {
        for (int i = 0; i < this.height; i++)
        {
            for (int j = 0; j < this.weigh; j++)
            {
                Integer boardItem = list.get(i);
                board.put(new Key(i, j), boardItem);
            }
        }
    }

    @Override
    List<Key> availableSpace() {
        List<Key> nullList = new ArrayList<Key>();
//        for (Key key: board.keySet()){
//            if (key.getValue() == null) {
//                nullList.add(key);
//            }
//        }
        return nullList;
    }

    @Override
    void addItem(Key key, Integer value) {
        ArrayList<Key> listKey = new ArrayList<>();
        ArrayList<Integer> listInt  = new ArrayList<>();
        listKey.add(key);
        listInt.add(value);
    }

    @Override
    Key getKey(int i, int j) {
       return new Key(i,j) ;
    }

    @Override
    Integer getValue(Key key) {
       return new Integer(String.valueOf((key)));
    }

    @Override
    List<Key> getColumn(int j) {
        List<Key>list = new ArrayList<>();
        for (j = 0; j < this.weigh; j++){
            list.add(getKey(0,j));
        }
        return list;
    }

    @Override
    List<Key> getRow(int i) {
        List<Key>list = new ArrayList<>();
        for(i = 0; i < this.height; i++){
            list.add(getKey(i,0));
        }
        return list;
    }

    @Override
    boolean hasValue(Integer value) {
        return true;
    }

    @Override
    List<Integer> getValues(List<Key> keys) {
        return null;
    }
}
