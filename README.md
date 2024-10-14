![Videohub](https://images.emojiterra.com/google/noto-emoji/animated-emoji/1f976.gif)

# Videohub

Данное приложения это сайт для хранения/передачи видео/изображений

## Запуск

На данный момент нужно запускать отдельно фронт и бек, в будущем будет 

### Frontend ./videohub-frontend
Для запуска фронтенд части можно использовать стандартную команду `npm i` `npm start`.
#### `Фронтенд находится на порте 3000`


### Backend ./videohub-backend
Для запуска бекенд части можно использовать среду разработки или запустить с помощью
 ` ./mvnw start`.  Вместе с запуском приложения автоматически будет запущен docker-compose который поднимет бд и elasticsearch.
 #### `Бекенд находится на порте 8080`
 
 ***Ендпоинты***
 Для просмотра ендпоинтов можно открыть swagger (default: `localhost:8080/swagger-ui.html` )

***Предустановленные пользователи***
- Логин: admin
- Пароль: admin

## Структура приложения
Frontend написан на React, bootstrap, авторизация работает через jwt (Заголовок Authorization Bearer: ).

Backend написан на Spring, Rest Api, авторизация на Spring Security (JWT), Бд: Postgresql, ElasticSearch, ***также для приложения требуется ffmpeg***.
