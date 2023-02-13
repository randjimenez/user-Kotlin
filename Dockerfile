FROM amazoncorretto:17

WORKDIR /app
COPY . .

ENV JAVA_OPTS="-Dspring.profiles.active=dev"

CMD java $JAVA_OPTS -jar build/libs/user-kt-0.0.1-SNAPSHOT.jar