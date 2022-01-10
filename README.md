# System Design Examples

Many systems design questions are intentionally left very vague and are literally given in the form of Design Facebook. It's your job to ask clarifying questions to better understand the system that you have to build.

- [Distributed ID Generator](#Distributed_ID_Generator)
- [URLShortner](#URLShortner)
- [Slack/WhatsApp/Team - Messaging Platform](#Slack)
- [Google Drive](#google-drive)
- [Netflix/Youtube - Video Streaming Platform](#NetflixYoutube)
- [Twitter/Instagram/Pinterest - Micro Blogging Platform](#twitter)
- [Uber/Grab/Ola - Cab Booking System](#Uber)
- [Amazon/Flipkart/Walmart - ECommerce Platform](#AmazonWalmart)


- [Zoom](#zoom)

- [AirBNB/MakeMyTrip - Hotel Booking](#airbnb)
- [Notification service - Supporting billions of users & notofications](#)

## Distributed_ID_Generator
Generates Twitter-like Snowflake ids. In short, this is an id scheme to generate unique 64 bit ids which are roughly sortable across multiple systems without a central instance.
The IDs are 64-bits in size and are generated with the combination of the following:
  * Epoch timestamp in milliseconds precision - 41 bits
  * Node ID - 10 bits. This gives us 1024 nodes/machines.
  * Sequence Number - Local counter per machine - 13 bits (Theoritically can generate 2^13-1 per milli second
  
  ### Source Code
  https://github.com/spatnaik77/system-design-examples/blob/master/src/idgenerator/IdGenerator.java
  
  ### References
  * https://instagram-engineering.com/sharding-ids-at-instagram-1cf5a71e5a5c
  * https://blog.twitter.com/engineering/en_us/a/2010/announcing-snowflake
  * https://www.callicoder.com/distributed-unique-id-sequence-number-generator/
  * https://github.com/phxql/snowflake-id
  
  
<br>

## URLShortner
URL Shrtner Service


## Slack

<img src="https://github.com/spatnaik77/system-design-examples/blob/master/design-pictures/Slack.png">
<br>

## Google Drive

<img src="https://github.com/spatnaik77/system-design-examples/blob/master/design-pictures/GoogleDrive.png"/>
<br>

## Netflix

<img src="https://github.com/spatnaik77/system-design-examples/blob/master/design-pictures/Netflix.png"/>
<br>

## Twitter

<img src="https://github.com/spatnaik77/system-design-examples/blob/master/design-pictures/Twitter.png"/>
<br>

## Uber

<img src="https://github.com/spatnaik77/system-design-examples/blob/master/design-pictures/Uber.png"/>
<br>













