


var ley = 1;
var key = 1;
var sey = 1;
var i = 2;
var slideIndex = 1;
var j = 1;
var see = 1;
var set;
var gdp;

// var ary = [];


$(window).on('load', function () {

  for (let i = 0; i < sessionStorage.length; i++) {

    var kee = sessionStorage.key(i);
    var value = sessionStorage[kee];

    if (kee.match(/preview/)) {
      $("#output").append(value);

    }
  }

});









// for adding slides image and video

$('.add-slide').on('click', function () {

  var str1 = $('#image').val();
  var name = str1.slice(12);
  set = '<div id="output' + j + '" class="js-remove-slide" onClick=getId(this)> <img src="images/' + name + '"/> <p id="imgname">' + name + '</p> <i  class="fa fa-trash " aria-hidden="true" ></i><hr></div>';
  sessionStorage.setItem("storepreview" + sey + "", set);
  sey++;

  $("#output").append(set);

  j++;

  var last = name.split(".").pop();
  var r = confirm("do you want to add text parallel to image?");


  if (r == true) {

    var t = prompt("add some text!!");



    var img = '<div class="img-text"><div class="texy">' + t + '</div><div class="imges"><img src="images/' + name + '"/></div>';

    slideIndex++;
    localStorage.setItem("storagead" + ley + "", img);
    ley++;


  }

  else {

    if (last.match(/png|jpeg/)) {

      var d = confirm("do you want to add some text on image?");

      if (d == true) {
        // alert(i);
        var a = $("#first").val();
        // alert(a  +'added'); 
        // $("#p"+i+"").html(a);
        var img = '<div class="img-item"><div class="text"><P id="p' + i + '">' + a + '</P></div><img src="images/' + name + '"/></div>';

      }

      else {
        var img = '<div class="img-item "><div class="text"><P id="p' + i + '"></P></div><img src="images/' + name + '"/></div>';
      }

      i++;
      slideIndex++;
      localStorage.setItem("storageadd" + key + "", img);
      key++;


    }
    else {

      myfunction();
      function myfunction() {
        var fame = str1.slice(12);
        var video = '<div class="img-item"><iframe src="images/' + fame + '"/></iframe></div>';
        slideIndex++;
        localStorage.setItem("storagevid" + key + "", video);
        key++;




      }

    }

  }
  // alert(ary[0]);
  // alert(ary[1]);

});







//removing slides



function getId(e) {
  alert("sure delete?")
  var id = $(e).attr('id');
  var sd = $("#" + id).text();
  var sd = sd.trim();

  gdp = localStorage.setItem("storagedel", sd);
  $("#" + id).remove();
  slideIndex--;
  sremove();
}


function sremove() {

  for (let i = 0; i < sessionStorage.length; i++) {

    var kee = sessionStorage.key(i);
    var value = sessionStorage[kee];

    if (value.match((new RegExp(gdp)))) {

      sessionStorage.removeItem("" + kee + "");
    }



  }
}


// });


