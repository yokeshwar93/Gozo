/*
 * Author: Sławomir Netteria.NET https://netteria.net
 */
$('#vidBox').css("display", "none");
$('#vidBox').append('<div id="opct"></div>');
$('#opct').css("background", "#000000");
$('#vidBox').css("z-index", "100001");
$('#vidBox').css("position", "fixed")
$('#vidBox').css("top", "0");
$('#vidBox').css("bottom", "0");
$('#vidBox').css("right", "0");
$('#vidBox').css("left", "0");
$('#vidBox').css("padding", "auto");
$('#vidBox').css("text-align", "center");
$('#vidBox').css("background", "none");
$('#vidBox').css("vertical-align", "vertical-align");
$("#videCont").css("z-index", "100002");
$('#vidBox').append('<div id="closer_videopopup">&otimes;</div>');
$("#video-trigger").on('click', function() {
    $('#vidBox').show();
    $('#demo').trigger('play');

});
$("#closer_videopopup").on('click', function() {

    $('#vidBox').hide();
});

$('#vidBox1').css("display", "none");
$('#vidBox1').append('<div id="opct1"></div>');
$('#opct1').css("background", "#000000");
$('#vidBox1').css("z-index", "100001");
$('#vidBox1').css("position", "fixed")
$('#vidBox1').css("top", "0");
$('#vidBox1').css("bottom", "0");
$('#vidBox1').css("right", "0");
$('#vidBox1').css("left", "0");
$('#vidBox1').css("padding", "auto");
$('#vidBox1').css("text-align", "center");
$('#vidBox1').css("background", "none");
$('#vidBox1').css("vertical-align", "vertical-align");
$("#videCont1").css("z-index", "100002");
$('#vidBox1').append('<div id="closer_videopopup1">&otimes;</div>');
$("#video-trigger1").on('click', function() {
    $('#vidBox1').show();
    $('#demo1').trigger('play');

});
$("#closer_videopopup1").on('click', function() {


    $('#vidBox1').hide();
});

$('#vidBox2').css("display", "none");
$('#vidBox2').append('<div id="opct2"></div>');
$('#opct2').css("background", "#000000");
$('#vidBox2').css("z-index", "100001");
$('#vidBox2').css("position", "fixed")
$('#vidBox2').css("top", "0");
$('#vidBox2').css("bottom", "0");
$('#vidBox2').css("right", "0");
$('#vidBox2').css("left", "0");
$('#vidBox2').css("padding", "auto");
$('#vidBox2').css("text-align", "center");
$('#vidBox2').css("background", "none");
$('#vidBox2').css("vertical-align", "vertical-align");
$("#videCont2").css("z-index", "100002");
$('#vidBox2').append('<div id="closer_videopopup2">&otimes;</div>');
$("#video-trigger2").on('click', function() {
    $('#vidBox2').show();
    $('#demo2').trigger('play');

});
$("#closer_videopopup2").on('click', function() {


    $('#vidBox2').hide();
});