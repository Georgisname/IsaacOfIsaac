package BindingOfIsaac;

import BindingOfIsaac.CardClasses.CharacterCard;

public class PlayerPool {
    PlayerPointer Player1;
    PlayerPointer Player2;
    PlayerPointer Player3;
    PlayerPointer Player4;
    PlayerPointer active=Player1;

    public int skip1=0;
    public int skip2=0;
    public int skip3=0;
    public int skip4=0;

    public PlayerPool(int i, Field field){
        Deck deck=new Deck();
        deck.supplyCharacterDeck();
        Player1=new PlayerPointer(new Player((CharacterCard)deck.draw(),field),this);
        Player2=new PlayerPointer(new Player((CharacterCard)deck.draw(),field),this);

        switch(i){
            case 2:{
                Player1.setNext(Player2);
                Player1.setPrev(Player2);
                Player2.setNext(Player1);
                Player2.setPrev(Player2);
                break;
            }
            case 3:{
                Player3=new PlayerPointer(new Player((CharacterCard)deck.draw(),field),this);
                Player1.setNext(Player2);
                Player2.setNext(Player3);
                Player3.setNext(Player1);
                Player1.setPrev(Player3);
                Player2.setPrev(Player1);
                Player3.setPrev(Player2);
                break;
            }
            case 4:{
                Player3=new PlayerPointer(new Player((CharacterCard)deck.draw(),field),this);
                Player3=new PlayerPointer(new Player((CharacterCard)deck.draw(),field),this);
                Player1.setNext(Player2);
                Player2.setNext(Player3);
                Player3.setNext(Player4);
                Player4.setNext(Player1);
                Player1.setPrev(Player4);
                Player2.setPrev(Player1);
                Player3.setPrev(Player2);
                Player4.setPrev(Player3);
            }
        }
    }

    public void setActive(int i){
        switch(i){
            case 1:{active=Player1;break;}
            case 2:{active=Player2; break;}
            case 3:{active=Player3; break;}
            case 4:{active=Player4; break;}
        }
    }

    public void setActive(Player player){
        active=player.getPointer();
    }
    public int getSkip(PlayerPointer pointer){
        if(Player1==pointer) return skip1;
        if(Player2==pointer) return skip2;
        if(Player3==pointer) return skip3;
        if(Player4==pointer) return skip4;
        throw new IndexOutOfBoundsException();
    }

    public PlayerPointer getActive(){return active;}

    public void amendSkip(Player player,boolean skip){
        PlayerPointer current=player.getPointer();
        if(skip){
            if(current==Player1) skip1--;
            if(current==Player2) skip2--;
            if(current==Player3) skip3--;
            if(current==Player4) skip4--;
        }
        else{
            if(current==Player1) skip1++;
            if(current==Player2) skip2++;
            if(current==Player3) skip3++;
            if(current==Player4) skip4++;
        }
    }
    public void skip(Player player){
        amendSkip(player, true);
    }
    public void bonus(Player player){
        amendSkip(player, false);
    }


    public void passTurn(){
        if(getSkip(active)>0){
            skip(active.getPlayer());
            return;
        }
        active=active.getNext();
        if(getSkip(active.getNext())<0){
            bonus(active.getNext().getPlayer());
            passTurn();
        }
    }
}
