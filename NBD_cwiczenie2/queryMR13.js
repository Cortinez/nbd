printjson(db.cwiczenie1.mapReduce(
    function() { emit(this.job, "") },
    function(key, values) { return "" },
    { out: { inline: 1 } }
).results)