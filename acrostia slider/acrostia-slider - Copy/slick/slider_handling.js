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
    var img = new Array();
    var img2 = new Array();
    var key_name = new Array();
    var key;
    var temp;

    for (let i = 0; i < localStorage.length; i++) {
        img.push(localStorage.key(i));
    }

    for (let a = 0; a < img.length; a++) {
        // for (let b = a + 1; b <= img.length; b++) {
        img2[a] = img[a].slice(-1);
        img[a] = img[a].slice(0, -1);
        //  }
    }
    console.log(JSON.stringify(img));
    //document.write(JSON.stringify(img2));
    for (var i = 0; i < img.length; i++) {
        for (var k = i + 1; k < img.length; k++) {
            if (img2[i] > img2[k]) {
                temp = img2[i];
                img2[i] = img2[k];
                img2[k] = temp;
            }
        }
        key_name[i] = img[i] + img2[i];
        console.log(key_name);
    }
 
    var get = localStorage.getItem("storagedel");
    localStorage.removeItem("storagedel");

    // for adding image and video// 
    for (let j = 0; j < localStorage.length; j++) {

        var key = key_name[j];
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
        var remove_Item = key;

        console.log('Array before removing the element = ' + key_name);
        key_name = $.grep(key_name, function (value) {
            return value != remove_Item;
        });
        console.log('Array after removing the element = ' + key_name);
    }
    function adfunction() {
        var value = localStorage[key];
        $('.variable').slick('slickAdd', value);
        slideIndex++;
    }
});