FROM alpine:3.16

ENV DB_URL=${DB_URL}
ENV DB_USERNAME=${DB_USERNAME}
ENV DB_PASSWORD=${DB_PASSWORD}

RUN apk add --no-cache && \
    wget -O /etc/apk/keys/amazoncorretto.rsa.pub https://apk.corretto.aws/amazoncorretto.rsa.pub && \
    echo "https://apk.corretto.aws" >> /etc/apk/repositories && \
    apk update && \
    apk add amazon-corretto-17

WORKDIR /app

COPY . /app

RUN chmod +x gradlew

ENTRYPOINT ["./gradlew", "bootRun"]

