$(function(){
	$("#loginbutton").click(function(){
		var username = $("input[name='username']").val();
		var password = $("input[name='password']").val();
		if(username==""||password==""){
			$("#msg").html("请填写完整用户名密码");
			return false;
		}else{
			$("#form1").submit();
		}
	})
})
