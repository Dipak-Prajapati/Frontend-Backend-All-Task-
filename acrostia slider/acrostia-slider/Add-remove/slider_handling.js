$(document).on('ready', function () {
    //var i = 2;
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
    // removing slides//
    var get = localStorage.getItem("storagedel");
    localStorage.removeItem("storagedel");

    // for adding image and video// 
    for (let j = 0; j < localStorage.length; j++) {

        var key = localStorage.key(j);
        var value = localStorage[key];
        if (value.match((new RegExp(get)))) {
            txtfunction();
        }
        else {
            if (key.match(/add/)) {
                imgfunction();
            }

            else if (key.match(/vid/)) {
                videofunction();
            }

            else if (key.match(/storagepar/)) {
                adfunction();
            }
            else {
                return;
            }
        }
    }
    function imgfunction() {
        var value = localStorage[key];
        $('.variable').slick('slickAdd', value);
        slideIndex++;
    }
    function videofunction() {
        var value = localStorage[key];
        $('.variable').slick('slickAdd', value);
        slideIndex++;
    }
    function txtfunction() {
        localStorage.removeItem("" + key + "");
    }
    function adfunction() {
        var value = localStorage[key];
        $('.variable').slick('slickAdd', value);
        slideIndex++;
    }
});