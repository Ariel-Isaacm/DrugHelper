function calculate(){
  var age= $("#age").val();
  var weigth=$("#weigth").val();
  var minDos=25;
  var maxDos=50;
  var intervalo=6;
  minDos=minDos*weigth/((24)/intervalo);
  maxDos=maxDos*weigth/((24)/intervalo);
  minDos=minDos*5/250;
  maxDos=maxDos*5/250;
  console.log("La dosis recomendada son de: "+minDos+" ml - "+maxDos+" ml cada "+intervalo+" horas");
  Materialize.toast("La dosis recomendada son de: "+minDos+" ml - "+maxDos+" ml cada "+intervalo+" horas", 6000,'rounded')
}
$(document).ready(function() {
    $('select').material_select();
});
