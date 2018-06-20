# Intelygenz talent test

### What you’ll need
* A favorite text editor or IDE
* JDK 1.8 or later
* [Gradle 4+](https://gradle.org)
* Minimum knowledge about [spring boot](https://spring.io/projects/spring-boot)

### What you'll do
1. Clone this repository.
2. **Read the issue** that has been assigned to you.
3. **Create a merge request from the issue** from the issue detail screen, you can create a merge request to work on. When you create a merge request, a branch is also created.
5. **Work on the branch** until you feel you have resolved the issue.
6. Remove the **WIP** status on the merge request screen
7. You are ready to go!

More info: https://about.gitlab.com/2016/03/08/gitlab-tutorial-its-all-connected/

#### Build the Project
```
./gradlew build
```

#### Run the Project
```
./gradlew bootRun
```

#### Use the REST Service
```
curl http://localhost:8080/welcome
```