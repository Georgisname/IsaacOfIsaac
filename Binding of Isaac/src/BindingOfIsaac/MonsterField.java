package BindingOfIsaac;
import BindingOfIsaac.CardClasses.Monsters.MonsterCard;

import java.util.LinkedList;


public class MonsterField {
    private LinkedList<MonsterCard>[] storage;
    private int length;

    public MonsterField(){
        this.storage=new LinkedList[2];
        this.length=2;
    }

    public void expand(int i){
        LinkedList<MonsterCard>[] storage=new LinkedList[length+i];
        for(int j=0;j<length;j++){
            storage[j]=this.storage[j];
        }
        this.storage=storage;
        this.length=length+i;
    }

    public void expand(){
        expand(1);
    }
}
