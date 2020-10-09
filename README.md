# System Design Examples

Many systems design questions are intentionally left very vague and are literally given in the form of Design Facebook. It's your job to ask clarifying questions to better understand the system that you have to build.

- [Google Drive](#google-drive)
- [Slack](#Slack)
- [Netflix/Youtube - Video streaming platform](#NetflixYoutube)
- [Twitter](#twitter)
- [Facebook/Instagram](#FacebookInstagram)
- [Amazon/Walmart](#AmazonWalmart)
- [Uber/Grab/Ola - Cab booking system](#Uber)
- [Zoom](#zoom)
- [URLShortner](#URLShortner)
- [WhatsApp/Facebook messenger - Messaging](#Whatsapp)
- [AirBNB/MakeMyTrip - Hotel Booking](#airbnb)
- [Notification service - Supporting billions of users & notofications](#)
- [Code Deployment System](#)
- [Stock Broker](#)
- [Facebook News Feed](#)



## Google Drive
Design the core functionality of good drive

Functional Requirements | Non-Functional Requirements
------------ | -------------
Upload a file, Download a file, Support folder heirarchy, Web client | Highly available, Support 1 billion users each having 15GB of storage limit,

<img src="https://github.com/spatnaik77/system-design-examples/blob/master/design-pictures/GoogleDrive.png"/>
<br>

## Slack

<img src="https://github.com/spatnaik77/system-design-examples/blob/master/design-pictures/Slack.png">
<br>

## Netflix/Youtube

Functional Requirements | Non-Functional Requirements
------------ | -------------
Upload videos, Search, Play video, Recommendation | Low latency, High Availability, 200 Million users across the globe

### Data estimation
* Video data - 10,000 movies in total. Each video can have 2 formats, High Definition & standard definition. Each 1 hour video aprox 10GB for SD & 20GB for HD
Total storage need = 30GB * 10,000 = 300 TB
* Video metadata - Description, Genre, Actors etc
* User Data - For each user, metadata about their watched movies. 100KB per user * 200 Million users = 20TB 
### Conceptual Architecture
<img src="https://github.com/spatnaik77/system-design-examples/blob/master/design-pictures/Netflix.png">
<br>

## Twitter
Functional Requirements | Non-Functional Requirements
------------ | -------------
Follow a user, Tweet (text, url, image , video), timeline - Show the tweets from followers, User tweets - Show all the tweets done by the user | Low latency, High availability, Read intensive , 100 Million daily active users, Timeline view should get refreshed at real time, 500 Million accounts in total, 500 Million tweets per day. ie around 6000 tweets / second

### Conceptual Architecture
<img src="https://github.com/spatnaik77/system-design-examples/blob/master/design-pictures/Twitter.png">
<br>

## Facebook/Instagram
Functional Requirements | Non-Functional Requirements
------------ | -------------
Add a friend, Post (text, url, image , video), timeline - Show the posts from friends, User posts - Show the posts by the user | Low latency, High availability, Read intensive , 5 billion daily active users

### Conceptual Architecture
<img src="https://github.com/spatnaik77/system-design-examples/blob/master/design-pictures/Facebook.png">
<br>

## Amazon/Walmart
<img src="https://github.com/spatnaik77/system-design-examples/blob/master/design-pictures/Walmart.png">
<br>

## Uber
Design Uber focusing on the Core booking service from both customer & driver perspective

Functional Requirements | Non-Functional Requirements
------------ | -------------
Find a cab, Get visibility into ETA, Track a ride, Complete ride | Low latency, High availability, 

<img src="https://github.com/spatnaik77/system-design-examples/blob/master/design-pictures/Uber.png">
<br>











