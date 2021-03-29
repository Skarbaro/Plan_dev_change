/*!
 * Get all of an element's parent elements up the DOM tree
 * (c) 2019 Chris Ferdinandi, MIT License, https://gomakethings.com
 * @param  {Node}   elem     The element
 * @param  {String} selector Selector to match against [optional]
 * @return {Array}           The parent elements
 */
var getParents = function (elem, selector) {

	// Setup parents array
	var parents = [];

	// Get matching parent elements
	while (elem && elem !== document) {

		// If using a selector, add matching parents to array
		// Otherwise, add all parents
		if (selector) {
			if (elem.matches(selector)) {
				parents.push(elem);
			}
		} else {
			parents.push(elem);
		}

		// Jump to the next parent node
		elem = elem.parentNode;

	}

	return parents;

};