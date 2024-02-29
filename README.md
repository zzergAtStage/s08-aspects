# Фреймворк Spring (семинары)  
## Урок 8. Spring AOP, управление транзакциями.  

1. Базовое задание:  
Домашнее задание выполнить для одного из пройденных семинаров в проекте с Базой Данных.
Вам необходимо разработать механизм регистрации действий пользователя в вашем Spring Boot приложении. Используйте Spring AOP
для создания журнала действий, в котором будет сохраняться информация о том, какие методы сервиса вызывались, кем и с какими параметрами.

* Создайте аннотацию ```@TrackUserAction```.  
* Реализуйте aspect, который будет регистрировать действия пользователя, когда вызывается метод, отмеченный этой аннотацией.   
* Примените аннотацию ```@TrackUserAction``` к нескольким методам в слое сервиса.   
* Результаты регистрации в консоль

2. Задание со звездочкой:
Разработать систему из WEB приложения магазин(достаточно один товар) и двух REST микросервисов резервирования на складе и оплаты товара.
Необходимо использовать АОП для регистрации действий в системе и измерений времени выполнения методов.
Обязательно использовать управление транзакциями при резервирования товара на складе и переводах средств между счетами.
**Внимание логировать все методы не нужно. Несколько, чтобы показать использование аспектов.**

