package autoconfig;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import s_02.autoconfig.CDPlayerConfig;
import s_02.autoconfig.CompactDisc;
import s_02.autoconfig.MediaPlayer;

import static junit.framework.TestCase.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {
    @Autowired
    private MediaPlayer player;

    @Autowired
    private CompactDisc cd;

    @Test
    public void cdShouldNotBeNull() {
        assertNotNull(cd);
    }

  @Test
  public void play() {
//    player.play();
//    assertEquals(
//        "Playing Sgt. Pepper's Lonely Hearts Club Band by The Beatles\n",
//        log.getLog());
      player.play();
  }

}
