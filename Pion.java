public class Pion {

  private int x;
  private int y;


  public int getX(){
    return this.x;
  }

  public int getY(){
    return this.y;
  }

  public void setPosition(int x, int y){
    this.x = x;
    this.y = y;
  }

  /*
  //deprecated - ancienne version stable
  public void displayPion(Pion Pion){

    ImageIcon pion_soldat= new ImageIcon(getClass().getResource("img/pion_soldat.png"));
    System.out.print(Pion.getX());
  }
  */

}
