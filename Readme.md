1. Используя команду cat в терминале операционной системы Linux, создать два файла Домашние животные (заполнив файл 
собаками, кошками, хомяками) и Вьючные животными заполнив файл Лошадьми, верблюдами и ослы), а затем объединить их. 
Просмотреть содержимое созданного файла. Переименовать файл, дав ему новое имя (Друзья человека).
![01.jpg](Images%2F01.jpg)
2. Создать директорию, переместить файл туда.
![02.jpg](Images%2F02.jpg)
3. Подключить дополнительный репозиторий MySQL. Установить любой пакет из этого репозитория.
![3.jpg](Images%2F3.jpg)
![3-3.jpg](Images%2F3-3.jpg)
![3-1.jpg](Images%2F3-1.jpg)
![3-2.jpg](Images%2F3-2.jpg)
![3-4.jpg](Images%2F3-4.jpg)
4. Установить и удалить deb-пакет с помощью dpkg.
![04.jpg](Images%2F04.jpg)
5. Выложить историю команд в терминале ubuntu.
![05.jpg](Images%2F05.jpg)
6. Нарисовать диаграмму, в которой есть класс родительский класс, домашние животные и вьючные животные, в составы
которых в случае домашних животных войдут классы: собаки, кошки, хомяки, а в класс вьючные животные войдут: Лошади, 
верблюды и ослы).
![6-1.jpg](Images%2F6-1.jpg)
7. В подключенном MySQL репозитории создать базу данных “Друзья человека”.
![07.jpg](Images%2F07.jpg)
8. Создать таблицы с иерархией из диаграммы в БД.
[8.sql](SQL%2F8.sql)
9. Заполнить низкоуровневые таблицы именами(животных), командами которые они выполняют и датами рождения.
[9.sql](SQL%2F9.sql)
10. далив из таблицы верблюдов, т.к. верблюдов решили перевезти в другой питомник на зимовку. Объединить таблицы лошади,
и ослы в одну таблицу.
[10.sql](SQL%2F10.sql)
11. Создать новую таблицу “молодые животные” в которую попадут все животные старше 1 года, но младше 3 лет и в отдельном
столбце с точностью до месяца подсчитать возраст животных в новой таблице.
[11.sql](SQL%2F11.sql)
12. Объединить все таблицы в одну, при этом сохраняя поля, указывающие на прошлую принадлежность к старым таблицам.
[12.sql](SQL%2F12.sql)
