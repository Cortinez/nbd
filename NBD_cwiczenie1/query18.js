printjson(db.cwiczenie1.update(
  {"location.city": "Moscow"},
  {
    $set: {
      "location.city": "Moskwa"
    }
  },
  {"multi": true}
))