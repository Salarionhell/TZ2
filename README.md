![Java CI with Maven](https://github.com/Salarionhell/TZ2/actions/workflows/maven.yml/badge.svg)

### Часть 1

1)  **Реализованы функции чтения из файла, поиска минимального числа, поиска максимального числа, сложения и умножения всех чисел из файла**
   
   Чтобы избежать ошибок при чтении файла были добавлены исключения NumberFormatException - обрабатывает некорректные данные и выдаёт ошибку; IOException - обрабатывает ошибки при вводе-ввыводе.
   
   При умножении и сложение учтено, что на выводе могут получаться числа формата BigInteger.
   
3)  **Реализованны тесты для проверки корректности функций**
   
   Проверка основывается на сравнивании результата обработки заданного массива с помощью написанной функции и результата, который заранее известен.
   
4)  **Реализованны тесты для проверки скорости работы программы при увеличении размера входного файла**
   
   Для каждой функции сравнивается время работы с разными размерами файлов (массивов), а именно размера 1000000 и 10.
   
   Время исчисляется в наносекундах.
   
6)  **Реализован любой другой тест**
   
   Было проверено, насколько быстро выполняется поиск минимума для массива из 10 элементов - будет ли скорость превышать 10000000 наносекунд.
   
7)  **Построен график зависимости времени выполнения от кол-ва чисел в файле**
   
   ![image](https://github.com/Salarionhell/TZ2/assets/150520413/036f9497-81ad-44c1-9e3d-57639a2ff547)

   Была проанализована скорость поиска максимального элемента на массивов разного размера. Размеры массивов, соответственно, указаны на графике.
   
   Для графика были использованы усреднённые данные, собранные за 10 измерений. Время работы функции будет отличаться с каждым запуском. Первый запуск метода может быть очень медленным, так как будет
   происходить его компиляция. После этого запуски могут быть более-менее одинаковые, но совпадения в наносекундах не будет, так как параллельно может что-то работать и нагружать систему.
   
   *При этом на графике видна явная зависимость размера массива от времени выполнения - чем больше чисел в массив, тем больше времени требуется.*
   
   
   
   

   
