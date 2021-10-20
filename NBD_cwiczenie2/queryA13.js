printjson(db.cwiczenie1.aggregate([
    { $group: { _id: "job", "jobs": {$addToSet: "$job" } } },
    { $project: {"jobs": 1, _id: 0}}
]).toArray())