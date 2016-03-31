// Place your Spring DSL code here
import associationid.marshallers.*
import grails.converters.JSON
import org.grails.web.converters.configuration.ObjectMarshallerRegisterer

beans = {
  thingMarshallerJson(ObjectMarshallerRegisterer) {
    marshaller = new ThingMarshallerJson()
    converterClass = JSON
    priority = 1
  }
}
