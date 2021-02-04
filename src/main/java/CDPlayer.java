public class CDPlayer extends Component {
    private int track;
    public CDPlayer(String make,String model){
        super(make,model);
        this.track=1;
    }
    public String play(){
        return "Oh, what a shiny disk";
    }
    public int getTrack(){
        return this.track;
    }
    public void advanceTrack(){
        this.track+=1;
    }
    public void reverseTrack(){
        this.track-=1;
    }
}

