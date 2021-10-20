//height zamienne z weight
db.cwiczenie1.find({height: {$exists: true}}).forEach(function(obj) { 
  obj.height = parseFloat(obj.height);
  db.cwiczenie1.save(obj);
});