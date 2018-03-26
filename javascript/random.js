/*
  Some examples, typcially use for setting postman variables which can then be sent up in parameterised requests.
*/

var currDate = new Date();
postman.setGlobalVariable('eventTime', (currDate).toISOString());
postman.setGlobalVariable('lastName', buildRandomString(10));
postman.setGlobalVariable('fltNo', buildRandomNumber(4));
postman.setGlobalVariable('seatNo', buildRandomNumber(2)+buildRandomString(1));

function buildRandomString(length) {
  var text = "";
  var possible = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
  for (var i = 0; i < length; i++)
    text += possible.charAt(Math.floor(Math.random() * possible.length));
  return text;
}

function buildRandomNumber(length) {
  var text = "";
  var possible = "0123456789";
  for (var i = 0; i < length; i++)
    text += possible.charAt(Math.floor(Math.random() * possible.length));
  return text;
}