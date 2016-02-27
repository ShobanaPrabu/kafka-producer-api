package org.waziup.kafka;


import kafka.producer.KeyedMessage;
import kafka.javaapi.producer.Producer;
import kafka.producer.ProducerConfig;
import java.util.Properties;
//import kafka.producer.Producer;
import scala.collection.Seq;
	
public class TestProducer {

	public static void main(String [] args) {
	    Properties prop = new Properties();
	    prop.put("metadata.broker.list", "178.22.67.208:9092");
	    prop.put("serializer.class","kafka.serializer.StringEncoder");
	    //prop.put("partitioner.class", "example.producer.SimplePartitioner");
	    ProducerConfig producerConfig = new ProducerConfig(prop);
	    Producer<String,String> producer = new <String,String>Producer(producerConfig);
	    String topic = "test-waziup";
	    KeyedMessage<String,String> message = new <String,String>KeyedMessage(topic, "Hello Test message");
	    producer.send(message);
	    producer.close();
	  }
	}
