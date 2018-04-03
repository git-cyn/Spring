package s_01;

import org.junit.Test;

//import static org.mockito.Mockito.*;

public class BraveKnightTest {

  @Test
  public void knightShouldEmbarkOnQuest() {

//    Quest mockQuest = mock(Quest.class);
//    BraveKnight knight = new BraveKnight(mockQuest);
//    knight.embarkOnQuest();
//    verify(mockQuest, times(1)).embark();
    Knight knight = new BraveKnight(new RescueDamselQuest());
    knight.embarkOnQuest();
    Knight knight2 = new BraveKnight(new RescueDamselQuest2());
    knight2.embarkOnQuest();
  }

}
