package baseNoStates;

public abstract class DoorState{

  protected Door door;
  protected String name;

  public DoorState(Door door){
    this.door = door;
    this.name = door.getId();
  }
}