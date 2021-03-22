/*!
 * Create an expiration date timestamp for use with cookies.
 * (c) 2018 Chris Ferdinandi, MIT License, https://gomakethings.com
 * @param  {Number} time  The amount of time in the future to set the expiration date for
 * @return {String}       The expiration date
 */
 var getExpirationDate = function (time) {
 	return new Date(+new Date() + time).toUTCString();
 };