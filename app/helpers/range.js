/*!
 * Create a range of numbers
 * Adapted with permission from Darren Jones, https://www.amazon.com/Learn-Code-JavaScript-Darren-Jones/dp/1925836401
 * (c) 2021 Chris Ferdinandi, MIT License, https://gomakethings.com
 * @param  {Number} min The first number in the range
 * @param  {Number} max The last number in the range
 * @return {Array}      The range
 */
function range (min, max) {

	// If only one number is provided, start at one
	if (max === undefined) {
		max = min;
		min = 1;
	}

	// Create a ranged array
	return Array.from(new Array(max - min + 1).keys()).map(function (num) {
		return num + min;
	});

}