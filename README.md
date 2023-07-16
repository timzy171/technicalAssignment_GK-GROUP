# Техническое задание GK-GROUP от 16 июля 2023 года.

## Приложение выполнено с использованием H2 DataBase, Spring Boot.
![image](https://github.com/timzy171/technicalAssignment_GK-GROUP/assets/115809444/28dc8781-95b7-4be7-89a8-0098a085349e)

При нажатии на кнопку `PLUS ONE` значение в `TEXTFIELD` увеличивается на единицу.
Изменения автоматически заносятся в БД. 
Доступ к ней получаем с помощью консоли, которую мы увидим перейдя по следующему URL:

![image](https://github.com/timzy171/technicalAssignment_GK-GROUP/assets/115809444/7851ed24-73a9-4944-9707-a234320e108d)

Для авторизации вводим `login: sa` и `password: sa`
![image](https://github.com/timzy171/technicalAssignment_GK-GROUP/assets/115809444/6ea69dac-5f71-49b7-a6c0-9cbb28c2b6dd)

Находим нужную нам тамблицу и выполняем SQL SELECT запрос:
![image](https://github.com/timzy171/technicalAssignment_GK-GROUP/assets/115809444/3289ab36-0ac0-4c0b-a3fc-2829b9cdd1d1)

Также, в приложении предусмотрено ручное изменение значения, просто вводим его в `TEXTFIELD`, после чего нажимаем на `PLUS ONE`:
![image](https://github.com/timzy171/technicalAssignment_GK-GROUP/assets/115809444/b24bcae1-33e9-42d2-9706-dac6ffe066b6)

Вернемся к БД:
![image](https://github.com/timzy171/technicalAssignment_GK-GROUP/assets/115809444/905ba6d2-d8b9-4942-be4b-5c6a3b5ad278)

Чтобы сбросить значение `VALUE` до нуля, достаточно просто стереть весь текст из `TEXTFIELD`, после чего нажать `PLUS ONE`:
![image](https://github.com/timzy171/technicalAssignment_GK-GROUP/assets/115809444/160d625a-8f95-4f79-bfa2-3e7bd80049ff)
![image](https://github.com/timzy171/technicalAssignment_GK-GROUP/assets/115809444/a1ecc17b-c62d-4ad7-a952-5cf4f044095d)




