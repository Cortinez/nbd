printjson(db.cwiczenie1.insertOne(
{ sex: 'Male',
  first_name: 'Oscar',
  last_name: 'Zimowski',
  job: 'Speech Pathologist',
  email: 'skatepark245@gmail.com',
  location: 
   { city: 'Berlin',
     address: { streetname: 'Groblid', streetnumber: '96' } },
  description: 'macho jackson mafia taks que ve pasant ot zaka lka',
  height: '234.23',
  weight: '192.30',
  birth_date: '1993-05-19T07:32:08Z',
  nationality: 'Germany',
  credit: 
   [ { type: 'switch',
       number: '6759888929874568699',
       currency: 'EUR',
       balance: '42000346000.54' } ] }
))