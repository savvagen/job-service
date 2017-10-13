/*
$(document).ready(function() {
    $.ajax({
        url: "http://rest-service.guides.spring.io/greeting"
    }).then(function(data) {
        $('.greeting-id').append(data.id);
        $('.greeting-content').append(data.content);
    });
});*/


$(document).ready(function() {
    $.ajax({
        url: "http://localhost:8081/greeting/hello?name=Savva"
    }).then(function(data) {
        $('.greeting-id').append(data.id);
        $('.greeting-content').append(data.message);
    });
});
