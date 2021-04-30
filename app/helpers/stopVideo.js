/**
 * Stop an iframe or HTML5 video from playing
 * (c) 2021 Chris Ferdinandi, MIT License, https://gomakethings.com
 * @param  {Node} element The parent element the video is in
 */
function stopVideo (element) {
	let iframe = element.querySelector('iframe');
	let video = element.querySelector('video');
	if (iframe !== null) {
		let iframeSrc = iframe.src;
		iframe.src = iframeSrc;
	}
	if (video !== null) {
		video.pause();
	}
}