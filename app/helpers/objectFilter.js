/*!
 * Create a new object composed of properties that meet specific criteria
 * (c) 2021 Chris Ferdinandi, MIT License, https://gomakethings.com
 * @param  {Object}   obj      The original object
 * @param  {Function} callback The callback test to run
 * @return {Object}            The new, filtered object
 */
function objectFilter (obj, callback) {

	// Setup a new object
	let filtered = {};

	// Loop through each item in the object and test it
	for (let key in obj) {
		if (Object.prototype.hasOwnProperty.call(obj, key)) {

			// If the callback validates true, push item to the new object
			if (callback(obj[key], key, obj)) {
				filtered[key] = obj[key];
			}

		}
	}

	// Return the new object
	return filtered;

}