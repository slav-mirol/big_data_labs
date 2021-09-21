### SF Bay Area Bike Share

https://www.kaggle.com/benhamner/sf-bay-area-bike-share

stations.csv  
trips.csv  

### Stack Overflow Data Dump

https://archive.org/details/stackexchange

posts_sample.xml

```
sc.textFile("posts.xml").mapPartitions(_.take(1000)).repartition(1).saveAsTextFile("posts_sample.xml")
```

### New York City Taxi Data(2010-2013)

https://databank.illinois.edu/datasets/IDB-9610843 или https://uofi.app.box.com/v/NYCtaxidata 

nyctaxi.csv   
схема: https://uofi.app.box.com/v/NYCtaxidata/file/33670345557

nycTaxiFares.gz   
nycTaxiRides.gz  
схема: https://github.com/apache/flink-training/blob/master/README.md#schema-of-taxi-ride-events

### List of programming languages 

https://en.wikipedia.org/wiki/List_of_programming_languages 

programming-languages.csv
