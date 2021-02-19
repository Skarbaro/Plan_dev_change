/*!
 * https://vanillajstoolkit.com/helpers/qs/
 * Get the first matching element in the DOM
 * (c) 2019 Chris Ferdinandi, MIT License, https://gomakethings.com
 * @param  {String} selector The element selector
 * @param  {Node}   parent   The parent to search in [optional]
 * @return {Node}            The element
 */
var $ = function (selector, parent) {
    return (parent ? parent : document).querySelector(selector);
};