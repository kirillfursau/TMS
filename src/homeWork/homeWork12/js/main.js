// $('Field').submit(function () {
//     var str = "кино";
$(document).on('click', '#submit-btn', function (e) {
    e.preventDefault();
    var text = document.getElementsByTagName("input")[0];
    var val = text.value;
    $.ajax({
        type: "GET",
        url: 'https://api.themoviedb.org/3/search/multi?language=ru-RU&api_key=5ffb6f8846617f59fd811710ba742559',
        data: {query: val},
        success: function (data) {
            console.log('запрос успешно получен');
            console.log(data);
            $('div').empty();
            data.results.forEach(el => {
                const name = document.createElement("film");
                name.src = el.title;
                if (el.title != null) {
                    $('#films').append('Name = ' + el.title + ', Type  = ' + el.media_type + "<br>");
                } else {
                    $('#films').append('Name = ' + el.name + ', Type  = ' + el.media_type + "<br>");
                }
            });
            jQuery('body').append('<a href="https://www.google.com/">For more info go to google</a>');
        }
    });
// jQuery('document').ready(function () {
});
// });
