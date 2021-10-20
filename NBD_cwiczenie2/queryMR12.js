printjson(db.cwiczenie1.mapReduce(
    function () { this.credit.forEach(e => emit(e.currency, parseFloat(e.balance))) },
    function (key, values) { return Array.sum(values) },
    { out: { inline: 1 } }
))