package br.com.alura.ecommerce;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Properties;
import java.util.concurrent.ExecutionException;

@SpringBootApplication
public class EcommerceApplication {

	public static void main(String[] args) throws ExecutionException, InterruptedException {
		SpringApplication.run(EcommerceApplication.class, args);

		var producer = new KafkaProducer<String, String>(properties());
		var value = "122332,2434344,455435543";
		var record = new ProducerRecord<>("ECOMMERCE_NEW_ORDER", value, value);
		producer.send(record, (data, ex) -> {
			if(ex !=null){
				ex.printStackTrace();
				return;
			}
			System.out.println("Sucesso enviando:" + data.topic() + ":::partition" + data.partition() + "/ offset" + data.offset() + "/ timestamp " + data.timestamp());
		}).get();
	}

	public static Properties properties(){
		var properties = new Properties();
		properties.setProperty(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092");
		properties.setProperty(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
		properties.setProperty(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
		return properties;
	}

}
