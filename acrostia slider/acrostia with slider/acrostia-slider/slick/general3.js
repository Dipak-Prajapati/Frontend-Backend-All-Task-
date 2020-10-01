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
    function call(){
        for(var i=1; i<= localStorage.length; i++){
            var key=localStorage.getItem("storageadd"+i);
            if(key==null){
                continue;
            }
            $('.variable').append(key);
        }
    }
});