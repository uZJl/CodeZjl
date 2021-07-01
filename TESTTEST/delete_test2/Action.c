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
		LAST);

	web_url("iplookup.php", 
		"URL=http://int.dpool.sina.com.cn/iplookup/iplookup.php?format=json&_=1625101775774", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=", 
		"Snapshot=t2.inf", 
		"Mode=HTML", 
		LAST);

	lr_rendezvous("delete_zvous");

	lr_start_transaction("delete_transaction");

	web_custom_request("image", 
		"URL=http://localhost:8080/DBed/image?imageId=19", 
		"Method=DELETE", 
		"Resource=0", 
		"RecContentType=application/json", 
		"Referer=http://localhost:8080/DBed/index.html", 
		"Snapshot=t3.inf", 
		"Mode=HTML", 
		LAST);

	lr_end_transaction("delete_transaction",LR_AUTO);

	return 0;
}