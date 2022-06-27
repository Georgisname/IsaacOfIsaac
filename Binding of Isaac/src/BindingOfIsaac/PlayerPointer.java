package BindingOfIsaac;

public class PlayerPointer {

    private final PlayerPool pool;
    private final Player player;
    private PlayerPointer next;
    private PlayerPointer prev;

    public PlayerPointer(Player player, PlayerPool pool){
        this.player=player;
        this.pool=pool;
        this.player.setPointer(this);
    }
    public void setNext(PlayerPointer player){
        this.next=player;
    }
    public void setPrev(PlayerPointer player){
        this.prev=player;
    }

    public PlayerPointer getNext(){
        return next;
    }
    public PlayerPointer getPrev(){
        return prev;
    }
    public Player getPlayer(){
        return player;
    }
}
