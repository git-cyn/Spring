package s_17.jms.spittr.alerts;


import s_17.jms.spittr.domain.Spittle;

public class SpittleAlertHandler {

  public void handleSpittleAlert(Spittle spittle) {
    System.out.println(spittle.getMessage());
  }

}
