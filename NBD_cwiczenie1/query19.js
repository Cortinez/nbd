printjson(db.cwiczenie1.update(
  {"first_name": "Antonio"},
  {
    $set: {
      "hobby": "pingpong"
    }
  },
  {"multi": true}
))