/**
 * Test if the browser supports input[type="date"]
 * @return {Boolean} Returns true if it's supported
 */
function isDateSupported () {
	let input = document.createElement('input');
	let value = 'a';
	input.setAttribute('type', 'date');
	input.setAttribute('value', value);
	return (input.value !== value);
}