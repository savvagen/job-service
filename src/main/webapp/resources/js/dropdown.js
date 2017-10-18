var jsonurl = 'http://localhost:8081/status';
$.ajax({
    type: 'GET',
    url: jsonurl,
    data: {},
    success:function(data){
        var options = $("#status");
        $.each(data, function () {
            options.append($("<option />").val(this.status_id).text(this.status));
        });
    },
    error:function(){
    }
});

$('#myDropdown').ddslick({
    data : jsonurl,
    width : 300,
    selectText : "Select status",
    imagePosition : "right",
    onSelected : function(selectedData) {
        //callback function: do something with selectedData;
    }
});