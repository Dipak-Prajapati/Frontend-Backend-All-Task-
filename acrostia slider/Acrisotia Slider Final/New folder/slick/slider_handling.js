$(document).on('ready', function () {
    //var i = 2;
    call();
    var slideIndex = 1;
    $(".variable").slick({
        dots: true,
        infinite: true,
        speed: 100,
        fade: true,
        cssEase: 'linear',
        autoplay: true,
        speed: 100,
        fade: true,
        cssEase: 'linear'
    });

    
    function call()
    {

        var counter = 1;
        for(let j=0; j<localStorage.length; j++)
        {
            var value = localStorage.getItem("storageadd"+counter);
            counter++;
            if(value==null){
                j--;
                continue;

            }
            $('.variable').append(value);
            slideIndex++;
        }


  }
});
