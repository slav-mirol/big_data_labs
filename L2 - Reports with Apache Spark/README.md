# Лабораторная 2. Формирование отчётов в Apache Spark

## Задание

1. Преобразовать любой файл набора данных **Stack Overflow** в parquet формат c помощью Apache Spark. 

2. Сформировать отчёт с информацией о частоте обсуждения 10 наиболее популярных языков программирования 
в каждом году с 2010 года по сегодняшний день. Используйте теги входящие в список языков 
перечисленных в википедии https://en.wikipedia.org/wiki/List_of_programming_languages. 

Для выполнения задания вы можете использовать любую комбинацию Spark API: **RDD API**, **Dataset API**, **SQL API**. 

## Набор данных

Архивы сайтов **Stack Exchange** доступны по адресу https://archive.org/details/stackexchange.

В папке `data` данного репозитория вам доступны:
- выборка данных `posts_sample.xml`,
- файл со списком языков `programming-languages.csv`, собранных с вики-страницы.

Рекомендуется отлаживать решение на небольшой выборке данных `posts_sample.xml`. Данная выборка была получена следующим кодом:
```
 sc.textFile("/user/mapr/posts.xml").mapPartitions(_.take(100))
```

## Ссылки на источники
  1. https://spark.apache.org/docs/latest/sql-programming-guide.html
  2. http://timepasstechies.com/spark-dataset-api-examples-tutorial-20/
  3. https://jaceklaskowski.gitbooks.io/mastering-spark-sql/
  4. https://en.wikipedia.org/wiki/OLAP_cube
  5. http://homepage.cs.latrobe.edu.au/zhe/ZhenHeSparkRDDAPIExamples.html
