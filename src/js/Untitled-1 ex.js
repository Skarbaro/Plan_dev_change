const invUser_selector = ':nth-child(1) > .col-user > .cq-avatar > .cq-avatar-username > .cq-avatar-username-login';
const userOptions_xpath = 'img[src$="/images/menu-options-dark.svg"]';
const deleteInvUser_selector = '.dropdown-menu > :nth-child(2) > span';

const select_projects = '#projects > .css-vj8t7z > .css-1hwfws3';
const permissions_selector = '#permissions > .css-vj8t7z > .css-1hwfws3';
const back_button_withInviteForm = '.pl-0 > .btn';

/*!
 * Convert a timestamp into a date
 * (c) 2019 Chris Ferdinandi, MIT License, https://gomakethings.com
 * @param   {String|Integer}  timestamp  The timestamp in unix of YYYY-MM-DD HH:MM:SS format
 * @returns {String}                     A formatted date
 */
var formatDate = function (timestamp) {

	// Create a date object from the timestamp
	var date = new Date(timestamp);

	// Create a list of names for the months
	var months = ['January', 'February', 'March', 'April', 'May', 'June', 'July', 'August', 'September', 'October',	'November', 'December'];

	// return a formatted date
	return months[date.getMonth()] + ' ' + date.getDate() + ', ' + date.getFullYear();

};