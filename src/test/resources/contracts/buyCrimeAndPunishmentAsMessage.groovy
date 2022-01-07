import org.springframework.cloud.contract.spec.Contract

Contract.make {
	label("triggerMessage")
	input {
		triggeredBy("triggerMessage()")
	}
	outputMessage {
		sentTo("topic1")
		body([
		        bookName: "CRIMEANDPUNISHMENT"
		])
		headers {
			header('kafka_messageKey', 'key-example')
		}
	}
}
