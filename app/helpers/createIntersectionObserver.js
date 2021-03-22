/*!
 * Create an intersection observer
 * (c) 2021 Chris Ferdinandi, MIT License, https://gomakethings.com
 * @param  {Node}     elem     The element to observe
 * @param  {Function} callback The callback function to run
 * @param  {Object}   options  The options, if any
 */
function createIntersectionObserver (elem, callback, options) {
	let observer = new IntersectionObserver(callback, options || {});
	observer.observe(elem);
	return observer;
}