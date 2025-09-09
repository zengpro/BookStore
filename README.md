# Клонирование репозитория
git clone https://github.com/zengpro/BookStore.git  
cd BookStore
# Настроить БД
CREATE DATABASE bookstore;  
Установить user и pwd в application.properties предварительно имея пользователя.
# Сборка проекта
mvn clean package 
# Запуск приложения
java -jar target/BookStore-1.0-SNAPSHOT.jar  

# Client and Book API (сделаны эндпоинты со стандартными CRUD операциями для сущностей book, client )   
GET /api/books  
GET /api/books/{id}  
POST /api/books  
{  
  "title": "Новая книга",  
  "author": "Автор книги",  
  "isbn": "123-4567890123"  
}  
PUT /api/books/{id}   
{  
  "title": "Обновленное название",  
  "author": "Новый автор",  
  "isbn": "123-4567890123"  
}  
DELETE /api/books/{id}  
GET /api/clients  
GET /api/clients/{id}  
POST /clients  
{
  "fullName": "Петров Петр Петрович",  
  "birthDate": "1985-05-20"  
}  
DELETE /api/books/{id}  
# Rentals API  
GET /api/rentals  
POST /api/rentals/take?clientId=1&bookId=1  
POST /api/rentals/return/{rentalId}  
# Rental Information API  
GET /api/rentals-info  
