package javaconfig;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import s_02.javaconfig.xszp01.CDPlayerConfig;
import s_02.javaconfig.xszp01.CompactDisc;
import s_02.javaconfig.xszp01.MediaPlayer;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {
    @Autowired
    private MediaPlayer player;

    @Autowired
    private CompactDisc cd;


  @Test
  public void play() {
//    player.play();
//    assertEquals(
//        "Playing Sgt. Pepper's Lonely Hearts Club Band by The Beatles\n",
//        log.getLog());
      cd.play();
  }

}
