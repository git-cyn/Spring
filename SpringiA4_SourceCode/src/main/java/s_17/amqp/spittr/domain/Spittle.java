package s_17.amqp.spittr.domain;

import java.io.Serializable;
import java.util.Date;

public class Spittle implements Serializable {
  private static final long serialVersionUID = 1L;
  
  private Long id;
  private Spitter spitter;
  private String message;
  private Date postedTime;
  
  public Spittle(Long id, Spitter spitter, String message, Date postedTime) {
    this.id = id;
    this.spitter = spitter;
    this.message = message;
    this.postedTime = postedTime;
  }
  
  public Long getId() {
    return this.id;
  }
  
  public String getMessage() {
    return this.message;
  }
  
  public Date getPostedTime() {
    return this.postedTime;
  }

  public Spitter getSpitter() {
    return this.spitter;
  }

}
