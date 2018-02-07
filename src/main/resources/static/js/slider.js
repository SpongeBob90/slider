$(function () {
    $('.horizontal .mark').bind("click",function () {
        $(this).parent().toggleClass("expand").siblings().removeClass("expand");
    });
});