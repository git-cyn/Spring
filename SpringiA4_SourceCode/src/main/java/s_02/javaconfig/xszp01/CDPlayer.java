package s_02.javaconfig.xszp01;
import org.springframework.beans.factory.annotation.Autowired;

public class CDPlayer implements MediaPlayer {
  private CompactDisc cd;

  public CDPlayer(CompactDisc cd) {
    this.cd = cd;
  }

  public void play() {
    cd.play();
  }

}
