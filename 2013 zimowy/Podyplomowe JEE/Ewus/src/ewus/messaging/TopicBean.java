package ewus.messaging;

import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

@MessageDriven(mappedName="temacik")
public class TopicBean implements MessageListener {

  @Override
  public void onMessage(Message message) {
    try {
      String msg = ((TextMessage) message).getText();
      System.out.println("Odebrałem z tematu i git " + msg);
    }
    catch (JMSException e) {
      e.printStackTrace(System.err);
    }
  }

}
