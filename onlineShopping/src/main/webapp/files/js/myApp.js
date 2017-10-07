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
		$('#a_'+menu).addClass('active');
		break;
	}
});