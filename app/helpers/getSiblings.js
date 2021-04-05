/*!
 * Get all siblings of an element
 * (c) 2021 Chris Ferdinandi, MIT License, https://gomakethings.com
 * @param  {Node}  elem The element
 * @return {Array}      The siblings
 */
function getSiblings (elem) {
	return Array.from(elem.parentNode.children).filter(function (sibling) {
		return sibling !== elem;
	});
}