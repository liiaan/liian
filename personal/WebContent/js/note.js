function submitComment(arid){
	var commentId = '#'+arid;
	var comment = $(commentId).val();
	var uid = $("#id").val();
	$.post('subComment',
			{"id":uid,"arid":arid,"comment":comment},
			function(result){
				var m = eval('('+result+')');
				$("#comment > div").remove();
				for(var i = 0;i<m.length;i++){
					var newDiv = '<div>'
				                +'<p>'+m[i].comuser+':</p><p>'+m[i].comment+'</p>'
				                +'<p>'+m[i].ccreatetime+'</p>'
				                +'</div>';
					$("#comment").append(newDiv);
				}
			})
}