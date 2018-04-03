package s_17.jms.spittr.alerts;

import org.springframework.jms.core.JmsOperations;

import s_17.jms.spittr.alerts.AlertService;
import s_17.jms.spittr.domain.Spittle;

public class AlertServiceImpl implements AlertService {

  private JmsOperations jmsOperations;

  public AlertServiceImpl(JmsOperations jmsOperations) {
    this.jmsOperations = jmsOperations;
  }

  public void sendSpittleAlert(Spittle spittle) {
    jmsOperations.convertAndSend(spittle);
  }

  public Spittle retrieveSpittleAlert() {
    return (Spittle) jmsOperations.receiveAndConvert();
  }

}
