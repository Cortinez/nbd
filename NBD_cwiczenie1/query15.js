printjson(db.cwiczenie1.find( { birth_date: { "$gt":"1999-12-31T23:59:59.99Z"}}, { "first_name": 1, "last_name": 1, "location.city": 1 } ).toArray())