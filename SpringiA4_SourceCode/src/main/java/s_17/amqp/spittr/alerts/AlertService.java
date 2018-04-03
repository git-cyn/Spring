package s_17.amqp.spittr.alerts;


import s_17.amqp.spittr.domain.Spittle;

public interface AlertService {

  void sendSpittleAlert(Spittle spittle);

}
