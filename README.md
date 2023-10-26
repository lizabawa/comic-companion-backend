# COMICCOMPANION

## Project Description
ComicCompanion is a mock portfolio website for a comic artist to display their work where users can come and read the artists comics. This is the back-end for the application.

[Frontend Github](https://github.com/lizabawa/comic-companion-front)


## Table of Contents
- [Project Approach](#project-approach)
- [User Stories](#user-stories)
- [Entity Relationship Diagram](#ERD)
- [Endpoints](#endpoints)
- [Tools and Technologies Used](#tools-and-technologies-used)
- [Dependencies](#dependencies)
- [Hurdles Encountered During Development](#hurdles-encountered-during-development)
- [Key Achievements](#key-achievements)
- [Resources & Acknowledgements](#resources--acknowledgements)

## Project Approach
- I used the project management application [Notion](https://www.notion.so/) to keep track of project tasks, important links, and brainstorming ideas
- ![Notion Project Manager](https://github.com/lizabawa/comic-companion-backend/blob/main/src/main/resources/images/Notion.png?raw=true)
- My approach to this project was to create a bare-bone front end first, then the backend, and then connect the two before completing any additional CSS
- Before I began any coding, I planned my backend-end out by creating user stories, and ERD diagram, and listing my endpoints.


### User Stories
<details open>
<summary>Landing Page</summary>
<br>
- As a User, I should be able to click on the home or logo and be directed to the home page.
<br>
- As a User, I should be able to click on the “Comics” link in the the navigation and be directed to the comics page.
<br>
- As a User, I should be able to click on the social media icons and be redirected in a new tab to the  associated social media page.
</details>
<details open>
<summary>Comics Page</summary>
<br>
- As a User, I should be able to clicked on the featured comic button and be directed to the featured comic
<br>
- As a User, I should be able to click on an individual comic image or title and be directed to the individual comics page
</details>
<details open>
<summary>Individual Comics Page</summary>
<br>
- As a User, I should be able to click on the carousel left/right image and see the previous/next image
<br>
- As a User, I should be able to click on the back to the carousel top button and be redirected back to the top of the carousel
</details>

### Entity Relationship Diagram (ERD)
![Entity Relationship Diagram](https://github.com/lizabawa/comic-companion-backend/blob/main/src/main/resources/images/ERD.drawio.png?raw=true)

## Endpoints
![Endpoints](https://github.com/lizabawa/comic-companion-backend/blob/main/src/main/resources/images/Endpoints.png?raw=true)

## Tools and Technologies Used

The following is a list of the tools and technologies that were employed in the development of this project:
- **[IntelliJ](https://www.jetbrains.com/idea/):** The code editor of choice, offering robust features for debugging and source code editing.
- **[Java](https://www.java.com/en/):** Utilized for creating the basic structure of the web application.
  These tools and technologies were integral in delivering a high-quality, user-friendly application.
- **[Maven](https://maven.apache.org/):** A software project management and comprehension tool.
- **[Postman](https://www.postman.com/):** An API platform for building and using APIs.
- **[GitHub](https://github.com/):** Version control and collaboration platform.
- **[App Diagrams](https://app.diagrams.net/):** Used for designing the ERD.
- **[Google Sheets](https://www.google.com/sheets/about/):** Used for organizing the endpoints.

## Dependencies
- Springboot
- JUnit
- H2 Database

## Hurdles Encountered During Development
- Creating the tests before creating the service and controller was challenging. I was able to create the tests before the service class and keep editing both until the test ran. I unintentionally completed the controller class before I started the tests but in the end still successfully created the test for both.
- Getting the images to display on the frontend took a while due to not knowing which image URL to use. I ultimately ended up using the image url from the backend GitHub repository. However, an issue I became aware of is that even though Angular updates its UI automatically, since I changed the image URL on the backend, it was not automatically displaying unless I refreshed the frontend localhost page. This mistake cost me a lot of time because I could have been using the correct image URL on the backend but the frontend UI was simply not updating which led me to think the problem persisted.
## Key Achievements
- The frontend is successfully retrieving data from the API.
- Exceptions and endpoints are working correctly.

## Resources & Acknowledgements
### General Assembly Instructors
- Suresh Sigera: [GitHub](https://github.com/sureshmelvinsigera)
- Dhrubo Chowdhury: [GitHub](https://github.com/Dhrubo-Chowdhury)
- Leonardo Rodriguez: [GitHub](https://github.com/LRodriguez92)

### Resources
These are the resources that were pivotal in debugging my code.
- [Stackoverflow](https://stackoverflow.com/)
- [ChatGPT](https://chat.openai.com/)
- [W3 Schools](https://www.w3schools.com/)
- [Devstackr Youtube Video](https://www.youtube.com/watch?v=185uAxYz1dU)