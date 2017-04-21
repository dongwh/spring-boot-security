/**
 * 国际化资源文件加载
 * 
 */
$(document).ready(function () {
	loadProperties();
});

function loadProperties(){
	jQuery.i18n.properties({//加载资浏览器语言对应的资源文件
		name:'i18n', //资源文件名称
		path:'i18n/', //资源文件路径
		mode:'map', //用Map的方式使用资源文件中的值
		callback: null//加载成功后设置显示内容
	});
}