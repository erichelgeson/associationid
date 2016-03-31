package associationid.marshallers
import associationid.*
import org.grails.web.converters.marshaller.ClosureObjectMarshaller

class ThingMarshallerJson extends ClosureObjectMarshaller<Thing> {

  public static marshall = { Thing thing ->
    def json = [:]
    // This works:
    // json.otherThingId = thing.otherThing.id

    // This should work:
    json.otherThingId = thing.otherThingId

    json
  }

  public ThingMarshallerJson() {
    super(Thing, marshall)
  }
}
