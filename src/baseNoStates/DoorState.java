package baseNoStates;

public abstract class DoorState extends Door{

  protected Door door;
  protected String name;

  public DoorState(Door door){
    this.door =  door;
  }
}