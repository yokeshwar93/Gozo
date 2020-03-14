$(document).ready(function() {
    $('#resonse_message').hide();
    $('#name').on('focus', function() {
        $('#name').removeClass('error');
    })
    $('#email').on('focus', function() {
        $('#emai').removeClass('error');
    })
    $('#message').on('focus', function() {
        $('#message').removeClass('error');
    })
    $('#submit').on('click', function() {
        var name = $('#name').val();
        var email = $('#email').val();
        var message = $('#message').val();

        if (name && email && message) {
            $.ajax({
                type: 'POST',
                url: '/sendmessage?email=' + email + '&name=' + name + '&message=' + message,
                success: function(data) {
                    $('#resonse_message').show();
                },
            })
        } else {
            if (!name) {
                $('#name').addClass('error');
            } else {
                $('#name').removeClass('error');
            }
            if (!email) {
                $('#email').addClass('error');
            } else {
                $('#email').removeClass('error');
            }
            if (!message) {
                $('#message').addClass('error');
            } else {
                $('#message').removeClass('error');
            }
        }
    })
});