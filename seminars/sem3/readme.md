Урок 3. Коллекции JAVA: Введение
Обязательно

На вход
некоторому исполнителю
подаётся четыре числа (a, b, c, d).

У исполнителя есть две команды
- команда 1 (к1): увеличить в с раз, а умножается на c
- команда 2 (к2): увеличить на d , к a прибавляется d

написать программу, которая выдаёт общее количество возможных преобразований a в b
набор команд, позволяющий число a превратить в число b или сообщить, что это
невозможно

- Пример 1: а = 1, b = 7, c = 2, d = 1.
- ответ: к1, к1, к1, к1, к1, к1 или к1, к2, к1, к1, к1 или к1, к1, к2, к1.
- Пример 2: а = 11, b = 7, c = 2, d = 1
- ответ: нет решения.

*Подумать над тем, как сделать вывод маршрута (хотя бы одного)

Тестовые данные

- a: 2 b: 7 c: 2 d: 1 -> 3
- a: 3 b: 27 c: 3 d: 2 -> 6
- a: 30 b: 345 c: 5 d: 6 -> 0
- a: 30 b: 345 c: 2 d: 1 -> 7047
- a: 22 b: 333 c: 3 d: 1 -> 467
- a: 55 b: 555 c: 5 d: 2 -> 30
- a: 22 b: 2022 c: 11 d: 56 -> 0
- a: 22 b: 2022 c: 11 d: 10 -> 18
- a: 22 b: 2022 c: 3 d: 1 -> 763827
- a: 22 b: 20220 c: 3 d: 1 -> 535173226980
- a: 1 b: 1111 c: 2 d: 1 -> 3990330794
- a: 1 b: 11111 c: 2 d: 1 -> 606408167570737286

ТУТ КОД НУЖЕН проверка оценивается только этой задачи

Вторая

Разобраться волновой алгоритм и подготовиться к его решению.
1. Описать логику получения карты
2. Описать логику заполнения карты
3. Описать как установить точку начала получения маршрута
4. Будет ли отличаться решение, если на карте будет несколько выходов

Теория https://ru.wikipedia.org/wiki/Алгоритм_Ли

+ГИТ. readme.md (технически тут можно без кода)

# Решение второй задачи
