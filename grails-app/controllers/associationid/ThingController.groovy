package associationid

import grails.converters.JSON

class ThingController {
  public index() {
    def thing = new Thing()
    thing.otherThing = new OtherThing(name:"something").save()

    // This doesnt work either
    // println thing.otherThingId

    render thing as JSON
  }
}
