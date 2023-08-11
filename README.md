# Java_Algorithms

В данном репозитории хранятся примеры различных сортировок на языке Java.

Быстрая сортировка<br>
Сортировка пузырьком<br>
Сортировка вставками

Каждая из этих сортировок отличается своим подходом и скоростью работы(Big O natation)

Быстрая сортировка (Quick sort)
Массив элементов разделяется на две равные части.
В ходе работы, те элементы которые меньше чем опорный(средний) перемещаются влево,
а те что больше - вправо.
Сложность алгоритма быстрой сортировки зависит от входных данных.
В лучшем случшем случае это O(n*2log2n)
В худшем - O(n^2)
В среднем - O(n×log2n)

================

Сортировка пузырьком(Bubble sort)

В ходе работы этой сортировки меняются местами два соседних элемента до тех пор
пока все элементы не будут отсортировоны.
Сложность Bubble sort - O(n^2)

================

Сортировка вставками (Insertion sort)

Суть работы в том что, на каждом шаге алгоритма мы берем один из элементов массива, 
находим позицию для вставки и вставляем его. 
Если массив имеет только 1 элемент то он считается отсортированным.
Худшее время	О(n2)
Лучшее время	O(n)
Среднее время	О(n2)
