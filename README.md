App Screenshut

<img width="390" height="844" alt="Home Page" src="https://github.com/user-attachments/assets/d22815e4-b895-4655-bb6d-fc33a3d4f176" /> <img width="390" height="854" alt="Cart" src="https://github.com/user-attachments/assets/aa3c208d-6d42-4fbc-9c2b-8c4b5941aa1e" /> <img width="447" height="2085" alt="product item" src="https://github.com/user-attachments/assets/3ee8b762-d459-4225-b91b-780fcdbd2752" />



please find full guide here = https://www.jetbrains.com/help/kotlin-multiplatform-dev/multiplatform-setup.html
fixing build


This is a Kotlin Multiplatform project targeting Android, iOS.

* `/composeApp` is for code that will be shared across your Compose Multiplatform applications.
  It contains several subfolders:
  - `commonMain` is for code that’s common for all targets.
  - Other folders are for Kotlin code that will be compiled for only the platform indicated in the folder name.
    For example, if you want to use Apple’s CoreCrypto for the iOS part of your Kotlin app,
    `iosMain` would be the right folder for such calls.

* `/iosApp` contains iOS applications. Even if you’re sharing your UI with Compose Multiplatform, 
  you need this entry point for your iOS app. This is also where you should add SwiftUI code for your project.

* `/shared` is for the code that will be shared between all targets in the project.
  The most important subfolder is `commonMain`. If preferred, you can add code to the platform-specific folders here too.


Learn more about [Kotlin Multiplatform](https://www.jetbrains.com/help/kotlin-multiplatform-dev/get-started.html)…
