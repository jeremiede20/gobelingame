public class Soldat extends Pion {
  private char morale;
  private int melee;
  private int missile;
  private boolean horse;

  public void setmelee(int melee) {
    this.melee = melee;
  }

  public void setmissile(int missile) {
    this.missile = missile;
  }

  public void setmorale(char morale) {
    this.morale = morale;
  }

  public char getmorale() {
    return morale;
  }

  public int getmelee() {
    return melee;
  }

  public int getmissile() {
    return missile;
  }

  public boolean isHorse() {
    return horse;
  }
  public void setHorse(boolean horse){
    this.horse = horse;
  }
}