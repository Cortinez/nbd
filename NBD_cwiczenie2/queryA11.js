printjson(db.cwiczenie1.aggregate([{
        "$group": {
           "_id": "$sex",
           "AverageWeight": {
              "$avg": "$weight"
           },
           "AverageHeight": {
              "$avg": "$height"
           }
        }
}]).toArray())