printjson(db.cwiczenie1.update(
  {"job": "Editor"},
  {
    $unset: {
      "email": 1
    }
  },
  {"multi": true}
))