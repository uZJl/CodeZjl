Action()
{

	web_add_cookie("Idea-29faa48e=048d51ff-c7eb-463e-93f7-b5e28a992ef7; DOMAIN=localhost");

	web_url("index.html", 
		"URL=http://localhost:8080/DBed/index.html", 
		"Resource=0", 
		"Referer=", 
		"Snapshot=t1.inf", 
		"Mode=HTML", 
		EXTRARES, 
		"Url=image", ENDITEM, 
		"Url=imageShow?imageId=19", ENDITEM, 
		"Url=imageShow?imageId=20", ENDITEM, 
		"Url=imageShow?imageId=22", ENDITEM, 
		"Url=imageShow?imageId=21", ENDITEM, 
		"Url=imageShow?imageId=26", ENDITEM, 
		LAST);

	lr_rendezvous("upload_zvous");

	lr_think_time(9);

	lr_start_transaction("upload_transaction");

	web_submit_data("image", 
		"Action=http://localhost:8080/DBed/image", 
		"Method=POST", 
		"EncType=multipart/form-data", 
		"RecContentType=application/json", 
		"Referer=http://localhost:8080/DBed/index.html", 
		"Snapshot=t3.inf", 
		"Mode=HTML", 
		ITEMDATA, 
		"Name=uploadImage", "Value=F://CodeZjl//TESTTEST//0630Test2//pic//sdfassffffffffffffffffffffffffffffffffffffffffffffffffffffffffff.jpg", "File=Yes", ENDITEM, 
		LAST);
	
	lr_end_transaction("upload_transaction",LR_AUTO);

	return 0;
}