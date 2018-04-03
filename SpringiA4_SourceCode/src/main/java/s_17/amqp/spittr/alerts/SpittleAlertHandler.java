package s_17.amqp.spittr.alerts;


import s_17.amqp.spittr.domain.Spittle;

public class SpittleAlertHandler {
  
  public void handleSpittleAlert(Spittle spittle) {
    System.out.println(spittle.getMessage());
  }

}
