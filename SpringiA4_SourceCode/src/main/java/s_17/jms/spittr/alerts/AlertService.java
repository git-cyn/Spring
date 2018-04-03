package s_17.jms.spittr.alerts;


import s_17.jms.spittr.domain.Spittle;

public interface AlertService {

  void sendSpittleAlert(Spittle spittle);

  Spittle retrieveSpittleAlert();
  
}
