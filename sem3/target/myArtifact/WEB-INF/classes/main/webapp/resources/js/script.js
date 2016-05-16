/**
 * Created by zamkovoyilya on 16/05/16.
 */
function showFlights(){
    $.ajax({
        url:"/stat/show",
        method:"GET",
        data:{"from":$("#from").val(),"to":$("#to").val()},
        dataType : 'json',
        contentType: 'application/json',
        mimeType:'application/json',
        success:function(resp){
            $("#res").text("")
            for (var i = 0;i < resp.length;i++){
                $("#res").append("<tr> <td>"+ resp[i].fromDirection +"</td><td>" + resp[i].departureTime + "</td>"+
                    "<td>" + resp[i].toDirection+"</td><td>" + resp[i].arrivingTime + "</td></tr>")
            }
        }
    })
}