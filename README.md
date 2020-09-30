# System Design Examples

* Netflix/Youtube - Video streaming platform
* Twitter
* Facebook/Instagram
* Uber/Grab/Ola
* WhatsApp/Facebook messenger - Messaging
* Zoom - Video Conferencing
* Tiny URL
* AirBNB
* Notification service - Supporting billions of users & notofications
* Code Deployment System
* Stock Broker
* Facebook News Feed
* Google Drive
* Slack

## Netflix/Youtube - Video streaming platform
### Functional Requirements
* Upload videos
* Search 
* Play video
* Recommendation
### Non-Functional Requirements
* Low latency
* High Availability
* 200 Million users across the globe
### Data estimation
* Video data - 10,000 movies in total. Each video can have 2 formats, High Definition & standard definition. Each 1 hour video aprox 10GB for SD & 20GB for HD
Total storage need = 30GB * 10,000 = 300 TB
* Video metadata - Description, Genre, Actors etc
* User Data - For each user, metadata about their watched movies. 100KB per user * 200 Million users = 20TB 
### Conceptual Architecture
<img src="https://github.com/spatnaik77/system-design-examples/blob/master/design-pictures/Netflix.png">
<br>

## Twitter
### Functional Requirements
* Follow a user
* Tweet (text, url, image , video)
* timeline - Show the tweets from followers
* User tweets - Show all the tweets done by the user
### Non-Functional Requirements
* Low latency, High availability
* Read intensive 
* 100 Million daily active users
* Timeline view should get refreshed at real time
* 500 Million accounts in total
* 500 Million tweets per day. ie around 6000 tweets / second
### Conceptual Architecture


## Facebook/Instagram


## Uber/Grab/Ola
10
