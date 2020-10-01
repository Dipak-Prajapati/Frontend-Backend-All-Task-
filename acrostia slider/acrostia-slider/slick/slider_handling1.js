var parellel_key = 1;
var key = 1;
var sp_index = 1;
var i = 2;
var slideIndex = 1;
var op_index = 1;
var set_img_pre;
var temp;

$(window).on('load', function () {

  for (let i = 0; i < sessionStorage.length; i++) {

    var tmp_key = sessionStorage.key(i);
    var value = sessionStorage[tmp_key];

    if (tmp_key.match(/preview/)) {
      $("#output").append(value);
    }
  }
});

// for adding slides image and video

$('.add-slide').on('click', function () {

  var str1 = $('#file_image').val();
  var name = str1.slice(12);
  set_img_pre = '<div id="output' + op_index + '" class="js-remove-slide" onClick=getId(this)> <img src="images/' + name + '"/> <p id="imgname">' + name + '</p> <i  class="fa fa-trash " aria-hidden="true" ></i><hr></div>';
  sessionStorage.setItem("storepreview" + sp_index + "", set_img_pre);
  sp_index++;

  $("#output").append(set_img_pre);
  op_index++;

  var extension = name.split(".").pop();

  var radioValue = $("input[name='option']:checked").val();
  //alert(radioValue);
  // if (parallel_text.val() != null && parallel_text.val() != '') {
  if(radioValue == "parallel_text"){
    var parallel_text = $("#first").val();
    //alert("parallel Text :" + parallel_text);
    var img = '<div class="img-text"><h1 class="text-slider">' + parallel_text + '</h1><div class="imges"><img src="images/' + name + '"/></div>';
    slideIndex++;
    localStorage.setItem("storageparellel" + parellel_key + "", img);
    parellel_key++;
  }
  else {
    if (extension.match(/png|jpeg|jpg/)) {
      // if (center_text.val() != null && center_text.val() != '') {
        if(radioValue == "center_text"){
        var center_text = $("#first").val();
        //alert("center Text:" + center_text);
        var img = '<div class="img-item"><div class="text"><P id="p' + i + '">' + center_text + '</P></div><img src="images/' + name + '"/></div>';
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
      videofunction();
      function videofunction() {
        var video_name = str1.slice(12);
        var video = '<div class="img-item"><iframe src="images/' + video_name + '"/></iframe></div>';
        slideIndex++;
        localStorage.setItem("storagevid" + key + "", video);
        key++;
      }
    }
  }

});
//removing slides
function getId(e) {
  var id = $(e).attr('id');
  var sd = $("#" + id).text();
  var sd = sd.trim();

  temp = localStorage.setItem("storagedel", sd);
  $("#" + id).remove();
  slideIndex--;
  sremove();
}

function sremove() {

  for (let i = 0; i < sessionStorage.length; i++) {

    var tmp_key2 = sessionStorage.key(i);
    var value2 = sessionStorage[tmp_key2];

    if (value2.match((new RegExp(temp)))) {

      sessionStorage.removeItem("" + tmp_key2 + "");
    }
  }
}
