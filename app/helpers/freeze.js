/*!
 * Freeze a multi-dimensional array or object
 * (c) 2021 Chris Ferdinandi, MIT License, https://gomakethings.com
 * @param  {Array|Object} obj The array or object to freeze
 * @return {Array|Object}     The frozen array or object
 */
function freeze (obj) {

	// Get object type
	let type = Object.prototype.toString.call(obj).slice(8, -1).toLowerCase();

	/**
	 * Check if the item is an array or object
	 * @param  {Array|Object}  item The item to check
	 * @return {Boolean}            If true, item is an array or object
	 */
	function isArrOrObj (item) {
		return ['array', 'object'].includes(Object.prototype.toString.call(item).slice(8, -1).toLowerCase());
	}

	// If an object, recursively freeze
	if (type === 'object') {
		for (let key in obj) {
			if (Object.prototype.hasOwnProperty.call(obj, key)) {
				if (isArrOrObj(obj[key])) {
					freeze(obj[key]);
				}
			}
		}
	}

	// If an array, recursively freeze
	if (type === 'array') {
		for (let item of obj) {
			if (isArrOrObj(item)) {
				freeze(item);
			}
		}
	}

	// Freeze and return the object
	return Object.freeze(obj);

}