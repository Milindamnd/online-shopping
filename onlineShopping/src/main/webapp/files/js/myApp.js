$(function(){
	switch(menu){
	case 'About Us':
		$('#about').addClass('active');
		break;
		
	case 'View Products':
		$('#product').addClass('active');
		break;
	
	case 'Contact Us':
		$('#contact').addClass('active');
		break;
		
	case 'Manage Products':
		$('#manageProduct').addClass('active');
		break;
	default:
		if(menu == '#home') break;
		$('#product').addClass('active');
		$('#a_'+ menu).addClass('active');
		break;
	}
	var $table=$('#productListTable');
	
	if($table.lenght){
		var jsonURL='';
		if(window.categoryId ==''){
			jsonURL = window.contextRoot +'/json/data/all/products';
		}else{
			jsonURL = windown.contextRoot +'/json/data/category/'+window.categoryId+'/products';
			
		}
		$table.DataTable({
			
			ajax:{
				url :jsonURL,
				dataSrc=''
			},
			columns:[
				
				{
					data: 'name'
				},
				{
					data: 'brand'
				},
				{
					data: 'unitPrice'
				},
				{
					data: 'qty'
				}
			]
			
		});
		
	}
	
	//alert dismiss auto after 3 secound
	var $alert=$('.alert');
	if($alert.length){
		setTimeout(function(){
			$alert.fadeOut('slow');
			
		},3000)
	}

});