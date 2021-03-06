# TripPlanner

Your task is to build a simple Trip Planner application. It stores Locations, which all
have the following common attributes: X and Y coordinates.

All Locations are divided into the following subcategories:

● Landmark: This one has a name, and its coordinates can only be set once.
They have an entrance fee that can be set multiple times with validation for
negative values. Landmarks can be Geological, Biological or Cultural

● City: This object also has a name. Its coordinates can only be set once.

● UserLocation: The current location of the user. This object also stores the
coordinates every time it is set and can show the location history of a user.

Furthermore every location has a method that returns the closest city to it (at least
known by the trip planner).

Note: You can assume that the earth is flat, i.e. there is no need to wrap around
coordinates.
