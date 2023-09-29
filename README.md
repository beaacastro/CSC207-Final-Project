# week3project

## Problem Domain
Project domain: The project domain our group will be dealing with is concert events. Our primary objective is to develop a user-friendly application which allows users to find upcoming dates for their favourite artists based on a specified location.

## Application Description
Our group project will help ask users for their favourite artists and the city in which they are located. Once it collects that data, using Ticketmaster’s API, it will show upcoming shows for those artists and remind users when a presale event is happening so they can sign up as quickly as possible. Based on the choices, the user can switch locations if they are planning on travelling and want to know if any upcoming events are occurring in the country/city they are visiting.

## Link to Documentation for API
* Link for Ticketmaster Discovery API: https://developer.ticketmaster.com/products-and-docs/apis/discovery-api/v2/
* Photo of Ticketmaster API being accessed through Postman
![4d53e9f5-7386-48d9-a9b3-80cd9f76ab42](https://github.com/beaacastro/week3project/assets/127895849/75823229-861d-4c21-8ddb-f4213fd06b70)


## API Usage Example
![0d2d2703-5039-406b-90fa-a13dc085e168](https://github.com/beaacastro/week3project/assets/127895849/c383e7d4-1ed8-443e-bbf1-c622989735a5)


## Output for Java Code
![b252d096-bba7-49de-becd-3bb41cb486be](https://github.com/beaacastro/week3project/assets/127895849/123429f4-b4ed-4842-a320-ff970bba9a35)


## List of Technical Problems Blocking Progress
* Ticketmaster offers many APIs. The Discovery API has limited features compared to Partner API and Presence API, which can’t view available seat inventory status or purchase tickets in advance.
* The Ticketmaster Discovery API has a default quota of 5000 API calls per day and a rate limitation of 5 requests per second. This could cause a problem if we want to publish this application as the amount of users who can use this application per day would be 5000.

## Example of Calling the API from Java




