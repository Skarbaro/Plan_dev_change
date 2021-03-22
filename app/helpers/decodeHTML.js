/**
 * Decode HTML entities from an encoded string
 * https://stackoverflow.com/a/7394787/1293256
 * @param  {String} html The encoded HTML string
 * @return {String}      A decoded HTML string
 */
var decodeHTML = function (html) {
	var txt = document.createElement('textarea');
	txt.innerHTML = html;
	return txt.value;
};