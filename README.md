![Traces Icon](https://raw.githubusercontent.com/NCSUMobiles/Spring15-traces/master/thumbnail.png)

# Tagline:

"Exploring the surrounding digital footprint"

# Core Problem:

Social media is a major part of today's digital landscape. There is currently no way to view social media sources such as Twitter in a location-based manner. Traces fills that gap by giving the user a graphical, location-based window into the Twitterverse. Our application queries Twitter's servers, and displays to a user all of the tweets that have been made within a 1 mile radius of their current location. The user can also search for tweets in a different location either by long pressing on the map, quick search, or using an advance search.Tweets can also be viewed in a list view, sorting the most popular tweets at the top of the list.

# How:

This application was developed in Android Studio. All of us were new to Android development at the beginning of this project, however, we really like the way the final product turned out.The backend is written in Go, and runs on Google App Engine.The back-end produces a JSON response from the Twitter API,which the Android app consumes, then displays the results to the user in an easy to use interface.

# End-User Evaluation:

We conducted a lightweight end-user evaluation to determine how successful we were in the execution of the app. We made the app live in the Google Play store, posted a questionnaire via Google Forms, and asked friends and family to download it, try it out, and complete the questionnaire. Below are portions of the results that we found were interesting and a few conclusions drawn from the comments and data.

### Interface/Usage:

* Some form of instructions are needed to guide the user through the initial use of the app.
* Units of measurement for numeric values should be provided.
* Participants were able to navigate the maps view easily. 66.7% responded that it was easy to navigate the map view, and 27.8 percent responded that it was fairly easy to navigate the map view.
* Half of the participants found that ranking the tweets was helpful or interesting. Another 39.9% responded neutrally.
* 83% of participants were able to find an interesting or humorous tweet during their evaluation
* Over half of the participants (55.6%) responded that they would use both views if they used the application again, 33.3% responded they'd use the maps view the most, and only 11.1% responded that they'd use the list view the most.

### Demographics/Audience:

* Daily Twitter users would be much more likely to use the app.
  * Of the 18 users that completed the evaluation, only 5 of them use Twitter daily and 8 of them don't use twitter, at all
  * Of the five users that use Twitter daily, three indicated that they would be likely to use the app again, while the other two gave neutral responses.
  * Of the eight users that don't use Twitter at all, two of them indicated they would be likely to use the app again, while the others gave neutral responses or indicated they wouldn't be likely to use the app again.
* Younger users (ages 18-24) would be more likely to use the app
  * 60% of participants in the 18-24 years old range, compared to 25% of participations in the 24-34 years old range.
  * 20% of participants in the 18-24 years old range and 42% of participations in the 24-34 years old range would not be likely to try the app again.
* 66.7% of participants gave a strong indication that they would be likely to recommend the app to a friend. No participant responded that they would be unlikely to recommend it to a friend.

# Future work:

In an ideal world, we would have liked to have been able to allow users to pin, and save tweets of interest. We also would have liked to allow the user to share interesting tweets via other social media sites, implement a Webview to allow links to photos and videos to be visible in the list view (or have the links open in a web browser), cluster nearby tweets together and display each one individually when zoomed, and a unified display design to brand our application better.

# Link to app:
https://play.google.com/store/apps/details?id=edu.ncsu.mobile.traces

# Link to video:
http://youtu.be/796xuZgvIxc

# Link to GitHub:
https://github.com/NCSUMobiles/Spring15-traces

# References:

- Google App Engine
- Google Play Services
- Google Map API
- Android David Webb REST - https://github.com/hgoebl/DavidWebb
- Google Geocoder API / Golang Geo - https://github.com/kellydunn/golang-geo
- Twitter API - Anaconda - https://github.com/ChimeraCoder/anaconda
- Google GSON - https://github.com/google/gson
- Ion Framework - https://github.com/koush/ion
- Golang JSON-REST - https://github.com/ant0ine/go-json-rest
