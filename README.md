# Drop quest

## Overview

A C2C delivery platform where you can request people to deliver parcels and earn
money by completing deliveries

## Role & Contributions

- **Role:** Owner
- **Contributions:**
    - Api and Application Security by Google OAuth 2
    - Global Exception handling
    - Comments and Inbox functionality for users to communicate with other users
    - Role based access to content on the frontend
    - Redis caching to save session and post for low latency

## Technologies & Tools

- **Languages:**  Java, SQL, JavaScript
- **Frontend:** ReactJs
- **Backend:** Spring boot
- **Database:**  Postgres
- **Other Tools:** Deployment via railway

## Challenges & Solutions

- **Challenge 1:**  How to view my quest screen
    - *Solution:*
- **Challenge 2:**  Comment feature display hierarchy
    - *Solution:*

## Visuals & Demos

- **Screenshots:**

![image.png](attachment:b6dca4de-47bc-4952-bf45-2c822f464792:image.png)

![image.png](attachment:f458e7b2-24ad-42dc-bdb8-bcdd85ce8574:image.png)

![image.png](attachment:88b36d52-2258-43ce-882c-c638255532a6:image.png)

![image.png](attachment:12a466ee-58fc-4d10-8a22-37754ded46eb:image.png)

![image.png](attachment:a7a33cec-a886-48fe-be58-2da41f0c0cf8:image.png)

- **Architecture Diagram:**
    
    ![Arch.svg](attachment:2e48292e-90c7-4679-9635-7c2b1f4a067b:Arch.svg)
    

https://lucid.app/lucidchart/77e9d206-4837-42e8-b7d5-3248ac3f923e/edit?page=0_0&invitationId=inv_bf3c95e2-7d0f-409e-bb49-af126b676789#

**Live Demo & Code:**

- [Live Demo](https://dropquests.up.railway.app/)
- [GitHub Repository](https://github.com/abhayraghuwanshi/Behalf-Back)

## Impact & Results

- Improved security
- User traffic

## Reflection & Future Enhancements

**Reflection**

I began this project with the idea of creating a portal where users could post various side-hustle requests—such as delivery, stitching, pet care, and gardening. I decided to focus on **delivery** first because it requires relatively little effort. Initially, the platform allows users to create delivery-related posts only.

If **travelers** want to take on a delivery request, they can contact the request’s author. To support this, I built a dedicated screen to handle all communication and status updates in one place. If a traveler is available but doesn’t find a suitable request, they can post that they’re traveling, allowing request authors to discover them for potential deliveries.

As the project progressed, the **concept** evolved continuously, and the **design** underwent multiple changes. Consequently, **continuous development and testing** were crucial to ensuring a successful and user-friendly platform.

- **Future Enhancements:**
    - Split Up functionality into microservice architecture for better performance
    - Frontend Caching to avoid similar API call
    - Images Support in the quest request
    - Help Desk
