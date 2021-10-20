printjson(db.cwiczenie1.aggregate([
    { 
        $addFields: {
            weightDecimal: {$convert: { input: "$weight", to: "decimal", onError: Error }},
            heightDecimal: {$convert: { input: "$height", to: "decimal", onError: Error }} 
        }
    },
    { 
        $addFields: {
            bmi: { $divide: [ "$weightDecimal" , { $pow: [ { $divide: ["$heightDecimal", 100]}, 2 ] } ] },
        }
    },
    { $group: { _id: "$nationality",  minBMI: { $min: "$bmi" }, maxBMI: { $max: "$bmi" }, avgBMI: { "$avg": "$bmi" } }}
]).toArray())