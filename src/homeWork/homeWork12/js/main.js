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
            $('#myTable').empty();
            // $('#myTable').append('<tr id=tr_' + el.title + '><td>overview</td></tr>');
            data.results.forEach(el => {
                const name = document.createElement("film");
                name.src = el.title;
                if (el.title != null) {
                    // $("#myTable > tbody").append("<tr><td>row content</td></tr>");
                    $('#myTable').append('<tr id=tr_' + el.title + '><td>' + el.title + '</td><td>'
                        + el.media_type + '</td><td>' + el.overview+ '</td></tr>');
                    // $('#myTable').after('<tr>' + el.title + '</tr><tr>' + el.media_type + '</tr>');
                } else {
                    $('#myTable').append('<tr id=tr_' + el.name + '><td>' + el.name + '</td><td>'
                        + el.media_type + '</td><td>' + el.overview+ '</td></tr>');
                }
            });
            jQuery('#films').append('<a href="https://www.google.com/" style="font-size: 18px">For more info go to google</a>');
        }
    });
// jQuery('document').ready(function () {
});
$(document).on('click', '#clear-btn', function (e) {
    $('#myTable').empty();
});
// });
