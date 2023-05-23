$(function() {
    $('#searchForm').on('submit', function(e) {
        e.preventDefault();
        $.get('bike-servlet', $(this).serialize()).done(function(data) {
            $('#results').empty();
            data.forEach(function(bike) {
                let bikeElement = $('<div>').addClass('bike');
                bikeElement.append($('<h2>').text(bike.company.name + ' ' + bike.model));
                bikeElement.append($('<img>', {src: bike.imageUrl, width: 600, height: 400}).attr('src', bike.imageURL));
                bikeElement.append($('<p>').text('Size: ' + bike.size));
                bikeElement.append($('<p>').text('Price: ' + bike.price));
                bikeElement.append($('<p>').text('Weight: ' + bike.weight));
                bikeElement.append($('<p>').text('Equipment: ' + bike.equipment));
                bikeElement.append($('<p>').text('Description: ' + bike.description));
                $('#results').append(bikeElement);
            });
        });
    });
});