$(document).ready(function (){
    $("#boton-guardar").click(function(){
       $.ajax({
          url: 'prueba',
          method: 'POST',
          data:{
             nombre: $('#nombre').val(),
             email: $('#email').val(),
             login: $('#login').val(),
             password: $('#password').val()
             
          },
            success: function (datos) {
                $('#guaresp').html(datos);
            },
            failure: function (){
                
            }
       });
    });
});

